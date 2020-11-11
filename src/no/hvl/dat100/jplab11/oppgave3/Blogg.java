package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 21;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = lengde+1;
	}

	public int getAntall() {
		return innleggtabell.length;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i<nesteledig-1; i++) {
			if (innleggtabell[i] != null) {
				if (innlegg.getId() == innleggtabell[i].getId()) {
					return i;
				}
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i<nesteledig-1; i++) {
			if (innleggtabell[i] != null) {
				if (innlegg.getId() == innleggtabell[i].getId()) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		for (int i = 0; i<nesteledig-1; i++) {
			if (null == innleggtabell[i]) {
				return true;
			}
		}
		return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (finnes(innlegg)) {
			return false;
		} else {
			for (int i = 0; i<nesteledig; i++) {
				if (null == innleggtabell[i]) {
					innleggtabell[i] = innlegg;
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString() {
		String x = Integer.toString(nesteledig-1);
		for (int i = 0; i<nesteledig-1; i++) {
			x += innleggtabell[i].toString();
		}
		return x;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}