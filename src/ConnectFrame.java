import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Image;


public class ConnectFrame {
	static JFrame Connect = new JFrame();
	static int WIDGHT = StartFrame.WIDGHT/2;
	static int LENGTH = StartFrame.LENGTH/2;
	static int sizeW = 4*WIDGHT/13;
	static int sizeL = 2*LENGTH/11;
	static JTextField inputIP = new JTextField(20);
	static String IP;
	
	public static void Frame()
	{
		ImageIcon image = new  ImageIcon("source/knight_1.png");
		//image.setImage(image.getImage().getScaledInstance(StartFrame.WIDGHT/3, StartFrame.WIDGHT/3,Image.SCALE_DEFAULT));
		
		Connect.setSize(WIDGHT,LENGTH);
		Connect.setLocation(WIDGHT/2,LENGTH/2);
		Connect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Connect.setTitle("Connecting...");
		Connect.setContentPane(new JLabel(image));
		Connect.setVisible(true);
		
		JButton btn1 = new JButton("Waiting for Opponent");
		JButton btn2 = new JButton("Connecting to Opponent"); ButtonListenerConnect b = new ButtonListenerConnect();
		JButton btn3 = new JButton("Cancel");
		btn1.addActionListener(b);
		btn1.setLocation(WIDGHT/13, 2*LENGTH/11);
		btn1.setSize(sizeW,sizeL);
		btn2.addActionListener(b);
		btn2.setLocation(WIDGHT/13, 5*LENGTH/11);
		btn2.setSize(sizeW,sizeL);
		btn3.addActionListener(b);
		btn3.setLocation(WIDGHT/13, 8*LENGTH/11);
		btn3.setSize(sizeW/2,sizeL/2);
		Connect.add(btn1);
		Connect.add(btn2);
		Connect.add(btn3);
	}
}
