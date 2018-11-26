public interface IFahrzeug {
    void shiftGears(final int gear);
    void accelerate(final int increment);
    void brake(final int decrement);
}