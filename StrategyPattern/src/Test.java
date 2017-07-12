import Kosarkasi.Kosarkas.Pozicija;
import tipoviKosarkasa.AmerickiStil;

public class Test {
	public static void main(String[] args) {

		AmerickiStil Curry = new AmerickiStil("Curry", 193, 85, Pozicija.BEK);

		Curry.igrajOdbranu();
		Curry.sutiraj();
		Curry.skaci();
	}

}
