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

    public static void main( String[] p_args )
    {
    // erzeuge Autos
        CAuto auto1 = new CAuto("rot", "trabbi", 4, 110);
        CAuto auto2 = new CSuv("gelb", "Q2", 5, 160, false);
        auto1.beschleunige(5);
        auto2.bremse(5);
    }
}
