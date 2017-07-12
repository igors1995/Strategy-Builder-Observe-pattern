package Kosarkasi;

import odbrana.interfejsi.odbranaInterfejs;
import skok.interfejsi.skokInterfejs;
import sut.interfejsi.sutInterfejs;

public abstract class Kosarkas {
	private String ime;
	private int visina;
	private int tezina;
	private Pozicija pozicija;

	private odbranaInterfejs odbrana;
	private skokInterfejs skok;
	private sutInterfejs sut;

	
	
	

	public Kosarkas(String ime, int visina, int tezina, Pozicija pozicija, odbranaInterfejs odbrana, skokInterfejs skok,
			sutInterfejs sut) {
		super();
		this.ime = ime;
		this.visina = visina;
		this.tezina = tezina;
		this.pozicija = pozicija;
		this.odbrana = odbrana;
		this.skok = skok;
		this.sut = sut;
	}

	public enum Pozicija {
		PLEY, BEK, KRILO, CENTAR;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

	public int getTezina() {
		return tezina;
	}

	public void setTezina(int tezina) {
		this.tezina = tezina;
	}

	public Pozicija getPozicija() {
		return pozicija;
	}

	public void setPozicija(Pozicija pozicija) {
		this.pozicija = pozicija;
	}

	public void sutiraj() {
		sut.sutni();
	};

	public void skaci() {
		skok.skoci();
	};

	public void igrajOdbranu() {
		odbrana.igrajOdbranu();

	};

}
