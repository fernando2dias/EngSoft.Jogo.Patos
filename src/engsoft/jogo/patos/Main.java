package engsoft.jogo.patos;

public class Main {

	public static void main(String[] args) {
		Pato pt = new Pato_Ruivo();		
		
		System.out.println(pt.mostrar());
		System.out.println(pt.nadar());
		System.out.println(pt.comportamento_pato());
		
		pt.setComportamento(new Voar_Foguete());
		
		System.out.println(pt.comportamento_pato());
		
		System.out.println("********** \n\n");


		Pato pato2 = new Pato_Corredor();
		System.out.println(pato2.mostrar());
		System.out.println(pato2.corredor());
		System.out.println(pato2.correr());



		System.out.println("********** \n\n");


		Pato pato3 = new Pato_Maratonista();
		System.out.println(pato3.mostrar());
		System.out.println(pato3.corredor());
		System.out.println(pato3.correr());

	}

}
