
public class CMain
{
public static void main (String []p_arg)
{
 final IFahrzeug l_auto1 = new CAuto("rot", "beetle", 5, 250, false,0, false);
final IFahrzeug l_suv1 = new CSuv1 ("rot", "beetle", 5, 250,false,0,false);
final IFahrzeug l_lkw1 = new CLkw (" blau","vw",5,100,false, 1000,false);
final IFahrzeug l_motorrad1 = new CMotorrad (true, 200, 5);

    l_auto1.schalte(1);
    l_auto1.beschleunige(30);
    l_auto1.bremse(0);
    System.out.println(((CAuto)l_auto1).getGang());
    System.out.println(((CAuto)l_auto1).getGeschwindigkeit());

    l_suv1.schalte(1);
    l_suv1.beschleunige(50);
    l_suv1.bremse(0);
    System.out.println(((CAuto)l_suv1).getGang());
    System.out.println(((CAuto)l_suv1).getGeschwindigkeit());

    l_lkw1.schalte(1);
    l_lkw1.beschleunige(10);
    l_lkw1.bremse(0);
    System.out.println(((CAuto)l_lkw1).getGang());
    System.out.println(((CAuto)l_lkw1).getGeschwindigkeit());

    l_motorrad1.schalte(1);
    l_motorrad1.beschleunige(10);
    l_motorrad1.bremse(0);
    System.out.println(((CMotorrad)l_motorrad1).getGang());
    System.out.println(((CMotorrad)l_motorrad1).getGeschwindigkeit());
}
}