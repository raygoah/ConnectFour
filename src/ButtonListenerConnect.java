import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.net.*;
import java.io.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonListenerConnect implements ActionListener{
		
	public void actionPerformed(ActionEvent e)
	{		
		
		if(e.getActionCommand().equals("Waiting for Opponent"))
		{
			JButton myIP = new JButton("ServerIP: "+StartFrame.severIP);
			myIP.setFont(new Font("DialogInput", Font.BOLD, 14));
			myIP.setForeground(Color.blue);
			myIP.setSize(250,20);
			myIP.setLocation(6*ConnectFrame.WIDGHT/13, 3*ConnectFrame.LENGTH/11);
			myIP.setEnabled(false);
			ConnectFrame.Connect.add(myIP);
			myIP.updateUI();
			StartFrame.single = false;
			MultiFrame.serverstart();
		}
		if(e.getActionCommand().equals("Connecting to Opponent"))
		{
			StartFrame.single = false;
			ConnectFrame.inputIP.setLocation(6*ConnectFrame.WIDGHT/13, 5*ConnectFrame.LENGTH/11);
			ConnectFrame.inputIP.setSize(ConnectFrame.inputIP.getPreferredSize());
			ConnectFrame.inputIP.setText("Input the sever IP");
			ConnectFrame.Connect.add(ConnectFrame.inputIP);
			JButton ok = new JButton("connect");
			ConnectFrame.Connect.add(ok);
			ok.addActionListener(this);
			ok.setSize(ConnectFrame.sizeW/2, ConnectFrame.sizeL/2);
			ok.setLocation(9*ConnectFrame.WIDGHT/13, 6*ConnectFrame.LENGTH/11);	
		}
		if(e.getActionCommand().equals("connect"))
		{
			MultiFrame.IP = ConnectFrame.inputIP.getText();
			MultiFrame.clientstart();
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			StartFrame.frame.setVisible(true);
			MultiFrame.Multi.setVisible(false);
			ConnectFrame.Connect.setVisible(false);
		}
	}
	

}
