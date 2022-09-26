public class TesteTracinhos{
    public static void main (String args [])
    {
        String teste = "PRIVATIVO";

		Tracinhos tr1 = null;
		Tracinhos tr2 = null;
		Tracinhos tr3 = null;
		try
		{
	        //testando o construtor e toString
		    tr1 = new Tracinhos (teste.length());
		    //System.out.println("Os tracinhos são "+tr1);
		    
		    tr2 = new Tracinhos (teste.length());
		    //tr3 = new Tracinhos (-1);
		    
		    
		    //testando método revele
	    
		     //tr1.revele(0,'P');
		     //tr1.revele(1,'R');
		     //tr1.revele(2,'I');
		     //tr1.revele(3,'V');
		     //tr1.revele(4,'A');
		     //tr1.revele(4,'A');
		     //tr1.revele(5,'T');
		     //tr1.revele(6,'I');
		     //tr1.revele(7,'V');
		     //tr1.revele(8,'O');
		     
		    
		    System.out.println("tr1: "+tr1);
		    
		    tr2.revele(0,'P');
		    tr2.revele(1,'R');
		    
		    System.out.println("tr2: "+tr2);
		 
		    
		   //testando método isAindaComTracinhos
		   if(tr1.isAindaComTracinhos())
		        System.out.println("Ainda com tracinhos: "+tr1);
		   else
		        System.out.println("Sem tracinhos: "+tr1);
		  
		  //testando o método equals      
		  if(tr1.equals(tr2))
		       System.out.println("tr1 é  igual de tr2");
		  else
		       System.out.println("tr1 é  diferente de tr2");
		        
		  //testando o método hashCode
		  System.out.println("hashCode de tr1: "+tr1.hashCode());
		    
		  //testando construtor de cópia e clone
		  tr3 = new Tracinhos(tr1);
		  //tr3= (Tracinhos)tr1.clone();
		  System.out.println("tr1: "+tr1);
		  System.out.println("tr3: "+tr3);
        }
        catch (Exception erro)
        {
            System.err.println(erro.getMessage());
        }
    }
}