
public class Rectif extends MyFrame{
	public void run() {
		int x=30;
		setColor(0,128,0);
		int i;
		for (i=0 ; i<9 ; i++) {
			if(i==50)
				fillRect(x,60,10,100);
	
			
		else {
			fillRect(x,60,10,x-20);
		}
			x+=20;
		}
	}

}
