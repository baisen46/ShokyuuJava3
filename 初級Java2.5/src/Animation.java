
public class Animation extends MyFrame {
	public void run() {
		int y = 50;
		int x = 30;
		while (y <= 250) {
			// (1)画面を消す
			clear();
			// (2)四角形を表示する
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100); // xとyを用いて表示
			x += 5;
			y += 5; // xを減らす(yは変更しない) 
			sleep(0.1);
		}
		while(x>=70) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x-=5;
			sleep(0.1);
		}
		while (x<=230) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			y-=5;
			sleep(0.1);
		}		
	}
}
