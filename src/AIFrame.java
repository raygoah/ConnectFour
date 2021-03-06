import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AIFrame extends StartFrame{//AI s=new AI(Frame)??
	static JFrame AI = new JFrame();
	static int labelSize = 100;
	static int size1=60;
	static int WIDGHT = 1200;
	static int LENGTH = 900;
	
	static int[][] number = new int[6][7];
	static JLabel[][] map = new JLabel[6][7];
	static ImageIcon image = new  ImageIcon("source/set.png");
	static ImageIcon image1= new  ImageIcon("source/Blue.png");
	static ImageIcon image2= new  ImageIcon("source/Red.png");
	static ImageIcon image3= new  ImageIcon("source/arrow.png");
	
	static JButton btn1 = new JButton("1",image3);
	static JButton btn2 = new JButton("2",image3);
	static JButton btn3 = new JButton("3",image3);
	static JButton btn4 = new JButton("4",image3);
	static JButton btn5 = new JButton("5",image3);
	static JButton btn6 = new JButton("6",image3);
	static JButton btn7 = new JButton("7",image3);
	public static void Frame()
	{
		
		AI.setSize(StartFrame.WIDGHT, StartFrame.LENGTH);
		AI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AI.setTitle("ConnectFour");
		AI.setContentPane(new JLabel(new ImageIcon("source/ground_2.jpg")));
		AI.setVisible(true);
		ButtonListenerAI AIListener = new ButtonListenerAI();
		
		btn1.addActionListener(AIListener);
		btn1.setLocation(0*StartFrame.LENGTH/8+3*StartFrame.LENGTH/20+20, 3*StartFrame.WIDGHT/20+6*StartFrame.WIDGHT/12-670);
		btn1.setSize(size1,size1);
		btn2.addActionListener(AIListener);
		btn2.setLocation(1*StartFrame.LENGTH/8+3*StartFrame.LENGTH/20+20, 3*StartFrame.WIDGHT/20+6*StartFrame.WIDGHT/12-670);
		btn2.setSize(size1,size1);
		btn3.addActionListener(AIListener);
		btn3.setLocation(2*StartFrame.LENGTH/8+3*StartFrame.LENGTH/20+20, 3*StartFrame.WIDGHT/20+6*StartFrame.WIDGHT/12-670);
		btn3.setSize(size1,size1);
		btn4.addActionListener(AIListener);
		btn4.setLocation(3*StartFrame.LENGTH/8+3*StartFrame.LENGTH/20+20, 3*StartFrame.WIDGHT/20+6*StartFrame.WIDGHT/12-670);
		btn4.setSize(size1,size1);
		btn5.addActionListener(AIListener);
		btn5.setLocation(4*StartFrame.LENGTH/8+3*StartFrame.LENGTH/20+20, 3*StartFrame.WIDGHT/20+6*StartFrame.WIDGHT/12-670);
		btn5.setSize(size1,size1);
		btn6.addActionListener(AIListener);
		btn6.setLocation(5*StartFrame.LENGTH/8+3*StartFrame.LENGTH/20+20, 3*StartFrame.WIDGHT/20+6*StartFrame.WIDGHT/12-670);
		btn6.setSize(size1,size1);
		btn7.addActionListener(AIListener);
		btn7.setLocation(6*StartFrame.LENGTH/8+3*StartFrame.LENGTH/20+20, 3*StartFrame.WIDGHT/20+6*StartFrame.WIDGHT/12-670);
		btn7.setSize(size1,size1);
		btn1.setContentAreaFilled(false);btn2.setContentAreaFilled(false);btn3.setContentAreaFilled(false);btn4.setContentAreaFilled(false);btn5.setContentAreaFilled(false);btn6.setContentAreaFilled(false);btn7.setContentAreaFilled(false);
		btn1.setBorder(null);
		btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn2.setOpaque(false);
        btn2.setBorder(null);
		btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setOpaque(false);
        btn3.setBorder(null);
		btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setOpaque(false);
        btn4.setBorder(null);
		btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setOpaque(false);
        btn5.setBorder(null);
		btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setOpaque(false);
        
        btn6.setBorder(null);
		btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setOpaque(false);
        btn7.setBorder(null);
		btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setOpaque(false);
		AI.add(btn1);
		AI.add(btn2);
		AI.add(btn3);
		AI.add(btn4);
		AI.add(btn5);
		AI.add(btn6);
		AI.add(btn7);
	

		
		
		image3.setImage(image3.getImage().getScaledInstance(size1, size1,Image.SCALE_DEFAULT));
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				map[i][j] = new JLabel(image);
				number[i][j] = 0;
				
				map[i][j].setSize(labelSize,labelSize);
				map[i][j].setLocation(j*StartFrame.LENGTH/8+3*StartFrame.LENGTH/20, 3*StartFrame.WIDGHT/20+i*StartFrame.WIDGHT/12);
				AI.add(map[i][j]);
			}
		}
		
		audioPlayWave.stop();
		
		myMusicPlay audioPlayWave_1 = new myMusicPlay("source/The_Lord_of_the_Rings-_The_Fellowship_of_the_Ring_.wav");
        audioPlayWave_1.start();
	}
	
	
	
}

