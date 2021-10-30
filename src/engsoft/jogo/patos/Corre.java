package engsoft.jogo.patos;

public class Corre implements Padrao_Correr {

	
	public Corre()
	{
			
	}
	
	public String correr() {
		return "Esse pato é um corredor: está correndo há " + getVelocidade() + "Km/h";
	}

	public double getVelocidade() {
		return 10;
	}

}
