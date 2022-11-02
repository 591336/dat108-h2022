package eks_fra_forelsening;

public class TellOppTraad extends Thread {
	
	private Teller teller;

	public TellOppTraad(Teller teller) {
		this.teller = teller;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 100000; i++) {
			synchronized(teller) {
			teller.tellOpp();
			}
		}
		
	}
}
