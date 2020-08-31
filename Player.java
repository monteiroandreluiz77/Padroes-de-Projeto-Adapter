package adapter;



public class Player implements PlayerSimples {

	ArqAdapter arquivo;
	
	@Override
	public void tocar(String tipoArq, String nomeArq) {
	
		if (tipoArq.equalsIgnoreCase("CD")) {
            arquivo = new ArqAdapter(tipoArq);
            arquivo.tocar(tipoArq, nomeArq);
        } else if (tipoArq.equalsIgnoreCase("FITA")) {
            arquivo = new ArqAdapter(tipoArq);
            arquivo.tocar(tipoArq, nomeArq);
        }
	}

}
