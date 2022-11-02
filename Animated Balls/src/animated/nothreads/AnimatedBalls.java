package animated.nothreads;

import static animated.nothreads.Constants.*;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimatedBalls {

	public static void main(String[] args) {
		
		//Her oppretter vi et ball-objekt med gitt farge
		
		Ball roedBall = new Ball(Color.RED);
<<<<<<< Updated upstream
		Ball gronBall = new Ball(Color.GREEN);
		Ball blaaBall = new Ball(Color.BLUE);
=======
		Ball blaaBall = new Ball(Color.BLUE);
		Ball groennBall = new Ball(Color.GREEN);
>>>>>>> Stashed changes
		
		//Her oppretter vi en tegneflate og legger til ballobjektet
		JPanel tegneflate = new JPanel();
		tegneflate.setLayout(null);
		tegneflate.add(roedBall);
<<<<<<< Updated upstream
		tegneflate.add(gronBall);
		tegneflate.add(blaaBall);
=======
		tegneflate.add(blaaBall);
		tegneflate.add(groennBall);
>>>>>>> Stashed changes
		
		//Her oppretter vi selve 2D-grafikk-vinduet legger til tegneflaten
		JFrame grafikkvinduet = new JFrame();
		grafikkvinduet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		grafikkvinduet.setLayout(new BorderLayout());
		grafikkvinduet.setSize(PANE_SIZE, PANE_SIZE);
		grafikkvinduet.add(tegneflate);
		
		grafikkvinduet.setVisible(true);
		
		
		Thread roedTraad = new Thread() {
			@Override
			public void run() {
				roedBall.animate();
			}
		}
			
		Thread blaaTraad = new Thread() {
			@Override
				public void run() {
					Ball blaaBall = new Ball(Color.BLUE);
					blaaBall.animate();
			}
		}
		
		Thread groennTraad = new Thread() {
			@Override
			public void run() {
				Ball groennBall = new Ball(Color.GREEN);
				groennBall.animate();
		}
	}
			
			
		
		
		//Her starter vi applikasjonen ved å gjøre grafikkvinduet synlig
		//og be ballen om å gjøre animasjonen, dvs. bevege og tegne seg 
		//på nytt i evig løkke.
<<<<<<< Updated upstream
		grafikkvinduet.setVisible(true);
		
//		new Thread(roedBall).start();
//		new Thread(gronBall).start();
//		new Thread(blaaBall).start();
		
		new Thread(() -> roedBall.animate()).start();
		new Thread(() -> gronBall.animate()).start();
		new Thread(() -> blaaBall.animate()).start();
		
	}

}





=======
	}
}
>>>>>>> Stashed changes
