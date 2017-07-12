package odbrana;

import odbrana.interfejsi.odbranaInterfejs;

public class GrubaOdbrana implements odbranaInterfejs{

	@Override
	public void igrajOdbranu() {
		System.out.println("Ovaj igrac igra grubuOdbranu!");
	}

}
