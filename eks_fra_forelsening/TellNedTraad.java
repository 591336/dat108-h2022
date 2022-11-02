package eks_fra_forelsening;

public class TellNedTraad extends Thread {
	
	private Teller teller;

	public TellNedTraad(Teller teller) {
		this.teller = teller;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 100000; i++) {
			teller.tellNed();
		}
		
	}
}
