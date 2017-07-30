import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class EndFrame extends ButtonListenerGame{

	static JFrame End = new JFrame();
	static int WIDGHT = 800;
	static int LENGTH = 600;
	
	static JButton btn1 = new JButton("New Game");
	
	static ImageIcon image = new  ImageIcon("source/BlueVictory.png");
	static ImageIcon image1= new  ImageIcon("source/RedVictory.png");
	static ImageIcon image2= new  ImageIcon("source/animal.png");
	static ImageIcon image3= new  ImageIcon("source/defeatblue.png");
	static ImageIcon image4= new  ImageIcon("source/defeatred.png");
	
	public static void Lose(int which){
		End.setSize(WIDGHT,LENGTH);
		End.setLocation(WIDGHT/4,LENGTH/4);
		btn1.setContentAreaFilled(false);
		btn1.setBorder(null);
		btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
		btn1.setFont(new Font("DialogInput", Font.BOLD, 30));
		btn1.setForeground(Color.WHITE);
		
		JLabel lb1 ;
		
		if(which==0)
		{
			GameFrame.frame.setVisible(false);
			
			
			if(StartFrame.single){
				image.setImage(image.getImage().getScaledInstance(WIDGHT,LENGTH,Image.SCALE_DEFAULT));
				End.setContentPane(new JLabel(image));
			}
			else if(MultiFrame.Server==1){//victory blue
				image.setImage(image.getImage().getScaledInstance(WIDGHT,LENGTH,Image.SCALE_DEFAULT));
				End.setContentPane(new JLabel(image));
			}
			else if(MultiFrame.Server==2){//defeat red
				End.setBackground(Color.black);
				End.setContentPane(new JLabel(image4));
			}
			
			
			ButtonListener m = new ButtonListener();
			btn1.addActionListener(m);
			btn1.setLocation(300,400);
			btn1.setSize(200,60);
			
			End.add(btn1);
			
		
			
			End.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		else if(which==1)
		{
			
			if(StartFrame.single){
				image1.setImage(image1.getImage().getScaledInstance(WIDGHT,LENGTH,Image.SCALE_DEFAULT));
				End.setContentPane(new JLabel(image1));
			}
			else if(MultiFrame.Server==1){//defeat blue
				End.setBackground(Color.black);
				End.setContentPane(new JLabel(image3));
			}
			else if(MultiFrame.Server==2){//victory red
				image1.setImage(image1.getImage().getScaledInstance(WIDGHT,LENGTH,Image.SCALE_DEFAULT));
				End.setContentPane(new JLabel(image1));
			}
			
		
			ButtonListener m = new ButtonListener();
			btn1.addActionListener(m);
			btn1.setLocation(300,400);
			btn1.setSize(200,60);
			
			End.add(btn1);
			
			
			End.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		else if(which==2)
		{
			lb1=new JLabel("Tie!!!!!!!");
			image2.setImage(image2.getImage().getScaledInstance(WIDGHT,LENGTH,Image.SCALE_DEFAULT));
			End.setContentPane(new JLabel(image2));
			lb1.setFont(new Font("Consola", Font.BOLD, 60));
			lb1.setLocation(21*WIDGHT/32,1*LENGTH/15);
			lb1.setSize(10*WIDGHT/4,LENGTH/3);
		
			ButtonListenerGame m = new ButtonListenerGame();
			btn1.addActionListener(m);
			btn1.setLocation(300,400);
			btn1.setSize(200,60);
			
			End.add(btn1);
			
			
			End.add(lb1);
			End.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		End.setVisible(true);
	}
}
