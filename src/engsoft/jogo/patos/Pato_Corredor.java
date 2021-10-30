package engsoft.jogo.patos;

public class Pato_Corredor extends Pato {

	public Pato_Corredor()
	{
		setCorredor(new Corre());		
	}
	
	public String mostrar() {
		return "Eu sou um pato que gosta de correr.";
	}
	
}
