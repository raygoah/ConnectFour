import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.net.ssl.SSLException;

public class ButtonListenerAI  implements ActionListener{
	boolean win=false;
	static boolean flag=true;
	static boolean[] col={false,false,false,false,false,false,false};
	static int[] computer={0,0,0,0,0,0,0};
	static int computer_judge=1;
	public void actionPerformed(final ActionEvent e)
	{
		new Thread(new Runnable() {
			
			@Override
			
			public void run() {
				if(flag){
					
					flag=false;
					boolean onetime=false;
					int[] all={0,0,0,0,0,0,0};
					
					String command = e.getActionCommand();
					int numberBlue=0,numberRed=0;
					
					for(int i=0;i<6;i++){  
						for(int j=0;j<7;j++){
							if(AIFrame.number[i][j]==1)
								numberBlue++;
							else if(AIFrame.number[i][j]==2)
								numberRed++;
						}
					}
					
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
								while(AIFrame.number[i][0]==0){
									AIFrame.number[i][0]=1;
									jump=true;drop(0, onetime,all);
									break;
								}
								if(jump){
									break;
								}
							}
						}else{
							for(int i=5;i>=0;i--){
								while(AIFrame.number[i][0]==0){
									AIFrame.number[i][0]=2;
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
								while(AIFrame.number[i][1]==0){
									AIFrame.number[i][1]=1;
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
								while(AIFrame.number[i][1]==0){
									AIFrame.number[i][1]=2;
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
								while(AIFrame.number[i][2]==0){
									AIFrame.number[i][2]=1;
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
								while(AIFrame.number[i][2]==0){
									AIFrame.number[i][2]=2;
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
								while(AIFrame.number[i][3]==0){
									AIFrame.number[i][3]=1;
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
								while(AIFrame.number[i][3]==0){
									AIFrame.number[i][3]=2;
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
								while(AIFrame.number[i][4]==0){
									AIFrame.number[i][4]=1;
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
								while(AIFrame.number[i][4]==0){
									AIFrame.number[i][4]=2;
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
								while(AIFrame.number[i][5]==0){
									AIFrame.number[i][5]=1;
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
								while(AIFrame.number[i][5]==0){
									AIFrame.number[i][5]=2;
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
								while(AIFrame.number[i][6]==0){
									AIFrame.number[i][6]=1;
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
								while(AIFrame.number[i][6]==0){
									AIFrame.number[i][6]=2;
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
							if(AIFrame.number[i][j]==1){
								AIFrame.map[i][j].setIcon(AIFrame.image1);
							}else if(AIFrame.number[i][j]==2){
								AIFrame.map[i][j].setIcon(AIFrame.image2);
							}else if(AIFrame.number[i][j]==0){
								AIFrame.map[i][j].setIcon(AIFrame.image);
							}
						}
					}
					
					flag=true;
					if(!win){
						if(blue==true)
						{
							win=judge(0);
							computer_judge=0;
						}
						else if (red==true)
						{
							win=judge(1);
						}
					}
					
					
					
					if(computer_judge==0)
					{
					
						flag=false;
						jump=false;
						blue=false;
						red=true;
						for(int i=0;i<7;i++){
							computer[i]=0;
						}
						
						for( int j=0 ; j<7 ; j++ ){
							for( int i=0 ; i<6 ; i++ ){
								if( AIFrame.number[i][j]==0 ){
									computer[j] = 1;
								}
							}
						}
						
						
						int what = judgeAI()+1;
	
						while(true)
						{
							if(computer[what-1] ==1)
							{
								break;
							}
							else
							{
								what=(int)(Math.random()*7)+1;
							}
						}
						
						command = new String(""+what);
						
						if(command.equals("1")){
							col[0]=true;
							if(blue){
								for(int i=5;i>=0;i--){
									while(AIFrame.number[i][0]==0){
										AIFrame.number[i][0]=1;
										jump=true;drop(0, onetime,all);
										break;
									}
									if(jump){
										break;
									}
								}
							}else{
								for(int i=5;i>=0;i--){
									while(AIFrame.number[i][0]==0){
										AIFrame.number[i][0]=2;
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
									while(AIFrame.number[i][1]==0){
										AIFrame.number[i][1]=1;
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
									while(AIFrame.number[i][1]==0){
										AIFrame.number[i][1]=2;
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
									while(AIFrame.number[i][2]==0){
										AIFrame.number[i][2]=1;
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
									while(AIFrame.number[i][2]==0){
										AIFrame.number[i][2]=2;
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
									while(AIFrame.number[i][3]==0){
										AIFrame.number[i][3]=1;
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
									while(AIFrame.number[i][3]==0){
										AIFrame.number[i][3]=2;
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
									while(AIFrame.number[i][4]==0){
										AIFrame.number[i][4]=1;
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
									while(AIFrame.number[i][4]==0){
										AIFrame.number[i][4]=2;
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
									while(AIFrame.number[i][5]==0){
										AIFrame.number[i][5]=1;
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
									while(AIFrame.number[i][5]==0){
										AIFrame.number[i][5]=2;
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
									while(AIFrame.number[i][6]==0){
										AIFrame.number[i][6]=1;
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
									while(AIFrame.number[i][6]==0){
										AIFrame.number[i][6]=2;
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
								if(AIFrame.number[i][j]==1){
									AIFrame.map[i][j].setIcon(AIFrame.image1);
								}else if(AIFrame.number[i][j]==2){
									AIFrame.map[i][j].setIcon(AIFrame.image2);
								}else if(AIFrame.number[i][j]==0){
									AIFrame.map[i][j].setIcon(AIFrame.image);
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
				}
			}).start();}
	public void drop(int j,boolean onetime,int [] all){
		if(AIFrame.number[0][j]!=0&&all[j]==1)
			return;
		for(int i=0;i<6;i++){  
				if(AIFrame.number[i][j]==1){
					for(int k=0;k<6;k++){
						if(AIFrame.number[k][j]==1){
							if(k==0){
								all[j]=1;
								AIFrame.map[k][j].setIcon(AIFrame.image1);
								try {
									Thread.sleep(100);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								onetime=true;
								break;
							}
							AIFrame.map[k][j].setIcon(AIFrame.image1);
							AIFrame.map[k-1][j].setIcon(AIFrame.image);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							onetime=true;
							break;
						}
						else if(k==0){
							AIFrame.map[k][j].setIcon(AIFrame.image1);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
						else if(AIFrame.number[k][j]==0){
							AIFrame.map[k][j].setIcon(AIFrame.image1);
							AIFrame.map[k-1][j].setIcon(AIFrame.image);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
					}
				}else if(AIFrame.number[i][j]==2){
					for(int k=0;k<6;k++){
						if(AIFrame.number[k][j]==2){
							if(k==0){
								all[j]=1;
								AIFrame.map[k][j].setIcon(AIFrame.image2);
								try {
									Thread.sleep(100);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								onetime=true;
								break;
							}
							AIFrame.map[k][j].setIcon(AIFrame.image2);
							AIFrame.map[k-1][j].setIcon(AIFrame.image);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							onetime=true;
							break;
						}
						else if(k==0){
							AIFrame.map[k][j].setIcon(AIFrame.image2);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
						else if(AIFrame.number[k][j]==0){
							AIFrame.map[k][j].setIcon(AIFrame.image2);
							AIFrame.map[k-1][j].setIcon(AIFrame.image);
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
				if( (AIFrame.number[i][j]==1 && AIFrame.number[i+1][j+1]==1 && AIFrame.number[i+2][j+2]==1 && AIFrame.number[i+3][j+3]==1) || 
					(AIFrame.number[i][j]==2 && AIFrame.number[i+1][j+1]==2 && AIFrame.number[i+2][j+2]==2 && AIFrame.number[i+3][j+3]==2) )
				{
					if(which==0)
					{
						EndFrame.Lose(0);
						AIFrame.btn1.setEnabled(false);
						AIFrame.btn2.setEnabled(false);
						AIFrame.btn3.setEnabled(false);
						AIFrame.btn4.setEnabled(false);
						AIFrame.btn5.setEnabled(false);
						AIFrame.btn6.setEnabled(false);
						AIFrame.btn7.setEnabled(false);
						return true;
					}
					else if(which==1)
					{
						EndFrame.Lose(1);
						AIFrame.btn1.setEnabled(false);
						AIFrame.btn2.setEnabled(false);
						AIFrame.btn3.setEnabled(false);
						AIFrame.btn4.setEnabled(false);
						AIFrame.btn5.setEnabled(false);
						AIFrame.btn6.setEnabled(false);
						AIFrame.btn7.setEnabled(false);
						return true;
					}
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=3;j<7;j++)
			{
				if( (AIFrame.number[i][j]==1 && AIFrame.number[i+1][j-1]==1 && AIFrame.number[i+2][j-2]==1 && AIFrame.number[i+3][j-3]==1) ||
					(AIFrame.number[i][j]==2 && AIFrame.number[i+1][j-1]==2 && AIFrame.number[i+2][j-2]==2 && AIFrame.number[i+3][j-3]==2) )
				{
					if(which==0)
					{
						EndFrame.Lose(0);
						AIFrame.btn1.setEnabled(false);
						AIFrame.btn2.setEnabled(false);
						AIFrame.btn3.setEnabled(false);
						AIFrame.btn4.setEnabled(false);
						AIFrame.btn5.setEnabled(false);
						AIFrame.btn6.setEnabled(false);
						AIFrame.btn7.setEnabled(false);
						return true;
					}
					else if(which==1)
					{
						EndFrame.Lose(1);
						AIFrame.btn1.setEnabled(false);
						AIFrame.btn2.setEnabled(false);
						AIFrame.btn3.setEnabled(false);
						AIFrame.btn4.setEnabled(false);
						AIFrame.btn5.setEnabled(false);
						AIFrame.btn6.setEnabled(false);
						AIFrame.btn7.setEnabled(false);
						return true;
					}
				}
			}
		}
		
		for(int i=0;i<3;i++)//vertical
		{
			for(int j=0;j<7;j++)
			{
				if( (AIFrame.number[i][j]==1 && AIFrame.number[i+1][j]==1 && AIFrame.number[i+2][j]==1 && AIFrame.number[i+3][j]==1) ||
					(AIFrame.number[i][j]==2 && AIFrame.number[i+1][j]==2 && AIFrame.number[i+2][j]==2 && AIFrame.number[i+3][j]==2) )
				{
					if(which==0)
					{
						EndFrame.Lose(0);
						AIFrame.btn1.setEnabled(false);
						AIFrame.btn2.setEnabled(false);
						AIFrame.btn3.setEnabled(false);
						AIFrame.btn4.setEnabled(false);
						AIFrame.btn5.setEnabled(false);
						AIFrame.btn6.setEnabled(false);
						AIFrame.btn7.setEnabled(false);
						return true;
					}
					else if(which==1)
					{
						EndFrame.Lose(1);
						AIFrame.btn1.setEnabled(false);
						AIFrame.btn2.setEnabled(false);
						AIFrame.btn3.setEnabled(false);
						AIFrame.btn4.setEnabled(false);
						AIFrame.btn5.setEnabled(false);
						AIFrame.btn6.setEnabled(false);
						AIFrame.btn7.setEnabled(false);
						return true;
					}
				}
			}
		}
		for(int i=0;i<6;i++)//horizontal
		{
			for(int j=0;j<4;j++)
			{
				if( (AIFrame.number[i][j]==1 && AIFrame.number[i][j+1]==1 && AIFrame.number[i][j+2]==1 && AIFrame.number[i][j+3]==1) ||
					(AIFrame.number[i][j]==2 && AIFrame.number[i][j+1]==2 && AIFrame.number[i][j+2]==2 && AIFrame.number[i][j+3]==2) )
				{
					if(which==0)
					{
						EndFrame.Lose(0);
						AIFrame.btn1.setEnabled(false);
						AIFrame.btn2.setEnabled(false);
						AIFrame.btn3.setEnabled(false);
						AIFrame.btn4.setEnabled(false);
						AIFrame.btn5.setEnabled(false);
						AIFrame.btn6.setEnabled(false);
						AIFrame.btn7.setEnabled(false);
						return true;
					}
					else if(which==1)
					{
						EndFrame.Lose(1);
						AIFrame.btn1.setEnabled(false);
						AIFrame.btn2.setEnabled(false);
						AIFrame.btn3.setEnabled(false);
						AIFrame.btn4.setEnabled(false);
						AIFrame.btn5.setEnabled(false);
						AIFrame.btn6.setEnabled(false);
						AIFrame.btn7.setEnabled(false);
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static int judgeAI(){
		int[] move = {1,1,1,1,1,1,1};
		
		//vertical
		for( int i=0 ; i<4; i++ ){//OOO in vertical
			for( int j=0 ; j<7 ; j++ ){
				if( i==0 ){
					if( AIFrame.number[i][j]==2 && 
						AIFrame.number[i+1][j]==2 && 
						AIFrame.number[i+2][j]==2 ){
						move[j] = 0;
					}
					if( AIFrame.number[i][j]==1 && 
						AIFrame.number[i+1][j]==1 && 
						AIFrame.number[i+2][j]==1 ){
						move[j] = 0;
					}
				}
				if( i>0 ){
					if( AIFrame.number[i][j]==2 && 
						AIFrame.number[i+1][j]==2 && 
						AIFrame.number[i+2][j]==2 && 
						AIFrame.number[i-1][j]==0 ){
						return j;
					}
					if( AIFrame.number[i][j]==1 && 
						AIFrame.number[i+1][j]==1 && 
						AIFrame.number[i+2][j]==1 && 
						AIFrame.number[i-1][j]==0 ){
						return j;
					}
				}
			}
		}
		
		//horizontal
		for( int i=0 ; i<6 ; i++ ){//OOXO
			for( int j=0 ; j<4 ; j++ ){
				if( i==5 ){
					if( AIFrame.number[i][j]==2 && 
						AIFrame.number[i][j+1]==2 && 
						AIFrame.number[i][j+2]==0 && 
						AIFrame.number[i][j+3]==2 ){
						return j+2;
					}
					if( AIFrame.number[i][j]==1 && 
						AIFrame.number[i][j+1]==1 && 
						AIFrame.number[i][j+2]==0 && 
						AIFrame.number[i][j+3]==1 ){
						return j+2;
					}
				}
				if( i<5 ){
					if( AIFrame.number[i][j]==2 && 
						AIFrame.number[i][j+1]==2 && 
						AIFrame.number[i][j+2]==0 && 
						AIFrame.number[i][j+3]==2 ){
						if( AIFrame.number[i+1][j+2]!=0 )
							return j+2;
						else
							move[j+2] = 0;
					}
					if( AIFrame.number[i][j]==1 && 
						AIFrame.number[i][j+1]==1 && 
						AIFrame.number[i][j+2]==0 && 
						AIFrame.number[i][j+3]==1 ){
						if( AIFrame.number[i+1][j+2]!=0 )
							return j+2;
						else
							move[j+2] = 0;
					}
				}
				
			}
		}
		for( int i=0 ; i<6 ; i++ ){//OXOO
			for( int j=0 ; j<4 ; j++ ){
				if( i==5 ){
					if( AIFrame.number[i][j]==2 && 
						AIFrame.number[i][j+1]==0 && 
						AIFrame.number[i][j+2]==2 && 
						AIFrame.number[i][j+3]==2 ){
						return j+1;
					}
					if( AIFrame.number[i][j]==1 && 
						AIFrame.number[i][j+1]==0 && 
						AIFrame.number[i][j+2]==1 && 
						AIFrame.number[i][j+3]==1 ){
						return j+1;
					}
				}
				if( i<5 ){
					if( AIFrame.number[i][j]==2 && 
						AIFrame.number[i][j+1]==0 && 
						AIFrame.number[i][j+2]==2 && 
						AIFrame.number[i][j+3]==2 ){
						if( AIFrame.number[i+1][j+1]!=0 )
							return j+1;
						else
							move[j+1] = 0;
					}
					if( AIFrame.number[i][j]==1 && 
						AIFrame.number[i][j+1]==0 && 
						AIFrame.number[i][j+2]==1 && 
						AIFrame.number[i][j+3]==1 ){
						if( AIFrame.number[i+1][j+1]!=0 )
							return j+1;
						else
							move[j+1] = 0;
					}
				}
			}
		}
		for( int i=0 ; i<6 ; i++ ){//OOXOO
			for( int j=0 ; j<3 ; j++ ){
				if( i==5 ){
					if( AIFrame.number[i][j]==2 && 
						AIFrame.number[i][j+1]==2 && 
						AIFrame.number[i][j+2]==0 && 
						AIFrame.number[i][j+3]==2 && 
						AIFrame.number[i][j+4]==2 ){
						return j+2;
					}
					if( AIFrame.number[i][j]==1 && 
						AIFrame.number[i][j+1]==1 && 
						AIFrame.number[i][j+2]==0 && 
						AIFrame.number[i][j+3]==1 && 
						AIFrame.number[i][j+4]==1 ){
						return j+2;
					}
				}
				if( i<5 ){
					if( AIFrame.number[i][j]==2 && 
						AIFrame.number[i][j+1]==2 && 
						AIFrame.number[i][j+2]==0 && 
						AIFrame.number[i][j+3]==2 && 
						AIFrame.number[i][j+4]==2 ){
						if( AIFrame.number[i+1][j+2]!=0 )
							return j+2;
						else
							move[j+2] = 0;
					}
					if( AIFrame.number[i][j]==1 && 
						AIFrame.number[i][j+1]==1 && 
						AIFrame.number[i][j+2]==0 && 
						AIFrame.number[i][j+3]==1 && 
						AIFrame.number[i][j+4]==1 ){
						if( AIFrame.number[i+1][j+2]!=0 )
							return j+2;
						else
							move[j+2] = 0;
					}
				}
				
			}
		}// OOOX/**************************************/
		// ____
		for( int i=0 ; i<5 ; i++ ){
			for( int j=0 ; j<4 ; j++ ){
				if( AIFrame.number[i][j]==2 &&
					AIFrame.number[i][j+1]==2 &&
					AIFrame.number[i][j+2]==2 &&
					AIFrame.number[i][j+3]==0 &&
					AIFrame.number[i+1][j+3]!=0 ){
					return j+3;
				}
				if( AIFrame.number[i][j]==1 &&
					AIFrame.number[i][j+1]==1 &&
					AIFrame.number[i][j+2]==1 &&
					AIFrame.number[i][j+3]==0 &&
					AIFrame.number[i+1][j+3]!=0 ){
					return j+3;
				}
			}
		}
		//XOOO
		//____
		for( int i=0 ; i<5 ; i++ ){
			for( int j=0 ; j<4 ; j++ ){
				if( AIFrame.number[i+1][j]!=0 &&
					AIFrame.number[i][j]==0 &&
					AIFrame.number[i][j+1]==2 &&
					AIFrame.number[i][j+2]==2 &&
					AIFrame.number[i][j+3]==2 ){
					return j;
				}
				if( AIFrame.number[i+1][j]!=0 &&
					AIFrame.number[i][j]==0 &&
					AIFrame.number[i][j+1]==1 &&
					AIFrame.number[i][j+2]==1 &&
					AIFrame.number[i][j+3]==1 ){
					return j;
				}
			}
		}
		for( int i=0 ; i<6 ; i++ ){//XOOO_
			for( int j=0 ; j<3 ; j++ ){
				if( i==5 ){
					if( AIFrame.number[i][j]==0 &&
						AIFrame.number[i][j+1]==2 && 
						AIFrame.number[i][j+2]==2 && 
						AIFrame.number[i][j+3]==2 && 
						AIFrame.number[i][j+4]==1 ){
						return j;
					}
					if( AIFrame.number[i][j]==0 &&
						AIFrame.number[i][j+1]==1 && 
						AIFrame.number[i][j+2]==1 && 
						AIFrame.number[i][j+3]==1 && 
						AIFrame.number[i][j+4]==2 ){
						return j;
					}
				}
				if( i<5 ){
					if( AIFrame.number[i][j]==0 &&
						AIFrame.number[i][j+1]==2 && 
						AIFrame.number[i][j+2]==2 && 
						AIFrame.number[i][j+3]==2 && 
						AIFrame.number[i][j+4]==1 ){
						if( AIFrame.number[i+1][j]!=0 )
							return j;
						else
							move[j] = 0;
					}
					if( AIFrame.number[i][j]==0 &&
						AIFrame.number[i][j+1]==1 && 
						AIFrame.number[i][j+2]==1 && 
						AIFrame.number[i][j+3]==1 && 
						AIFrame.number[i][j+4]==2 ){
						if( AIFrame.number[i+1][j]!=0 )
							return j;
						else
							move[j] = 0;
					}
				}
				
			}
		}/*****************************************/
		for( int i=0 ; i<6 ; i++ ){//_OOOX
			for( int j=0 ; j<3 ; j++ ){
				if( i==5 ){
					if( AIFrame.number[i][j]==1 && 
						AIFrame.number[i][j+1]==2 && 
						AIFrame.number[i][j+2]==2 && 
						AIFrame.number[i][j+3]==2 &&
						AIFrame.number[i][j+4]==0 ){
						return j+4;
					}
					if( AIFrame.number[i][j]==2 && 
						AIFrame.number[i][j+1]==1 && 
						AIFrame.number[i][j+2]==1 && 
						AIFrame.number[i][j+3]==1 &&
						AIFrame.number[i][j+4]==0 ){
						return j+4;
					}
				}
				if( i<5 ){
					if( AIFrame.number[i][j]==1 && 
						AIFrame.number[i][j+1]==2 && 
						AIFrame.number[i][j+2]==2 && 
						AIFrame.number[i][j+3]==2 &&
						AIFrame.number[i][j+4]==0 ){
						if( AIFrame.number[i+1][j+4]!=0 )
							return j+4;
						else
							move[j+4] = 0;
					}
					if( AIFrame.number[i][j]==2 && 
						AIFrame.number[i][j+1]==1 && 
						AIFrame.number[i][j+2]==1 && 
						AIFrame.number[i][j+3]==1 &&
						AIFrame.number[i][j+4]==0 ){
						if( AIFrame.number[i+1][j+4]!=0 )
							return j+4;
						else
							move[j+4] = 0;
					}
				}
			}
		}
		
		//diagonal
		//O
		//_O
		//__O
		//___X
		for( int i=0 ; i<3 ; i++ ){
			for( int j=0 ; j<4 ; j++ ){
				if( AIFrame.number[i][j]==2 && 
					AIFrame.number[i+1][j+1]==2 && 
					AIFrame.number[i+2][j+2]==2 && 
					AIFrame.number[i+3][j+3]==0 ){
					return j+3;
				}
				if( AIFrame.number[i][j]==1 && 
					AIFrame.number[i+1][j+1]==1 && 
					AIFrame.number[i+2][j+2]==1 && 
					AIFrame.number[i+3][j+3]==0 ){
					return j+3;
				}
			}
		}
		//O
		//_O
		//__X
		//___O
		for( int i=0 ; i<3 ; i++ ){
			for( int j=0 ; j<4 ; j++ ){
				if( AIFrame.number[i][j]==2 && 
					AIFrame.number[i+1][j+1]==2 && 
					AIFrame.number[i+2][j+2]==0 && 
					AIFrame.number[i+3][j+3]==2 ){
					if( AIFrame.number[i+3][j+2]!=0 )
						return j+2;
					else
						move[j+2] = 0;
				}
				if( AIFrame.number[i][j]==1 && 
					AIFrame.number[i+1][j+1]==1 && 
					AIFrame.number[i+2][j+2]==0 && 
					AIFrame.number[i+3][j+3]==1 ){
					if( AIFrame.number[i+3][j+2]!=0 )
						return j+2;
					else
						move[j+2] = 0;
				}
			}
		}
		//O
		//_X
		//__O
		//___O
		for( int i=0 ; i<3 ; i++ ){
			for( int j=0 ; j<4 ; j++ ){
				if( AIFrame.number[i][j]==2 && 
					AIFrame.number[i+1][j+1]==0 && 
					AIFrame.number[i+2][j+2]==2 && 
					AIFrame.number[i+3][j+3]==2 ){
					if( AIFrame.number[i+2][j+1]!=0 )
						return j+1;
					else
						move[j+1] = 0;
				}
				if( AIFrame.number[i][j]==1 && 
					AIFrame.number[i+1][j+1]==0 && 
					AIFrame.number[i+2][j+2]==1 && 
					AIFrame.number[i+3][j+3]==1 ){
					if( AIFrame.number[i+2][j+1]!=0 )
						return j+1;
					else
						move[j+1] = 0;
				}
			}
		}
		//X
		//_O
		//__O
		//___O
		for( int i=0 ; i<3 ; i++ ){
			for( int j=0 ; j<4 ; j++ ){
				if( AIFrame.number[i][j]==0 && 
					AIFrame.number[i+1][j+1]==2 && 
					AIFrame.number[i+2][j+2]==2 && 
					AIFrame.number[i+3][j+3]==2 ){
					if( AIFrame.number[i+1][j]!=0 )
						return j;
					else
						move[j] = 0;
				}
				if( AIFrame.number[i][j]==0 && 
					AIFrame.number[i+1][j+1]==1 && 
					AIFrame.number[i+2][j+2]==1 && 
					AIFrame.number[i+3][j+3]==1 ){
					if( AIFrame.number[i+1][j]!=0 )
						return j;
					else
						move[j] = 0;
				}
			}
		}
		//   O
		//  O_
		// O__
		//X___
		for( int i=0 ; i<3 ; i++ ){
			for( int j=3 ; j<7 ; j++ ){
				if( AIFrame.number[i][j]==2 && 
					AIFrame.number[i+1][j-1]==2 && 
					AIFrame.number[i+2][j-2]==2 && 
					AIFrame.number[i+3][j-3]==0 ){
					return j-3;
				}
				if( AIFrame.number[i][j]==1 && 
					AIFrame.number[i+1][j-1]==1 && 
					AIFrame.number[i+2][j-2]==1 && 
					AIFrame.number[i+3][j-3]==0 ){
					return j-3;
				}
			}
		}
		//   O
		//  O_
		// X__
		//O___
		for( int i=0 ; i<3 ; i++ ){
			for( int j=3 ; j<7 ; j++ ){
				if( AIFrame.number[i][j]==2 && 
					AIFrame.number[i+1][j-1]==2 && 
					AIFrame.number[i+2][j-2]==0 && 
					AIFrame.number[i+3][j-3]==2 ){
					if( AIFrame.number[i+3][j-2]!=0 )
						return j-2;
					else
						move[j-2] = 0;
				}
				if( AIFrame.number[i][j]==1 && 
					AIFrame.number[i+1][j-1]==1 && 
					AIFrame.number[i+2][j-2]==0 && 
					AIFrame.number[i+3][j-3]==1 ){
					if( AIFrame.number[i+3][j-2]!=0 )
						return j-2;
					else
						move[j-2] = 0;
				}
			}
		}
		//   O
		//  X_
		// O__
		//O___
		for( int i=0 ; i<3 ; i++ ){
			for( int j=3 ; j<7 ; j++ ){
				if( AIFrame.number[i][j]==2 && 
					AIFrame.number[i+1][j-1]==0 && 
					AIFrame.number[i+2][j-2]==2 && 
					AIFrame.number[i+3][j-3]==2 ){
					if( AIFrame.number[i+2][j-1]!=0 )
						return j-1;
					else
						move[j-1] = 0;
				}
				if( AIFrame.number[i][j]==1 && 
					AIFrame.number[i+1][j-1]==0 && 
					AIFrame.number[i+2][j-2]==1 && 
					AIFrame.number[i+3][j-3]==1 ){
					if( AIFrame.number[i+2][j-1]!=0 )
						return j-1;
					else
						move[j-1] = 0;
				}
			}
		}
		//   X
		//  O_
		// O__
		//O___
		for( int i=0 ; i<3 ; i++ ){
			for( int j=3 ; j<7 ; j++ ){
				if( AIFrame.number[i][j]==0 && 
					AIFrame.number[i+1][j-1]==2 && 
					AIFrame.number[i+2][j-2]==2 && 
					AIFrame.number[i+3][j-3]==2 ){
					if( AIFrame.number[i+1][j]!=0 )
						return j;
					else
						move[j] = 0;
				}
				if( AIFrame.number[i][j]==0 && 
					AIFrame.number[i+1][j-1]==1 && 
					AIFrame.number[i+2][j-2]==1 && 
					AIFrame.number[i+3][j-3]==1) {
					if( AIFrame.number[i+1][j]!=0 )
						return j;
					else
						move[j] = 0;
				}
			}
		}
		
		//advanced
		for( int i=0 ; i<6 ; i++ ){//OO
			for( int j=1 ; j<5 ; j++ ){
				if( AIFrame.number[i][j-1]==0 &&
					AIFrame.number[i][j]==1 && 
					AIFrame.number[i][j+1]==1 && 
					AIFrame.number[i][j+2]==0 ){
					if( i==5 ){//bottom line >> block either side at random
						int chose = (int)(Math.random()*10000);
						return  (chose>5000) ? (j-1) : (j+2);
					}
					if( i<5 ){//not the bottom line
						// OOX
						// ___
						if( AIFrame.number[i+1][j-1]!=0 && AIFrame.number[i+1][j+2]!=0 ){
							int chose = (int)(Math.random()*10000);
							return  (chose>5000) ? (j-1) : (j+2);
						}
						if( AIFrame.number[i+1][j-1]==0 && AIFrame.number[i+1][j+2]!=0 ){
							return j+2;
						}
						//XOO
						//___
						if( AIFrame.number[i+1][j-1]!=0 && AIFrame.number[i+1][j+2]==0 ){
							return j-1;
						}
						// OO
						// __
						if( AIFrame.number[i+1][j-1]==0 && AIFrame.number[i+1][j+2]==0 ){
							move[j-1] = 0;
							move[j+2] = 0;
						}
					}
				}
			}
		}
		int cantChose = 0;
		int finalChose = (int)(Math.random()*7);
		
		for( int i=0 ; i<7; i++ ){
			if( move[i]==0 )
				cantChose++;
		}
		
		/*if( cantChose==7 )//all bad moves >> GGGGG
			return (int)(Math.random()*7);
		else{//chose from good moves
			while( move[finalChose]==0 ){
				finalChose = (int)(Math.random()*7);
			}
		}
		return finalChose;
		*/
		if( cantChose==7 ){//all bad moves >> GGGGG
			for( int i=0 ; i<7 ; i++ ){
				if( AIFrame.number[0][i]==0 )
					return i;
			}
		}
		else{//chose from good moves
			while( move[finalChose]==0 ){
				finalChose = (int)(Math.random()*7);
			}
		}
		return finalChose;
	}
	
}
