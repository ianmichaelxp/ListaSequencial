
public class ListaSequencial {
	private static final int ALOCACAO_INICIAL = 3;
	private Object[] arrayInterno = new Object[ALOCACAO_INICIAL];
	private int inseridos;
	
	public void adicionarFim(Object item)
	{
		
		if(inseridos == arrayInterno.length)
			{
				dobrarArray();
			}
		else 
			{	
				arrayInterno[inseridos] = item;
				inseridos++;
			}
	}
	
	public void adicionarInicio(Object item) 
	{
		if(inseridos == arrayInterno.length) 
		{
			dobrarArray();
		}
		else 
		{
			Object[] novoArray = new Object[arrayInterno.length];
			for(int i = 0;i < inseridos;i++) 
			{
				novoArray[i+1] = arrayInterno[i];
				i++;
			}
			arrayInterno = novoArray;
		}		
		arrayInterno[0] = item;
		inseridos++;
	}
	
	public void dobrarArray() 
	{	
		Object[] novoArray = new Object[inseridos * 2];
		for(int i = 0; i < arrayInterno.length; i++) 
		{
			novoArray[i] = arrayInterno[i];
		}	
		arrayInterno = novoArray;
		
	}
	
	public Object retorna(int posicao) 
	{
		return arrayInterno[posicao];
	}
	

}
