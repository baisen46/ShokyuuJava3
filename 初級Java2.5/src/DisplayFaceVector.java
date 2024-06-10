import java.util.Vector;

import src.Car;

public class DisplayFaceVector extends MyFrame {
	public void run() {
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car (50,50,10,0));
		cars.add(new Car (70,50,10,0));
		cars.add(new Car (90,50,10,0));
		cars.add(new Car (110,50,10,0));
		cars.add(new Car (130,50,10,0));
	
		for (int i=0; i<30; i++ ) {
			clear();
			for (int j=0; j<cars.size(); j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			sleep(0.1);
		}
	}

}
