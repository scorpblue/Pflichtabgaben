public class CMain
{
    //main methode aufrufen
    public static void main(String[] args)
    {
        //Instanziierung
        final CAuto berline = new CAuto("schwarz", "mercedes", 360, 5);
        final CSuv aceta = new CSuv("gelb", "seat", 300, 5, false);

        //Erstellung von Variable Typ IFahrzeug
        IFahrzeug BestAuto;
        IFahrzeug BestSUV;

        BestAuto = berline;
        BestSUV = aceta;

        BestAuto.beschleunige(20);
        BestSUV.schalte("R");

        CAuto aviator = new CSuv ("pink", "peugeot", 250, 5, true);
        CSuv mileage = (CSuv)aviator;
        System.out.println(aviator);
        System.out.println(mileage);
        System.out.println(berline);
        System.out.println(aceta);

        final CMotorad nera = new CMotorad();
        nera.beschleunige(15.0);
        System.out.println(nera);

        final CLkw lkw = new CLkw();
        lkw.beschleunige(20.0);
        System.out.println(lkw);
        
    }
}