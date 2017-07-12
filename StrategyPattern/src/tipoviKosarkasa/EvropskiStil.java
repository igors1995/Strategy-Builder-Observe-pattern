package tipoviKosarkasa;

import Kosarkasi.Kosarkas;
import odbrana.GrubaOdbrana;
import skok.LosSkakac;
import sut.DobarSuter;

public class EvropskiStil extends Kosarkas {

	public EvropskiStil(String ime, int visina, int tezina, Pozicija pozicija) {
		super(ime, visina, tezina, pozicija, new GrubaOdbrana(), new LosSkakac(), new DobarSuter());
	}

}
