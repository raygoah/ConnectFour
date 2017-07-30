import javax.swing.JFrame;
import java.awt.*;
import java.net.InetAddress;
import java.net.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import javax.swing.JButton;

public class StartFrame {
	static String severIP;
	static int WIDGHT = 1200;
	static boolean single = true;
	static int LENGTH = 900;
	static JFrame frame = new JFrame();
	static myMusicPlay audioPlayWave = new myMusicPlay("source/The Lord of the Rings- The Fellowship of the Ring CR - 02. The Shire.wav");
	public static void main(String[] args) 
	{
		try{
			InetAddress myComputer = InetAddress.getLocalHost() ;
			severIP = myComputer.getHostAddress();
		  }catch(Exception ee) { 
			  System.out.println(ee);
		  }
		
		JLabel  dragon=new JLabel(new ImageIcon("source/fly_3.gif"));
		JLabel  dragon_2=new JLabel(new ImageIcon("source/fly.gif"));
		frame.setSize(WIDGHT, LENGTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("ConnectFour");

		frame.setContentPane(new JLabel(new ImageIcon("source/castle.jpg")));
		
		frame.setVisible(true);
		Color color = new Color(0xa0,0x52,0x2d);
		Color color2 = new Color(0xff,0xde,0xad);
		Color color3 = new Color(0xff,0x8c,0x00);
		
		
		
		JButton btn1 = new JButton("V.S Com");
		JButton btn2 = new JButton("SandBox");
		JButton btn3 = new JButton("Battle");
		ButtonListener mblistener = new ButtonListener();
		btn1.addActionListener(mblistener);
		btn1.setFont(new Font("DialogInput", Font.BOLD, 30));
		btn1.setForeground(color);
		btn1.setBackground(color2);
		btn1.setLocation(9*WIDGHT/40, 2*LENGTH/3);
		btn1.setSize(3*WIDGHT/20, LENGTH/12);
		btn2.addActionListener(mblistener);
		btn2.setLocation(17*WIDGHT/40, 2*LENGTH/3);
		btn2.setSize(3*WIDGHT/20, LENGTH/12);
		btn2.setFont(new Font("DialogInput", Font.BOLD, 30));
		btn2.setForeground(color);
		btn2.setBackground(color2);
		btn3.addActionListener(mblistener);
		btn3.setLocation(25*WIDGHT/40, 2*LENGTH/3);
		btn3.setSize(3*WIDGHT/20, LENGTH/12);
		btn3.setFont(new Font("DialogInput", Font.BOLD, 30));
		btn3.setForeground(color);
		btn3.setBackground(color2);
		frame.setLayout(null);
		frame.add(btn1);frame.add(btn2);frame.add(btn3);
		
		JLabel lb1 = new JLabel("LET'S CONNECT");
		JLabel lb2 = new JLabel("FOUR !!!");
		lb1.setFont(new Font("DialogInput", Font.BOLD, 90));
		lb1.setLocation(3*WIDGHT/16,2*LENGTH/15);
		lb1.setSize(3*WIDGHT/4,LENGTH/3);
		lb2.setFont(new Font("DialogInput", Font.BOLD, 90));
		lb2.setLocation(3*WIDGHT/16,3*WIDGHT/16);
		lb2.setSize(3*WIDGHT/4,LENGTH/3);
		lb1.setForeground(color3);
		lb2.setForeground(color3);
		frame.add(lb1);frame.add(lb2);
	
		frame.getContentPane().setBackground(Color.lightGray);
		
		dragon.setSize(595,516);
		dragon.setLocation(750,500);
		frame.add(dragon);
		dragon_2.setSize(500,400);
		dragon_2.setLocation(0,1);
		frame.add(dragon_2);
        audioPlayWave.start();
        
	}
	  
}