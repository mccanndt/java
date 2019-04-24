
/*
 * HelloWorldApp
 * Created: April 2019 by David McCann
 */

import java.util.Timer;
import java.util.TimerTask;

public class HelloWorldApp {

	static int counter = 0;

	public static void main(String[] args) {

		System.out.println("Hello World");

		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			public void run() {

				counter += 1;
				System.out.println(counter);
			}
		};

		timer.scheduleAtFixedRate(task, 0, 1000);

	}

}
