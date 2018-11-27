
public class Main{
    public static void main(String[] p_args){
       
     final IFahrzeug l_auto = new CAuto("rot", "beetle", 5, 250);
     final IFahrzeug l_auto2 = new CAuto();
     final IFahrzeug l_suv = new CSuv();
      
     /*if (l_auto == l_auto2)
     {
          System.out.println("Gleichheit");
     }
     else 
     {
          System.out.println("Ungleichheit");
     }

     
     Seriennummer nummer = new Seriennummer();
     

     
     System.out.println(l_auto.getPower());
     System.out.println(l_auto.getPS());
     
     //System.out.println(l_auto.getSeriennummer()); */
     
     l_auto.beschleunige(50);
     
     l_auto2.bremse(30);
     
     l_suv.schalte(3);
   
    }
      

}  
