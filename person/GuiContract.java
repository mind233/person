package person;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import candidate.Candidate;
import shape1.Circle;
import shape1.Rectangle;
import shape1.Shape;
import shape1.Triangle;

public class GuiContract extends JFrame implements KeyListener  ,  ItemListener, ActionListener,MouseListener{
	private JLabel lbTitle,lbName,lbGender,lbId,lbDate,lbPhone,lbAllowance,lbWage,lbAdress,lbEmail,lbPosition,lbComputeSalary;
	private JTextField txtId,txtName,txtGender,txtPhone,txtEmail,txtAllowance,txtWage,txtDate,txtComputeSalary,txtPosition,txtAdress;
	private Font font = new Font("Tahoma", Font.BOLD, 19);
	private JButton btnAdd,btnDelete,btnSave,btnNew,btnSort,btnExit;
	private Contract a[] = new Contract[100];
	private int n;
	private JTable tableList;
	private JScrollPane scrollPane = new JScrollPane();
	private Vector tableTitle = new Vector();
	private Vector tableRecords = new Vector();

	public GuiContract(){

		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(null);

		//Title
		lbTitle = new JLabel();
		lbTitle.setBounds(430,10,350,30);
		lbTitle.setText("Contract");
		lbTitle.setFont(font);
		this.getContentPane().add(lbTitle);

		//ID
		lbId = new JLabel();
		lbId.setBounds(60,50,120,30);
		lbId.setText("ID ");
		this.getContentPane().add(lbId);

		txtId = new JTextField();
		txtId.setBounds(180,50,250,25);
		this.getContentPane().add(txtId);

		//Name
		lbName = new JLabel();
		lbName.setBounds(60,80,120,30);
		lbName.setText("Full Name ");
		this.getContentPane().add(lbName);

		txtName = new JTextField();
		txtName.setBounds(180,80,250,25);
		this.getContentPane().add(txtName);

		//Gender
		lbGender = new JLabel("Gender");
		lbGender.setBounds(60,110,120,30);
		lbGender.setText("Gender ");
		this.getContentPane().add(lbGender);

		txtGender = new JTextField();
		txtGender.setBounds(180,110,125,25);
		this.getContentPane().add(txtGender);

		//Date
		lbDate = new JLabel();
		lbDate.setBounds(60,140,120,30);
		lbDate.setText("Date Of Birth");
		this.getContentPane().add(lbDate);

		txtDate = new JTextField();
		txtDate.setBounds(180,140,125,25);
		this.getContentPane().add(txtDate);

		//Adress
		lbAdress = new JLabel();
		lbAdress.setBounds(60,170,120,30);
		lbAdress.setText("Adress");
		this.getContentPane().add(lbAdress);

		txtAdress = new JTextField();
		txtAdress.setBounds(180,170,250,25);
		this.getContentPane().add(txtAdress);

		//Phone
		lbPhone = new JLabel();
		lbPhone.setBounds(500,50,120,30);
		lbPhone.setText("Phone Number ");
		this.getContentPane().add(lbPhone);

		txtPhone = new JTextField();
		txtPhone.setBounds(620,50,250,25);
		this.getContentPane().add(txtPhone);

		//Email
		lbEmail = new JLabel();
		lbEmail.setBounds(500,80,120,30);
		lbEmail.setText("Email ");
		this.getContentPane().add(lbEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(620,80,250,25);
		this.getContentPane().add(txtEmail);

		//Position
		lbPosition = new JLabel();
		lbPosition.setBounds(500,110,120,30);
		lbPosition.setText("Position");
		this.getContentPane().add(lbPosition);

		txtPosition = new JTextField();
		txtPosition.setBounds(620,110,250,25);
		this.getContentPane().add(txtPosition);


		//Allowance
		lbAllowance = new JLabel();
		lbAllowance.setBounds(500,140,120,30);
		lbAllowance.setText("Allowance");
		this.getContentPane().add(lbAllowance);

		txtAllowance = new JTextField();
		txtAllowance.setBounds(620,140,250,25);
		this.getContentPane().add(txtAllowance);

		//Wage
		lbWage = new JLabel();
		lbWage.setBounds(500,170,120,30);
		lbWage.setText("Wage");
		this.getContentPane().add(lbWage);

		txtWage = new JTextField();
		txtWage.setBounds(620,170,250,25);
		this.getContentPane().add(txtWage);

		//ComputeSalary
		lbComputeSalary = new JLabel();
		lbComputeSalary.setBounds(500,200,120,30);
		lbComputeSalary.setText("Salary");
		this.getContentPane().add(lbComputeSalary);

		txtComputeSalary = new JTextField();
		txtComputeSalary.setBounds(620,200,250,25);
		this.getContentPane().add(txtComputeSalary);

		//Button add
		btnAdd= new JButton();
		btnAdd.setBounds(330,250,60,25);
		btnAdd.setText("Add");
		this.getContentPane().add(btnAdd);

		//Button delete 
		btnDelete= new JButton();
		btnDelete.setBounds(560,250,80,25);
		btnDelete.setText("Delete");
		this.getContentPane().add(btnDelete);

		//Button Sort
		btnSort= new JButton();
		btnSort.setBounds(480,250,70,25);
		btnSort.setText("Sort");
		this.getContentPane().add(btnSort);

		//Button new
		btnNew= new JButton();
		btnNew.setBounds(250,250,70,25);
		btnNew.setText("New");
		this.getContentPane().add(btnNew);

		//Button Save
		btnSave= new JButton();
		btnSave.setBounds(400,250,70,25);
		btnSave.setText("Save");
		this.getContentPane().add(btnSave);

		//Button exit
		btnExit= new JButton();
		btnExit.setBounds(650,250,70,25);
		btnExit.setText("Exit");
		this.getContentPane().add(btnExit);

		//Tao bang
		tableList = new JTable();
		scrollPane.setViewportView(tableList);
		scrollPane.setBounds(60, 300, 1200, 150);
		tableTitle.add("ID");
		tableTitle.add("FullName");
		tableTitle.add("Gender");
		tableTitle.add("Date");
		tableTitle.add("Adress");
		tableTitle.add("Phone Number");
		tableTitle.add("Email");
		tableTitle.add("Position");
		tableTitle.add("Allowance");
		tableTitle.add("Wage");
		tableTitle.add("Salary");
		tableList.setModel(new DefaultTableModel(tableRecords, tableTitle));
		add(scrollPane);

		//Set mac dinh ban dau


		txtComputeSalary.setEnabled(false);
		txtName.setEnabled(false);
		txtId.setEnabled(false);
		txtAllowance.setEnabled(false);
		txtComputeSalary.setEnabled(false);
		txtEmail.setEnabled(false);
		txtDate.setEnabled(false);

		txtPhone.setEnabled(false);
		txtEmail.setEnabled(false);
		txtGender.setEnabled(false);
		txtPhone.setEnabled(false);
		txtAdress.setEnabled(false);
		txtPosition.setEnabled(false);
		txtAllowance.setEnabled(false);
		txtWage.setEnabled(false);

		//Dang ki su kien

		btnAdd.addActionListener(this);
		btnExit.addActionListener(this);
		btnSort.addActionListener(this);
		btnDelete.addActionListener(this);
		btnNew.addActionListener(this);
		btnSave.addActionListener(this);

		txtId.addKeyListener(this);
		txtName.addKeyListener(this);

		tableList.addMouseListener(this);

		txtPhone.addKeyListener(this);
		txtEmail.addKeyListener(this);
		txtAdress.addKeyListener(this);
		txtGender.addKeyListener(this);
		txtDate.addKeyListener(this);
		txtPosition.addKeyListener(this);
		txtWage.addKeyListener(this);
		txtAllowance.addKeyListener(this);
		txtComputeSalary.addKeyListener(this);

		super.setVisible(true);
	}

	public void readFile() throws FileNotFoundException{
		Scanner kb = new Scanner(new File("C:\\Users\\Minh Dinh\\eclipse-workspace\\20_Homework01_DinhTranCongMinh\\src\\person\\inputContract.txt"));
		int i=0;
		while (kb.hasNextLine()) {
			a[i]=new Contract();
			a[i].setId(kb.nextLine());
			a[i].setFullName(kb.nextLine());
			a[i].setGender(kb.nextLine());
			a[i].setDob(kb.nextLine());
			a[i].setAdress(kb.nextLine());
			a[i].setPhoneNumber(kb.nextLine());
			a[i].setEmail(kb.nextLine());
			a[i].setPosition(kb.nextLine());
			a[i].setAllowance(kb.nextLine());
			a[i].setWage(kb.nextLine());
			i++;
			n=i;
		}
	}
	public void swing() {
		for(int i=0;i<n;i++) {
			txtId.setText(a[i].getId());
			txtName.setText(a[i].getFullName());
			txtGender.setText(a[i].getGender());
			txtDate.setText(a[i].getDob());
			txtAdress.setText(a[i].getAdress());
			txtPhone.setText(a[i].getPhoneNumber());
			txtEmail.setText(a[i].getEmail());
			txtPosition.setText(a[i].getPosition());
			txtAllowance.setText(a[i].getAllowance());
			txtWage.setText(a[i].getWage());
			double b = Double.parseDouble(a[i].getAllowance());
			double c = Double.parseDouble(a[i].getWage());
			double d =b*c;
			txtComputeSalary.setText(d+"");
			Vector record = new Vector();
			record.add(txtId.getText());
			record.add(txtName.getText());
			record.add(txtGender.getText());
			record.add(txtDate.getText());
			record.add(txtAdress.getText());
			record.add(txtPhone.getText());
			record.add(txtEmail.getText());
			record.add(txtPosition.getText());
			record.add(txtAllowance.getText());
			record.add(txtWage.getText());
			record.add(txtComputeSalary.getText());
			tableRecords.add(record);
			tableList.setModel(new DefaultTableModel(tableRecords, tableTitle));
		}
	}


	public static void main(String[] args) throws FileNotFoundException {
		GuiContract minh = new GuiContract();
		minh.setSize(1000,600);
		minh.readFile();
		minh.swing();
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==txtId)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtName.requestFocus();
			}
		if(e.getSource()==txtName)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtGender.requestFocus();
			}
		if(e.getSource()==txtGender)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtDate.requestFocus();
			}
		if(e.getSource()==txtDate)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtAdress.requestFocus();
			}
		if(e.getSource()==txtAdress)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtPhone.requestFocus();
			}
		if(e.getSource()==txtPhone)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtEmail.requestFocus();
			}
		if(e.getSource()==txtEmail)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtPosition.requestFocus();
			}
		if(e.getSource()==txtPosition)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtAllowance.requestFocus();
			}
		if(e.getSource()==txtAllowance)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtWage.requestFocus();
			}
		if(e.getSource()==txtWage)
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {

				double a=Integer.parseInt((txtAllowance.getText()));
				double b =Integer.parseInt(txtWage.getText());
				double c=0;
				if(b<=25) 
					c = 3.14 +0.33*(  (b+2)/3 );		
				else c=3.14+(8*0.33);
				txtComputeSalary.setText(c+"");
				btnAdd.requestFocus();
			}		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == tableList) {
			int iDongDaChon = tableList.getSelectedRow();
			if (iDongDaChon != -1) {
				Vector vDongDaChon = (Vector) tableRecords.get(iDongDaChon);
				String id = vDongDaChon.get(0).toString();
				String name = vDongDaChon.get(1).toString();
				String gender = vDongDaChon.get(2).toString();
				String date = vDongDaChon.get(3).toString();
				String adress = vDongDaChon.get(4).toString();
				String phone = vDongDaChon.get(5).toString();
				String email = vDongDaChon.get(6).toString();
				String position= vDongDaChon.get(7).toString();
				String allowance = vDongDaChon.get(8).toString();
				String wage = vDongDaChon.get(9).toString();
				String salary = vDongDaChon.get(10).toString();
				txtId.setText(id);
				txtName.setText(name);
				txtGender.setText(gender);
				txtDate.setText(date);
				txtAdress.setText(adress);
				txtPhone.setText(phone);
				txtEmail.setText(email);
				txtPosition.setText(position);
				txtAllowance.setText(allowance);
				txtWage.setText(wage);
				txtComputeSalary.setText(salary);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnExit) // Exit
		{
			System.exit(0);
		}
		if (e.getSource() == btnAdd) //Add
		{
			if (txtId.getText().equals("")||txtName.getText().equals("")||txtGender.getText().equals("")||txtAdress.getText().equals("")||txtPhone.getText().equals("")||txtEmail.getText().equals("")||txtDate.getText().equals("")||txtPosition.getText().equals("")||txtAllowance.getText().equals("")||txtWage.getText().equals("")) {
				JOptionPane.showMessageDialog(rootPane, "You have not selected the record to delete!");
			}
			else {
				Vector record = new Vector();
				record.add(txtId.getText());
				record.add(txtName.getText());
				record.add(txtGender.getText());
				record.add(txtDate.getText());
				record.add(txtAdress.getText());
				record.add(txtPhone.getText());
				record.add(txtEmail.getText());
				record.add(txtPosition.getText());
				record.add(txtAllowance.getText());
				record.add(txtWage.getText());
				record.add(txtComputeSalary.getText());
				tableRecords.add(record);
				tableList.setModel(new DefaultTableModel(tableRecords, tableTitle));
				JOptionPane.showMessageDialog(rootPane, "successed");
				txtComputeSalary.setEnabled(false);
				txtName.setEnabled(false);
				txtId.setEnabled(false);
				txtAllowance.setEnabled(false);
				txtComputeSalary.setEnabled(false);
				txtEmail.setEnabled(false);
				txtDate.setEnabled(false);
				txtPhone.setEnabled(false);
				txtEmail.setEnabled(false);
				txtGender.setEnabled(false);
				txtPhone.setEnabled(false);
				txtAdress.setEnabled(false);
				txtPosition.setEnabled(false);
				txtAllowance.setEnabled(false);
				txtWage.setEnabled(false);
			}
		}
		if(e.getSource()==btnNew) {
			txtId.setText("");
			txtName.setText("");
			txtGender.setText("");
			txtDate.setText("");
			txtAdress.setText("");
			txtPhone.setText("");
			txtEmail.setText("");
			txtPosition.setText("");
			txtAllowance.setText("");
			txtWage.setText("");
			txtComputeSalary.setText("");
			txtGender.setText("");
			txtDate.setText("");
			txtId.requestFocus();
			txtName.setEnabled(true);
			txtId.setEnabled(true);
			txtEmail.setEnabled(true);
			txtPhone.setEnabled(true);
			txtPosition.setEnabled(true);
			txtAllowance.setEnabled(true);
			txtWage.setEnabled(true);
			txtPhone.setEnabled(true);
			txtAdress.setEnabled(true);
			txtPosition.setEnabled(true);
			txtGender.setEnabled(true);
			txtDate.setEnabled(true);
		}
		if(e.getSource()==btnSort) //Sort
		{
			for(int i=0;i<this.n;i++) {
				Scanner kb2 = new Scanner(a[i].getFullName());
				java.lang.String sNew="";
				while(kb2.hasNext()) {
					sNew = kb2.next()+ " "+sNew;
				}
			}
			for(int i=0;i<this.n-1;i++) {
				for (int j=i+1;j<this.n;j++) {
					if(a[i].getFullName().compareTo(a[j].getFullName())>0) {
						Contract k=a[i];
						a[i]=a[j];
						a[j]=k;
					}
				}
			}
			for(int i=0;i<this.n-1;i++) {
				tableRecords.remove(i);
			}

			for(int i=0;i<n;i++) {
				txtId.setText(a[i].getId());
				txtName.setText(a[i].getFullName());
				txtGender.setText(a[i].getGender());
				txtDate.setText(a[i].getDob());
				txtAdress.setText(a[i].getAdress());
				txtPhone.setText(a[i].getPhoneNumber());
				txtEmail.setText(a[i].getEmail());
				txtPosition.setText(a[i].getPosition());
				txtAllowance.setText(a[i].getAllowance());
				txtWage.setText(a[i].getWage());
				double b = Double.parseDouble(a[i].getAllowance());
				double c = Double.parseDouble(a[i].getWage());
				double d =b*c;
				txtComputeSalary.setText(d+"");
				Vector record = new Vector();
				record.add(txtId.getText());
				record.add(txtName.getText());
				record.add(txtGender.getText());
				record.add(txtDate.getText());
				record.add(txtAdress.getText());
				record.add(txtPhone.getText());
				record.add(txtEmail.getText());
				record.add(txtPosition.getText());
				record.add(txtAllowance.getText());
				record.add(txtWage.getText());
				record.add(txtComputeSalary.getText());
				tableRecords.add(record);
				tableList.setModel(new DefaultTableModel(tableRecords, tableTitle));
			}
			tableRecords.remove(0);

		}
		if(e.getSource()==btnSave) //Save
		{
			PrintStream p;
			try {
				p = new PrintStream(new File("C:\\\\Users\\\\Minh Dinh\\\\eclipse-workspace\\\\20_Homework01_DinhTranCongMinh\\\\src\\\\person\\\\outContract.txt"));
				for(int i=0;i<n;i++) {

					p.append(a[i].getId()+"\n");
					p.append(a[i].getFullName()+"\n");
					p.append(a[i].getGender()+"\n");
					p.append(a[i].getDob()+"\n");
					p.append(a[i].getAdress()+"\n");
					p.append(a[i].getPhoneNumber()+"\n");
					p.append(a[i].getEmail()+"\n");
					p.append(a[i].getPosition()+"\n");
					p.append(a[i].getAllowance()+"\n");
					p.append(a[i].getWage()+"\n");
					double b = Double.parseDouble(a[i].getAllowance());
					double c = Double.parseDouble(a[i].getWage());
					double d =b*c;
					p.append(d+"");
					p.append("\n_________________________________________________________________________________________________________________");
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}


		}
		if (e.getSource() == btnDelete) // Delete
		{
			int i = tableList.getSelectedRow();
			if (i == -1) {
				JOptionPane.showMessageDialog(rootPane, "You have not selected the record to delete!");
			} else {
				Vector j = (Vector) tableRecords.get(i);
				String k = j.get(0).toString();
				if (JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete the selected line with id: " + k, "Choice", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					tableRecords.remove(i);
					tableList.setModel(new DefaultTableModel(tableRecords, tableTitle));
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
