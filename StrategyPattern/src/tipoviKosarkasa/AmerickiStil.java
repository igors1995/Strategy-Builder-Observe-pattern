package tipoviKosarkasa;

import Kosarkasi.Kosarkas;
import odbrana.ZonskaOdbrana;
import skok.DobarSkakac;
import sut.DobarSuter;
import sut.VrhunskiSuter;

public class AmerickiStil extends Kosarkas {

	public AmerickiStil(String ime, int visina, int tezina, Pozicija pozicija) {
		super(ime, visina, tezina, pozicija, new ZonskaOdbrana(), new DobarSkakac(), new VrhunskiSuter());
	}

}
