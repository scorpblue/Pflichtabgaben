/*
 * @cond LICENSE
 * ######################################################################################
 * # Creative Commons BY SA                                                             #
 * #                                                                                    #
 * # Authored by Jörg Müller 2019                                                       #
 * ######################################################################################
 * @endcond
 */


/**
 * Diese Klasse führt in der main() Methode die Simulation aus
 */

public class CMain
{
    private final static int MAX_TIME = 50; 

    public static void main( String[] p_args )
    {
    // erzeuge Autos
        CAuto auto1 = new CAuto("rot", "trabbi", EAutoTyp.LANGSAM, 4, 110);
        CAuto auto2 = new CAuto("gelb", "golf", EAutoTyp.MITTEL, 5, 160);
        CAuto auto3 = new CAuto("gruen", "porsche", EAutoTyp.SCHNELL, 7, 250);
        CAuto auto4 = new CSuv();
        CAuto auto5 = new CSuv("gelb", "golf", EAutoTyp.SCHNELL, 5, 160, false);
        CAuto auto6 = new CSuv("gelb", "golf", EAutoTyp.MITTEL, 5, 160, false);
        CAuto auto7 = new CAuto("grün", "trabbi", EAutoTyp.MITTEL, 4, 120);
        CAuto auto8 = auto6; 
        CAuto auto9 = auto7;
        CSuv suv1 = (CSuv) auto5;
        CAuto[] autos = {auto1, auto2, auto3, auto4, auto5, auto6, auto7, auto8, auto9};

// auto1 und auto2 können irgendwo her kommen, wir kennen nur den Typ "CAuto"
    
   
    if (auto8 instanceof CSuv){
        CSuv auto10 =  (CSuv) auto8;
      auto10.setm_offroadFahrbar(true); // Casting nötig, sonst Compiler-Fehler!
    System.out.println(auto10);
    }


   
    /*if (auto9 instanceof CSuv){
      ((CSuv)auto9).setm_offroadFahrbar(true); // Casting nötig, sonst Compiler-Fehler!
    }
    System.out.println(auto9);
*/
        System.out.println(auto5);
        System.out.println(suv1);
        System.out.println(auto1.getm_SNR());
        System.out.println(auto2.getm_SNR());
        System.out.println(auto3.getm_SNR());
        System.out.println(auto4.getm_SNR());

     // erzeuge Fahrer und weise Autos zu
        CFahrer fahrer1 = new CFahrer("helga", EFahrerTyp.NORMAL, 80, auto1);
        CFahrer fahrer2 = new CFahrer("willi", EFahrerTyp.SPORTLICH, 160, auto2);
        CFahrer fahrer3 = new CFahrer("heinz", EFahrerTyp.ENTSPANNT, 120, auto3);
        CFahrer fahrer4 = new CFahrer("kevin", EFahrerTyp.SPORTLICH, 200, auto4);
        CFahrer[] fahrer = {fahrer1, fahrer2, fahrer3, fahrer4};
     
    // führe die Simulation aus und mache Ausgaben
    
        int aktZeit = 0; // initial 0
        

        while (aktZeit < MAX_TIME){
            // bei jedem 10ten Durchlauf Zustand ausgeben
            if (aktZeit % 10 == 0)
                System.out.println("Zeit: " + aktZeit);
            
            for (int j=0; j<fahrer.length; j++){
                fahrer[j].fahre();
                if (aktZeit % 10 == 0)
                    System.out.println(fahrer[j]);
            }

            aktZeit++;

            //now update positions of the cars
            for (int k=0; k<autos.length;k++){
                autos[k].incrementPosition(
                    autos[k].getAktGeschwindigkeit());
            }
        }
        // at the end: output final positions again
        System.out.println("Zeit: " + aktZeit);
        for (int j=0; j<fahrer.length; j++)
            System.out.println(fahrer[j]);
    }

}
