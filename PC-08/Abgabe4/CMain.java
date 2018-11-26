public class CMain {
    public static void main(String[] args) {

        IFahrzeug car = new CAuto();
        IFahrzeug suv = new CSuv();
        IFahrzeug truck = new CLkw();
        IFahrzeug bike = new CMotorrad();

        car.accelerate(10);
        car.brake(5);
        car.shiftGears(2);
        suv.accelerate(10);
        suv.brake(5);
        suv.shiftGears(2);

        truck.accelerate(10);
        truck.brake(5);
        truck.shiftGears(2);
        ((CLkw)truck).setLoad(500);

        bike.accelerate(10);
        bike.brake(5);
        bike.shiftGears(2);
        System.out.println("Bike has " + ((CMotorrad)bike).getCcm() + "ccm");

        System.out.println(car.toString());
        System.out.println(suv.toString());
        System.out.println(bike.toString());
        System.out.println(truck.toString());
    }
}