	
public class car5 extends MyFrame {
		public void run() {

			Car[] cars = new Car[5];

			cars[0] = new Car(50, 50, 1, 0);
			cars[1] = new Car(50, 85, 2, 0);
			cars[2] = new Car(50, 120, 3, 0);
			cars[3] = new Car(50, 155, 4, 0);
			cars[4] = new Car(50, 190, 5, 0);

		

			for (int i = 0; i < 30; i++) {

				clear();
				for (int j = 0; j < cars.length; j++) {
					cars[j].draw(this);
					cars[j].move();
				}

				sleep(0.1);
			}
		}
	}
