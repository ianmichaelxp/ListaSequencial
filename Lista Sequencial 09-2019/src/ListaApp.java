
public class ListaApp {

	public static void main(String[] args) {
		ListaSequencial lista = new ListaSequencial();
		lista.adicionarInicio("c");
		lista.adicionarInicio("b");
		lista.adicionarInicio("a");
		
		 
		{
			System.out.println(lista.retorna(1));
			System.out.println(lista.retorna(2));
			System.out.println(lista.retorna(3));
			
		}
		
	}

}
