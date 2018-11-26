public class CMain {
    public static void main(String[] args) {

        IFahrzeug car = new CAuto();
        IFahrzeug suv = new CSuv();

        car.accelerate(10);
        car.brake(5);
        car.shiftGears(2);
        suv.accelerate(10);
        suv.brake(5);
        suv.shiftGears(2);

    }
}