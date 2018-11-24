public class CMain
{
    public static void main(String[] args)
    {
        final CAuto auto = new CAuto();
        final CSuv Tiguan = new CSuv("grau", "VW Tiguan", 200, 6, 250, true );
        IFahrzeug CoolesA;
        IFahrzeug CoolerSUV;
        CoolesA = auto;
        CoolerSUV = Tiguan;

        CAuto auto2 = new CSuv("gelb", "Golf", 160, 5, 120, false);
        CSuv suv1 =(CSuv)auto2;
        System.out.println(auto2);
        System.out.println(suv1);

        CoolesA.beschleunige(20);
        CoolerSUV.schalte("R");
        
        final CMotorrad motorrad = new CMotorrad();
        motorrad.beschleunige(5.0);
        System.out.println(motorrad);
        
        final CLkw lkw = new CLkw();
        lkw.lade(100);
        lkw.beschleunige(10.0);
        System.out.println(lkw);

        System.out.println(Tiguan);

        System.out.println(auto);

    }

}