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
 * Test Mainmethode für hierarchische Typenvererbung
 * demonstriert Vewrwendung von instanceof und Casting bei Klassen mit Vererbung
 */

public class CMain
{
 

    public static void main( String[] p_args )
        {
        CAuto auto1 = new CSuv("gelb", "golf", 5, 160, false);
        IFahrzeug fahrzeug;
        fahrzeug = auto1;

        CAuto auto2 = new CAuto("blau", "BMW", 6, 180);
        IFahrzeug fahrzeug2;
        fahrzeug2 = auto2;
        
        fahrzeug.schalte(3);
        fahrzeug2.schalte(2);

        System.out.println(auto1.getGang());
        System.out.println(auto2.getGang());

        // nutze diese Methode für die weiteren Teile der Aufgabe
     
    }
}
