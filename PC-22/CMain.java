public class CMain{
    public static void main(String[] pargs){
        IFahrzeug auto1 = new CAuto();
        System.out.println("Geschwindigkeit 1 Auto 1: " + auto1.getGeschwindigkeit());
        auto1.beschleunige(10);
        System.out.println("Geschwindigkeit 2 Auto 1: " + auto1.getGeschwindigkeit());


        IFahrzeug suv1 = new CSuv();
        System.out.println("Geschwindigkeit 1 SUV 1: " + auto1.getGeschwindigkeit());
        suv1.beschleunige(20);
        System.out.println("Geschwindigkeit 2 SUV 1: " + suv1.getGeschwindigkeit());
        suv1.bremse(10);
        System.out.println("Geschwindigkeit 3 SUV 1: " + suv1.getGeschwindigkeit());

        IFahrzeug rad1= new CMotorrad();
        rad1.beschleunige(10);
        System.out.println(rad1.getGeschwindigkeit());
        

      }
}