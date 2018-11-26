public class CLkw extends CAuto implements IFahrzeug {

    private final int mMaxLoad; 

    private int mCurrentLoad = 0;

    public CLkw() {
        this("blau", "MAN", 100, 6, 500, 20000);
    }

    public CLkw(final String color, final String brand, final int maxSpeed, final int gears, int performance, int maxLoad) {
        super(color, brand, maxSpeed, gears, performance);
        mMaxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return mMaxLoad;
    }

    public void setLoad(final int load) {
        if (load >= 0 && load <= mMaxLoad)
            mCurrentLoad = load;

        System.out.println("Changed load to " + mCurrentLoad + "kg");
    }

    public int getCurrentLoad() {
        return mCurrentLoad;
    }

    @Override
    public void shiftGears(final int gear) {
        super.shiftGears(gear);
    }

    @Override
    public void accelerate(final int increment) {
        super.accelerate(increment);
    }

    @Override
    public void brake(final int decrement) {
        accelerate(-1 * decrement);
    }

    @Override
    public String toString() {
        String s = this.getClass().getName();
        s += " : " + this.hashCode();
        s += "\nTop speed: " + getMaxSpeed();
        s += "\nCurrent speed: " + getCurrentSpeed();
        s += "\nGears: " + getGears();
        s += "\nCurrentGear: " + getCurrentGear();
        s += "\nMaximum load: " + mMaxLoad;
        s += "\nCurrent load: " + mCurrentLoad;
        
        return s;
    }
}