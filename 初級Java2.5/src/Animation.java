
public class Animation extends MyFrame {
	public void run() {
		int x=30;
		while(true) {
			// (1)画面を消す
			clear();
			//(2)四角形を表示する
			setColor(0,128,0);
			fillRect(x,80,10,100);
			x+=5;
			if(x>200) { // xの値が200より大きくなったら
				break; // whilによる繰り返しをやめる
			}
			sleep(0.1);
		}
	}

}
