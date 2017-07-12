package odbrana;

import odbrana.interfejsi.odbranaInterfejs;

public class ZonskaOdbrana implements odbranaInterfejs{

	@Override
	public void igrajOdbranu() {
		System.out.println("Ovaj igrac dobro igra zonsku odbranu!");
	}

}
