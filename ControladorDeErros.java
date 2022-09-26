public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
		// verifica se qtdMax fornecida não é positiva, lançando
		// uma exceção.
    	if(qtdMax < 0) throw new Exception("Quantidade inválida");
    		
		// armazena qtdMax fornecida em this.qtdMax.
    	this.qtdMax= qtdMax;
    }

    public void registreUmErro () throws Exception
    {
        // verifica se this.qtdErr ja é igual a this.qtdMax,
        // lançando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
    	if(this.isAtingidoMaximoDeErros()) throw new Exception("Máximo de erros Atingido");
    	
    	this.qtdErr++;
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou então false, caso contrario.
    	return (this.qtdErr == this.qtdMax);
    }

    @Override
    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    @Override
    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    	if(this==obj) return true;
    	
    	if(obj==null) return false;
    	
    	if(this.getClass()!=obj.getClass()) return false;
    	
    	ControladorDeErros ce = (ControladorDeErros)obj;
    	
    	if(this.qtdErr != ce.qtdErr) return false;
    	if(this.qtdMax != ce.qtdMax) return false;
    	
    	return true;
    }

    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    	int n = 29;
    	
    	n = n*11 + new Integer (this.qtdErr).hashCode();
    	n = n*11 + new Integer (this.qtdMax).hashCode();
    	
    	if(n<0) n= -n;
    	
    	return n;
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de cópia
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
    	if(c==null)
    		throw new Exception("Controlador ausente");
    	
    	this.qtdErr = c.qtdErr;
    	this.qtdMax = c.qtdMax;
    }

    @Override
    public Object clone ()
    {
        // returnar uma cópia de this
    	ControladorDeErros c = null;
    	
    	try{
    		c = new ControladorDeErros(this);
    		
    	}catch(Exception e){}
    	
    	return c;
    }
}
