package engsoft.jogo.patos;

public class Pato_Maratonista extends Pato {

	public Pato_Maratonista()
	{
		setCorredor(new Corre());		
	}
	
	public String mostrar() {
		return "Eu sou um pato que gosta de correr longas distancias. \n Um dia iriei para as Olimpiadas!";
	}
	
}
