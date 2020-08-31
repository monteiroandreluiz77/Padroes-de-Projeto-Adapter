package adapter;

public class Cd implements PlayerUniversal {

	@Override
	public void playFita(String nome) {

	}

	@Override
	public void playCd(String nome) {
		System.out.println("Reproduzindo conteúdo do Cd: " + nome);

	}

}