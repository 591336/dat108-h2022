package eks_fra_forelsening;

public class Teller {

	private int verdi = 0;

	public int getVerdi() {
		return verdi;
	}

	// sync hvis hele metoden skal
	public synchronized void tellOpp() {
		verdi++;
	}

	// sync når deler av kode, denne foretrekkes
	public void tellNed() {
		synchronized (this) {
			verdi--;
		}
	}
}
