
public class Rectif extends MyFrame{
	public void run() {
		int x=30;
		
	
		int i;
		for (i=0 ; i<9 ; i++) 
		{
			if(i==50)
				fillRect(x,60,10,100);
	
			
		else {
			setColor(x,x,x);
			fillRect(x,60,10,100);
		}
			x+=20;
		}
	}

}
