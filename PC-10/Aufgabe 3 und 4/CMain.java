public class CMain {
public static void main(String[] args){
    CAuto auto_1 = new CAuto("blau", "Porsche", 6, 300);
          CSuv suv_1 = new CSuv ("rosa", "SUV", 15, 10, true);
    CLkw lkw_1 = new CLkw ("Schwarz", "Marke", 5, 80, 7);
    CMotorrad motorrad_1 = new CMotorrad (01 , "KTM", 300);  
             System.out.println("brummbrumm");
        CAuto[] a_Auto = new CAuto[2];
        a_Auto[0] = new CAuto("blau", "Porsche", 6, 300);
        a_Auto[1] = new CSuv( "rot", "VW", 5, 250, false );
   System.out.println(suv_1.toString());
   System.out.println(lkw_1.toString());
   System.out.println(motorrad_1.toString());
  System.out.println( a_Auto[0].getFarbe() + " " + a_Auto[1].getFarbe());
  //System.out.println(a_Auto.length);
}
}
