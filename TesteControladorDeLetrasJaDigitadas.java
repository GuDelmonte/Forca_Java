
public class TesteControladorDeLetrasJaDigitadas {
	public static void main (String args[])
	  {
		ControladorDeLetrasJaDigitadas c1 = null;
		ControladorDeLetrasJaDigitadas c2 = null;
		ControladorDeLetrasJaDigitadas c3 = null;
	      try
	    {
	      //testando o construtor
	      c1 = new ControladorDeLetrasJaDigitadas();
	      System.out.println (c1);		

	      //testando o método registre
	      c1.registre ('C');
	      c1.registre('A');
	      c1.registre('R');
	      System.out.println ("c1: "+c1);
	      //testando o método isJaDigitada
	     //c1.registre('K');
	      //System.out.println (c1);
	      	      
	      //testando o método equals
	      c2= new  ControladorDeLetrasJaDigitadas();
	      
	      c2.registre ('C');
	      c2.registre('A');
	      c2.registre('R');
	      
	      //System.out.println ("c2: "+c2);
	      
	      if(c1.equals(c2))
	        System.out.println("c1 é igual c2");
		  else
			System.out.println("c1 é diferente de c2");

	      //testando o método hashCode
		  System.out.println("hashCode de c1: "+c1.hashCode());
			    
		  //testando construtor de cópia e clone
		  //c3 = new ControladorDeLetrasJaDigitadas(c1);
	      c3= (ControladorDeLetrasJaDigitadas)c1.clone();
	      //System.out.println("c1: "+c1);
	      System.out.println("c3: "+c3);
	    }
	    catch (Exception erro)
	    {
	      System.err.println (erro.getMessage ());
	    }


	  }

}
