public class CMain
{
  public static void main(String[] args)
  {
    
    CAuto n_auto = new CAuto( "schwarz", "BMW", 6, 320, 100);  
    CAuto b_auto = new CAuto( "schwarz", "BMW", 6, 320, 200);
    CAuto c_auto = new CAuto( "weiss", "BMW", 6, 320, 300);
    CSuv  d_auto = new CSuv("schwarz", "VW", 8, 200, 200, true);
    IFahrzeug e_auto = new CAuto("blau","Audi", 6, 321, 100);
    if( n_auto == n_auto)
      System.out.println( n_auto +"="+ n_auto);
    else
    { 
      System.out.println( "ungleich");
    }
    System.out.println( n_auto);
    System.out.println( e_auto);
    CAuto auto1 = new CSuv("gelb", "golf", 5, 160, 200, false);
    CAuto auto2 = new CAuto("grün", "trabbi", 4, 120, 60);

    CAuto auto3 = auto1; 
    if (auto3 instanceof CSuv){
      ((CSuv)auto3).setOffroadFahrbar(true); // Casting nötig, sonst Compiler-Fehler!
    }
    System.out.println(auto3);

    CAuto auto4 = auto2;
    if (auto4 instanceof CSuv){
      ((CSuv)auto4).setOffroadFahrbar(true); // Casting nötig, sonst Compiler-Fehler!
    }
    System.out.println(auto4);
  } 
}  
  