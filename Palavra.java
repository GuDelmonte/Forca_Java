public class Palavra implements Comparable<Palavra>
{
    private String texto;
    private static int iezima= 0;
    
    public Palavra (String texto) throws Exception
    {
		// verifica se o texto recebido é nulo ou então vazio,
		// ou seja, sem nenhum caractere, lançando exceção.
    	if(texto==null||texto=="")
    		throw new Exception("Texto invalido");
    	
		// armazena o texto recebido em this.texto.
    	this.texto= texto;
    }

    public int getQuantidade (char letra)
    {
        // percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida
    	int qtd= 0;
    	
    	for(int i= 0; i<this.getTamanho();i++)
    		if(letra == this.texto.charAt(i))
    			qtd++;
    	
    	return qtd;
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lançar excecao caso nao encontre em this.texto
        // a Iézima aparição da letra fornecida.
    	if(this.getQuantidade(letra)==0)
    		throw new Exception("A palavra nao tem essa letra");
 
        int j;
    	for(j=iezima; j<this.getTamanho();j++)
    		    if(letra == this.texto.charAt(j)){
    			  iezima=j+1;
    			  break;
	            }
	   
	   if(i == this.getQuantidade(letra)-1)
	    iezima= 0;
	    
	   return j;
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    @Override
    public String toString ()
    {
        return this.texto;
    }

    @Override
    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    	if(this == obj) return true;
    	
    	if(obj == null) return false;
    	
    	if(this.getClass()!=obj.getClass()) return false;
    	
    	Palavra p = (Palavra)obj;
 
    	if(!this.texto.equals(p.texto)) return false;

    	return true;
    }

    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    	int n= 29;
    	
    	if(this.texto != null)
    		n= n*11 + this.texto.hashCode();
        
        if(n<0) n= -n;
        
    	return n;	
    }

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
