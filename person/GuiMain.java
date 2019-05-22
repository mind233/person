package person;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiMain extends JFrame implements ActionListener {
	private JButton btnRegular,btnContract;
	private JLabel lbTitle;
	private Font font = new Font("Tahoma", Font.BOLD, 19);

	public GuiMain(){
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(null);
		super.setSize(400, 300);

		//Title
		lbTitle = new JLabel();
		lbTitle.setBounds(35,10,350,30);
		lbTitle.setText("Employee Management Software");
		lbTitle.setFont(font);
		this.getContentPane().add(lbTitle);
		
		//Button Regular 
		btnRegular= new JButton();
		btnRegular.setBounds(90,100,200,25);
		btnRegular.setText("Regular");
		this.getContentPane().add(btnRegular);

		//Button Contract
		btnContract= new JButton();
		btnContract.setBounds(90,130,200,25);
		btnContract.setText("Contract");
		this.getContentPane().add(btnContract);
		
		//Dang ki su kien
		btnRegular.addActionListener(this);
		btnContract.addActionListener(this);
		
		super.setVisible(true);
	}
	public static void main(String[] args) {
		GuiMain g = new GuiMain();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRegular) // Regular
		{
			GuiRegular g = new GuiRegular();
			try {
				g.readFile();
				g.swing();
				g.setSize(1200,1200);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource()==btnContract) // Contract
		{
			GuiContract g = new GuiContract();
			try {
				g.readFile();
				g.swing();
				g.setSize(1200,1200);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
	}
}
