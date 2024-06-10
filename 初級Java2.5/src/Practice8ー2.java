

import java.util.Vector;

public class Practice8ー2 extends MyFrame {
	public void run() {
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		vehicles.add(new Car(10,30,3,0));
		vehicles.add(new Car(70,70,-3,0));
		vehicles.add(new Train(110,150,7,0));
		vehicles.add(new Train(80,250,-5,0));
		vehicles.add(new Truck(50,280,6,0));
		vehicles.add(new Truck(110,320,7,0));
		
		
		for(int i=0; i<30; i++) {
			clear();
			for (int j=0; j<vehicles.size(); j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
	}

}