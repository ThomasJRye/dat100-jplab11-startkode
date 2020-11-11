package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	private String url;

	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		setTekst(tekst);
		this.url=url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		setTekst(tekst);
		this.url=url;
		setLikes(likes);
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url=url;
	}

	@Override
	public String toString() {
		return "Bilde\n" + getId() 
		+ "\n"+ getBruker() 
			+ "\n" + getDato() 
				+ "\n" + getLikes() 
					+ "\net bilde"
						+ "\n" + getUrl() + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
