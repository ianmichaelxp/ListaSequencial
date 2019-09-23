
public class ListaSequencial {
	private static final int ALOCACAO_INICIAL = 3;
	private Object[] arrayInterno = new Object[ALOCACAO_INICIAL];
	private int inseridos;
	int pos = 0;
	
	public void adicionarInicio(Object item)
	{
		if(inseridos == 0) {
			arrayInterno[0] = item;
			pos++;
			inseridos++;
		}
		
		else if(inseridos == arrayInterno.length)
		{
			Object[] novoArray = new Object[inseridos * 2];
			for(int i = 0; inseridos < arrayInterno.length; i++) 
			{
				novoArray[i+1] = arrayInterno[i];
			}	
			arrayInterno = novoArray;
		}
		else {
			for(int i = 0; i < inseridos; i++) {
				if(inseridos <= arrayInterno.length) 
				{
					arrayInterno[pos] = arrayInterno[pos-1];
					pos++;
					
				}
				
			}
			arrayInterno[0] = item;
			inseridos++;
			pos = 0;
		}
		
	}
	
	public Object retorna(int posicao) {
		return arrayInterno[posicao];
	}

}
