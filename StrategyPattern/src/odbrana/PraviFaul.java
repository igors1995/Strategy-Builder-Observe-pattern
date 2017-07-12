package odbrana;

import odbrana.interfejsi.odbranaInterfejs;

public class PraviFaul implements odbranaInterfejs{

	@Override
	public void igrajOdbranu() {
		System.out.println("Ovaj igrac cesto pravi faul!");
	}

}
