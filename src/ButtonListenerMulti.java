import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Thread;
import java.net.*;
import java.io.*;
public class ButtonListenerMulti implements ActionListener{

	boolean win=false;
	static boolean flag=true;
	static boolean[] col={false,false,false,false,false,false,false};
	static String num="";
	public void actionPerformed(final ActionEvent e)
	{
		new Thread(new Runnable() {
			
			@Override
			
			public void run() {
				if(flag&&MultiFrame.fu){
					MultiFrame.fu=false;
					flag=false;
					boolean onetime=false;
					int[] all={0,0,0,0,0,0,0};
					
					String command = e.getActionCommand();
					int numberBlue=0,numberRed=0;
					
					for(int i=0;i<6;i++){   
						for(int j=0;j<7;j++){
							if(MultiFrame.number[i][j]==1)
								numberBlue++;
							else if(MultiFrame.number[i][j]==2)
								numberRed++;
						}
					}
					num=command;
					boolean red=false;
					boolean blue=false;
					boolean jump=false;
					
					if(numberBlue>numberRed)
					{
						red=true;
					}
					else					
						blue=true;

					if(command.equals("1")){ 
						col[0]=true;
						if(blue){
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][0]==0){
									MultiFrame.number[i][0]=1;
									jump=true;drop(0, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}else{
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][0]==0){
									MultiFrame.number[i][0]=2;
									jump=true;drop(0, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}		
						}
					}
					else if(command.equals("2")){
						col[1]=true;
						if(blue){
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][1]==0){
									MultiFrame.number[i][1]=1;
									jump=true;
									drop(1, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}else{
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][1]==0){
									MultiFrame.number[i][1]=2;
									jump=true;
									drop(1, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}
					}else if(command.equals("3")){
						col[2]=true;
						if(blue){
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][2]==0){
									MultiFrame.number[i][2]=1;
									jump=true;
									drop(2, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}else{
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][2]==0){
									MultiFrame.number[i][2]=2;
									jump=true;
									drop(2, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}
					}else if(command.equals("4")){
						col[3]=true;
						if(blue){
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][3]==0){
									MultiFrame.number[i][3]=1;
									jump=true;
									drop(3, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}else{
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][3]==0){
									MultiFrame.number[i][3]=2;
									jump=true;
									drop(3, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}
					}else if(command.equals("5")){
						col[4]=true;
						if(blue){
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][4]==0){
									MultiFrame.number[i][4]=1;
									jump=true;
									drop(4, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}else{
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][4]==0){
									MultiFrame.number[i][4]=2;
									jump=true;
									drop(4, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}
					}else if(command.equals("6")){
						col[5]=true;
						if(blue){
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][5]==0){
									MultiFrame.number[i][5]=1;
									jump=true;
									drop(5, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}else{
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][5]==0){
									MultiFrame.number[i][5]=2;
									jump=true;
									drop(5, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}
					}else if(command.equals("7")){
						col[6]=true;
						if(blue){
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][6]==0){
									MultiFrame.number[i][6]=1;
									jump=true;
									drop(6, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}else{
							for(int i=5;i>=0;i--){
								while(MultiFrame.number[i][6]==0){
									MultiFrame.number[i][6]=2;
									jump=true;
									drop(6, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}
					}
					for(int i=0;i<6;i++){
						for(int j=0;j<7;j++){
							if(MultiFrame.number[i][j]==1){
								MultiFrame.map[i][j].setIcon(MultiFrame.image1);
							}else if(MultiFrame.number[i][j]==2){
								MultiFrame.map[i][j].setIcon(MultiFrame.image2);
							}else if(MultiFrame.number[i][j]==0){
								MultiFrame.map[i][j].setIcon(MultiFrame.image);
							}
						}
					}
					flag=true;
					if(!win){
						if(blue==true)
						{
							win=judge(0);
						}
						else if (red==true)
						{
							win=judge(1);
						}
					}
				}
			}
			}).start();}

	public void drop(int j,boolean onetime,int [] all){
		if(MultiFrame.number[0][j]!=0&&all[j]==1)
			return;
		for(int i=0;i<6;i++){   
				if(MultiFrame.number[i][j]==1){
					for(int k=0;k<6;k++){
						if(MultiFrame.number[k][j]==1){
							if(k==0){
								all[j]=1;
								MultiFrame.map[k][j].setIcon(MultiFrame.image1);
								try {
									Thread.sleep(100);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								onetime=true;
								break;
							}
							MultiFrame.map[k][j].setIcon(MultiFrame.image1);
							MultiFrame.map[k-1][j].setIcon(MultiFrame.image);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							onetime=true;
							break;
						}
						else if(k==0){
							MultiFrame.map[k][j].setIcon(MultiFrame.image1);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
						else if(MultiFrame.number[k][j]==0){
							MultiFrame.map[k][j].setIcon(MultiFrame.image1);
							MultiFrame.map[k-1][j].setIcon(MultiFrame.image);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
					}
				}else if(MultiFrame.number[i][j]==2){
					for(int k=0;k<6;k++){
						if(MultiFrame.number[k][j]==2){
							if(k==0){
								all[j]=1;
								MultiFrame.map[k][j].setIcon(MultiFrame.image2);
								try {
									Thread.sleep(100);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								onetime=true;
								break;
							}
							MultiFrame.map[k][j].setIcon(MultiFrame.image2);
							MultiFrame.map[k-1][j].setIcon(MultiFrame.image);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							onetime=true;
							break;
						}
						else if(k==0){
							MultiFrame.map[k][j].setIcon(MultiFrame.image2);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
						else if(MultiFrame.number[k][j]==0){
							MultiFrame.map[k][j].setIcon(MultiFrame.image2);
							MultiFrame.map[k-1][j].setIcon(MultiFrame.image);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
					}
			}
			if(onetime)
				break;
		}
	}

	public static boolean judge(int which)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				if( (MultiFrame.number[i][j]==1 && MultiFrame.number[i+1][j+1]==1 && MultiFrame.number[i+2][j+2]==1 && MultiFrame.number[i+3][j+3]==1) || 
					(MultiFrame.number[i][j]==2 && MultiFrame.number[i+1][j+1]==2 && MultiFrame.number[i+2][j+2]==2 && MultiFrame.number[i+3][j+3]==2) )
				{
					if(which==0)
					{
						EndFrame.Lose(0);
						MultiFrame.btn1.setEnabled(false);
						MultiFrame.btn2.setEnabled(false);
						MultiFrame.btn3.setEnabled(false);
						MultiFrame.btn4.setEnabled(false);
						MultiFrame.btn5.setEnabled(false);
						MultiFrame.btn6.setEnabled(false);
						MultiFrame.btn7.setEnabled(false);
						return true;
					}
					else if(which==1)
					{
						EndFrame.Lose(1);
						MultiFrame.btn1.setEnabled(false);
						MultiFrame.btn2.setEnabled(false);
						MultiFrame.btn3.setEnabled(false);
						MultiFrame.btn4.setEnabled(false);
						MultiFrame.btn5.setEnabled(false);
						MultiFrame.btn6.setEnabled(false);
						MultiFrame.btn7.setEnabled(false);
						return true;
					}
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=3;j<7;j++)
			{
				if( (MultiFrame.number[i][j]==1 && MultiFrame.number[i+1][j-1]==1 && MultiFrame.number[i+2][j-2]==1 && MultiFrame.number[i+3][j-3]==1) ||
					(MultiFrame.number[i][j]==2 && MultiFrame.number[i+1][j-1]==2 && MultiFrame.number[i+2][j-2]==2 && MultiFrame.number[i+3][j-3]==2) )
				{
					if(which==0)
					{
						EndFrame.Lose(0);
						MultiFrame.btn1.setEnabled(false);
						MultiFrame.btn2.setEnabled(false);
						MultiFrame.btn3.setEnabled(false);
						MultiFrame.btn4.setEnabled(false);
						MultiFrame.btn5.setEnabled(false);
						MultiFrame.btn6.setEnabled(false);
						MultiFrame.btn7.setEnabled(false);
						return true;
					}
					else if(which==1)
					{
						EndFrame.Lose(1);
						MultiFrame.btn1.setEnabled(false);
						MultiFrame.btn2.setEnabled(false);
						MultiFrame.btn3.setEnabled(false);
						MultiFrame.btn4.setEnabled(false);
						MultiFrame.btn5.setEnabled(false);
						MultiFrame.btn6.setEnabled(false);
						MultiFrame.btn7.setEnabled(false);
						return true;
					}
				}
			}
		}
		
		for(int i=0;i<3;i++)//vertical
		{
			for(int j=0;j<7;j++)
			{
				if( (MultiFrame.number[i][j]==1 && MultiFrame.number[i+1][j]==1 && MultiFrame.number[i+2][j]==1 && MultiFrame.number[i+3][j]==1) ||
					(MultiFrame.number[i][j]==2 && MultiFrame.number[i+1][j]==2 && MultiFrame.number[i+2][j]==2 && MultiFrame.number[i+3][j]==2) )
				{
					if(which==0)
					{
						EndFrame.Lose(0);
						MultiFrame.btn1.setEnabled(false);
						MultiFrame.btn2.setEnabled(false);
						MultiFrame.btn3.setEnabled(false);
						MultiFrame.btn4.setEnabled(false);
						MultiFrame.btn5.setEnabled(false);
						MultiFrame.btn6.setEnabled(false);
						MultiFrame.btn7.setEnabled(false);
						return true;
					}
					else if(which==1)
					{
						EndFrame.Lose(1);
						MultiFrame.btn1.setEnabled(false);
						MultiFrame.btn2.setEnabled(false);
						MultiFrame.btn3.setEnabled(false);
						MultiFrame.btn4.setEnabled(false);
						MultiFrame.btn5.setEnabled(false);
						MultiFrame.btn6.setEnabled(false);
						MultiFrame.btn7.setEnabled(false);
						return true;
					}
				}
			}
		}
		for(int i=0;i<6;i++)//horizontal
		{
			for(int j=0;j<4;j++)
			{
				if( (MultiFrame.number[i][j]==1 && MultiFrame.number[i][j+1]==1 && MultiFrame.number[i][j+2]==1 && MultiFrame.number[i][j+3]==1) ||
					(MultiFrame.number[i][j]==2 && MultiFrame.number[i][j+1]==2 && MultiFrame.number[i][j+2]==2 && MultiFrame.number[i][j+3]==2) )
				{
					if(which==0)
					{
						EndFrame.Lose(0);
						MultiFrame.btn1.setEnabled(false);
						MultiFrame.btn2.setEnabled(false);
						MultiFrame.btn3.setEnabled(false);
						MultiFrame.btn4.setEnabled(false);
						MultiFrame.btn5.setEnabled(false);
						MultiFrame.btn6.setEnabled(false);
						MultiFrame.btn7.setEnabled(false);
						return true;
					}
					else if(which==1)
					{
						EndFrame.Lose(1);
						MultiFrame.btn1.setEnabled(false);
						MultiFrame.btn2.setEnabled(false);
						MultiFrame.btn3.setEnabled(false);
						MultiFrame.btn4.setEnabled(false);
						MultiFrame.btn5.setEnabled(false);
						MultiFrame.btn6.setEnabled(false);
						MultiFrame.btn7.setEnabled(false);
						return true;
					}
				}
			}
		}
		int count=0; 
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(GameFrame.number[i][j]!=0)
				{
					count++;
				}
				
			}
		}
		if(count==42)
		{
			EndFrame.Lose(2);
			MultiFrame.btn1.setEnabled(false);
			MultiFrame.btn2.setEnabled(false);
			MultiFrame.btn3.setEnabled(false);
			MultiFrame.btn4.setEnabled(false);
			MultiFrame.btn5.setEnabled(false);
			MultiFrame.btn6.setEnabled(false);
			MultiFrame.btn7.setEnabled(false);
			return true;
		}
		return false;
	}
}