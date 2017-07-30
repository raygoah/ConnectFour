import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import org.omg.CORBA.PRIVATE_MEMBER;

public class ClientThreadCode extends Thread{
	private Socket cSock;
	public ClientThreadCode(String IP,int port){
		try{
			cSock= new Socket(MultiFrame.IP, 8000);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void run(){
		try{
			setPriority(10);
			if (cSock != null){
				System.out.println("connect good");
				ConnectFrame.Connect.setVisible(false);
				MultiFrame.Server=2;
			}
			BufferedReader serverInput = new BufferedReader(new InputStreamReader(cSock.getInputStream()));
			DataOutputStream serverOutput = new DataOutputStream(cSock.getOutputStream());
			
			while(true){
				MultiFrame.fu=false;
				String msg=serverInput.readLine();
				for(;;){
				if(!msg.equals("")){
					try {
						sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
					MultiFrame.fu=true;
					if(msg.equals("1")){
						MultiFrame.btn1.doClick();
					}else if(msg.equals("2")){
						MultiFrame.btn2.doClick();
					}else if(msg.equals("3")){
						MultiFrame.btn3.doClick();	
					}else if(msg.equals("4")){
						MultiFrame.btn4.doClick();
					}else if(msg.equals("5")){
						MultiFrame.btn5.doClick();
					}else if(msg.equals("6")){
						MultiFrame.btn6.doClick();
					}else if(msg.equals("7")){
						MultiFrame.btn7.doClick();
					}
					try {
						sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
					break;
				}
				}
				ButtonListenerMulti.num="";
				for(;;){
					System.out.print("k");
					MultiFrame.fu=true;
				if(!ButtonListenerMulti.num.equals("")){
					try {
						sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
					if(ButtonListenerMulti.num.equals("1")){
						serverOutput.writeBytes("1\n");
					}else if(ButtonListenerMulti.num.equals("2")){
						serverOutput.writeBytes("2\n");
					}else if(ButtonListenerMulti.num.equals("3")){
						serverOutput.writeBytes("3\n");
					}else if(ButtonListenerMulti.num.equals("4")){
						serverOutput.writeBytes("4\n");
					}else if(ButtonListenerMulti.num.equals("5")){
						serverOutput.writeBytes("5\n");
					}else if(ButtonListenerMulti.num.equals("6")){
						serverOutput.writeBytes("6\n");
					}else if(ButtonListenerMulti.num.equals("7")){
						serverOutput.writeBytes("7\n");
					}
					break;
				}
				}
			}
		}catch(IOException ee){
			
		}
	}
}
