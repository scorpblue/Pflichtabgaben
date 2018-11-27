/*
 * @cond LICENSE
 * ######################################################################################
 * # Creative Commons BY SA                                                             #
 * #                                                                                    #
 * # Authored by JÃ¶rg MÃ¼ller 2019                                                       #
 * ######################################################################################
 * @endcond
 */


/**
 * Test Mainmethode fÃ¼r hierarchische Typenvererbung
 * demonstriert Vewrwendung von instanceof und Casting bei Klassen mit Vererbung
 */

public class CMain
{
 

    public static void main( String[] p_args )
    {
    	CMotorrad m1 = new CMotorrad("Gelb", "Honda", 5, 220);
    	System.out.println(m1);
    	CAuto m2 = new CLkw("Weiß", "VW", 6, 200, "22m");
    	System.out.println(m2);
    }
}
