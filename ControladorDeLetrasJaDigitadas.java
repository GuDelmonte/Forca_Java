public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        // torna this.letrasJaDigitadas igual ao String vazio
    	letrasJaDigitadas= "";
    }

    public boolean isJaDigitada (char letra)
    {
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
    	for(int i= 0; i<this.letrasJaDigitadas.length();i++)
    		if(letra==this.letrasJaDigitadas.charAt(i))
    			return true;
    	
    	return false;
    }

    public void registre (char letra) throws Exception
    {
		// verifica se a letra fornecida ja foi digitada (pode usar
		// o m?todo this.isJaDigitada, para isso), lancando uma exce??o
		// em caso afirmativo.
		// concatena a letra fornecida a this.letrasJaDigitadas.
    	if(this.isJaDigitada(letra))
    		throw new Exception("Letra ja Digitada");
    	
    	this.letrasJaDigitadas +=  letra;
    }

    @Override
    public String toString ()
    {
		// retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por v?rgula (,).
    	String c= "[";
    	
    	if(this.letrasJaDigitadas.length()>0)
    		c += this.letrasJaDigitadas.charAt(0);
    	
    	for(int i= 1; i<this.letrasJaDigitadas.length();i++)
    		c += ", " + this.letrasJaDigitadas.charAt(i);
    	
    	return c+="]";
    }

    @Override
    public boolean equals (Object obj)
    {
        // verificar se this e obj s?o iguais
    	if(this==obj) return true;
    	
    	if(obj==null) return false;
    	
    	if(this.getClass()!=obj.getClass()) 
    		return false;
    	
    	ControladorDeLetrasJaDigitadas c=
    		(ControladorDeLetrasJaDigitadas) obj;
    	
    	if(!this.letrasJaDigitadas.equals(c.letrasJaDigitadas))
    		return false;
    	
    	return true;
    }

    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    	int n= 29;
    	
    	if(this.letrasJaDigitadas != null)
    		n= n*11 + this.letrasJaDigitadas.hashCode();
        
        if(n<0) n= -n;
        
    	return n;	
    }

    public ControladorDeLetrasJaDigitadas(
    ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception // construtor de c?pia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
    	if(controladorDeLetrasJaDigitadas==null)
    		throw new Exception("Controlador ausente");
    		
    	this.letrasJaDigitadas=
    		controladorDeLetrasJaDigitadas.letrasJaDigitadas;
    }

    @Override
    public Object clone ()
    {
        // criar uma c?pia do this com o construtor de c?pia e retornar
    	ControladorDeLetrasJaDigitadas c= null;
    	
    	try{
    		c = new ControladorDeLetrasJaDigitadas(this);
    		
    	}catch(Exception e){}
    	
    	return c;    	
    }
}
