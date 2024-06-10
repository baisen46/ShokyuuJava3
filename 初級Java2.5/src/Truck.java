
public class Truck extends Vehicle {
	public Truck(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame) {

		frame.fillRect(x+80,y,30,20);
		frame.fillRect(x,y+20,110,20);
		frame.fillOval(x+10,y+40,20,20);
		frame.fillOval(x+80,y+40,20,20);
		frame.fillOval(x+30,y+40,20,20);
	}

}
