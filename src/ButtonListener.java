import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class ButtonListener implements ActionListener
{
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("SandBox"))
		{
			StartFrame.frame.setVisible(false);
			GameFrame.Frame();
		}
		else if(e.getActionCommand().equals("Battle"))
		{
			StartFrame.frame.setVisible(false);
			MultiFrame.Frame();ConnectFrame.Frame();
		}
		else if(e.getActionCommand().equals("V.S Com"))
		{
			StartFrame.frame.setVisible(false);
			AIFrame.Frame();
		}
		else if(e.getActionCommand().equals("New Game"))
		{
			AIFrame.btn1.setEnabled(true);
			AIFrame.btn2.setEnabled(true);
			AIFrame.btn3.setEnabled(true);
			AIFrame.btn4.setEnabled(true);
			AIFrame.btn5.setEnabled(true);
			AIFrame.btn6.setEnabled(true);
			AIFrame.btn7.setEnabled(true);			
			GameFrame.btn1.setEnabled(true);
			GameFrame.btn2.setEnabled(true);
			GameFrame.btn3.setEnabled(true);
			GameFrame.btn4.setEnabled(true);
			GameFrame.btn5.setEnabled(true);
			GameFrame.btn6.setEnabled(true);
			GameFrame.btn7.setEnabled(true);
			MultiFrame.btn1.setEnabled(true);
			MultiFrame.btn2.setEnabled(true);
			MultiFrame.btn3.setEnabled(true);
			MultiFrame.btn4.setEnabled(true);
			MultiFrame.btn5.setEnabled(true);
			MultiFrame.btn6.setEnabled(true);
			MultiFrame.btn7.setEnabled(true);
			
			
			EndFrame.End.setVisible(false);
			AIFrame.AI.setVisible(false);
			GameFrame.Game.setVisible(false);
			MultiFrame.Multi.setVisible(false);
			StartFrame.single=true;
			StartFrame.frame.setVisible(true);
		}
		
	}
}