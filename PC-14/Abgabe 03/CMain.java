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
    	CAuto auto1 = new CAuto("Schwarz", "BMW", 5, 270);
    	CAuto auto2 = new CSuv("Blau", "Ford", 6, 250, false);
    	IFahrzeug BMW = auto1;
    	IFahrzeug Ford = auto2;
    	BMW.schalte(2);
    	Ford.schalte(3);
    	System.out.println(auto1.getGang());
    	System.out.println(auto2.getGang());
    	BMW.beschleunige(10);
    	Ford.beschleunige(15);
    	System.out.println(auto1.getInkrement());
    	System.out.println(auto2.getInkrement());
    	BMW.bremse(5);
    	Ford.bremse(6);
    	System.out.println(auto1.getDekrement());
    	System.out.println(auto2.getDekrement());
    }
}