public class Main{
    public static void main(String[] p_args){
       
     final IFahrzeug l_auto = new CAuto("rot", "beetle", 5, 250);
     final IFahrzeug l_auto2 = new CAuto();
     final IFahrzeug l_suv = new CSuv();
     final IFahrzeug l_LKW = new CLKW("Schwarz", "Mercedes" , 6, 80, true);
     final IFahrzeug l_Motorrad = new CMotorrad ("Kawasaki", 100, true);
      
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
     
     l_LKW.beschleunige(60);
     
     l_Motorrad.bremse(50); //The type CMotorrad must implement the inherited abstract method IFahrzeug.bremse(int)
     l_Motorrad.beschleunige(100);
   
    }
      

}  
