import java.awt.Button;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.text.AbstractDocument.DefaultDocumentEvent;

public class ServerThreadCode extends Thread{
	private ServerSocket serverSock;
	private Socket connectionSock;
	public ServerThreadCode(int port){
		try{
			serverSock=new ServerSocket(port);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public void run(){
		try{
			setPriority(10);
			System.out.println("waiting to connect......");
			connectionSock = serverSock.accept();
			ConnectFrame.Connect.setVisible(false);
			MultiFrame.Server=1;
			System.out.println("Success!!!");
			serverSock.close();
			DataOutputStream clientOutput = new DataOutputStream(connectionSock.getOutputStream());
			BufferedReader clientInput = new BufferedReader(new InputStreamReader(connectionSock.getInputStream()));
			
			while(true){
				ButtonListenerMulti.num="";
				for(;;){
					System.out.print("g");
					MultiFrame.fu=true;
				if(!ButtonListenerMulti.num.equals("")){
					System.out.println(ButtonListenerMulti.num);
					try {
						sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
					if(ButtonListenerMulti.num.equals("1")){
						clientOutput.writeBytes("1\n");
					}else if(ButtonListenerMulti.num.equals("2")){
						clientOutput.writeBytes("2\n");
					}else if(ButtonListenerMulti.num.equals("3")){
						clientOutput.writeBytes("3\n");
					}else if(ButtonListenerMulti.num.equals("4")){
						clientOutput.writeBytes("4\n");
					}else if(ButtonListenerMulti.num.equals("5")){
						clientOutput.writeBytes("5\n");
					}else if(ButtonListenerMulti.num.equals("6")){
						clientOutput.writeBytes("6\n");
					}else if(ButtonListenerMulti.num.equals("7")){
						clientOutput.writeBytes("7\n");
					}
					
					break;
				}
				}
				MultiFrame.fu=false;
				String msg=clientInput.readLine();
				for(;;){
					try {
						sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
					MultiFrame.fu=true;
					if(!msg.equals("")){
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
			}
			
		}catch(IOException ee){
			
		}
	}
}