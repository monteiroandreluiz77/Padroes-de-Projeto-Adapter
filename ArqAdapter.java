package adapter;


public class ArqAdapter implements PlayerSimples {

	PlayerUniversal playerUni;
	

	public ArqAdapter(String tipoArq) {
		if (tipoArq.toUpperCase().equals("CD")) {
            playerUni = new Cd();
        } else if (tipoArq.toUpperCase().equals("FITA")) {
            playerUni = new Fita();
        }
		
	}


	@Override
	public void tocar(String tipoArq, String nomeArq) {
		if (tipoArq.toUpperCase().equals("CD")) {
            playerUni.playCd(nomeArq);
        } else if (tipoArq.toUpperCase().equals("FITA")) {
            playerUni.playFita(nomeArq);
        }
		
	}

	      
	

}
