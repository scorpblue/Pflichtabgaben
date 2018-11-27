public class CMain 
{
    public static void main(String[] p_args)
    {
        IFahrzeug auto1 = new CLAuto("gruen", "chevrolet", 4, 193);
    
       
        IFahrzeug auto2 = new CSUV("silber", "bentley", 6, 290, false);
        IFahrzeug[] autos = {auto1, auto2};

        CMotorrad motorrad = new CMotorrad("schwarz", "harley", 2, 200, true);

        CLKW lkw = new CLKW("blau", "Scania", 12, 80, 40);

        auto1.beschleunige(50);
        auto1.schalte(2);
        auto1.bremse(20);

        auto2.beschleunige(50);
        auto2.schalte(2);
        auto2.bremse(20);

        System.out.println(motorrad.toString());
        System.out.println(lkw.toString());
    }
}