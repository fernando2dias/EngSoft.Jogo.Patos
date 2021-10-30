package engsoft.jogo.patos;

public abstract class Pato {
	
	protected Padrao_Voaveis comportamento_pato;
	protected Padrao_Correr corredor;

	abstract String mostrar();
	
	public String nadar()
	{
		return "Pato Nadando.";		
	}	
	
	public String correr(){
		return "Estou correndo...";
	}

	public void setComportamento(Padrao_Voaveis padrao )
	{
		comportamento_pato = padrao;		
	}
	
	public String comportamento_pato()
	{		
		return comportamento_pato.voar();		
	}

	public void setCorredor(Padrao_Correr padrao){
		corredor = padrao;
	}

	public String corredor(){
		return corredor.correr();
	}
}
