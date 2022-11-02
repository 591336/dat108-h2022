package eks_fra_forelsening;

public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {
		
		Teller teller = new Teller();
		
		Thread tot = new TellOppTraad(teller);
		Thread tnt = new TellNedTraad(teller);
		
		tot.start();
		tnt.start();
		
		tot.join();
		tnt.join();
		
		System.out.println("Teller verdi: " + teller.getVerdi());
	}
}
