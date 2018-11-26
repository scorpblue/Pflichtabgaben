public class CAuto implements IFahrzeug {
    private static int sCarCount;

    private final String mColor;
    private final String mBrand;
    private final int mMaxSpeed;
    private final int mGears;
    private final int mSerialNumber;

    private int mCurrentGear = 1;
    private int mCurrentSpeed = 0;
    private double mPerformance; // in KW

    public CAuto() {
        this("Silber", "VW", 230, 5, 75);
    }

    public CAuto(final String color, final String brand, final int maxSpeed, final int gears, int performance) {
        mColor = color;
        mBrand = brand;
        mMaxSpeed = maxSpeed;
        mGears = gears;
        mPerformance = performance;

        mSerialNumber = sCarCount++;
    }

    public CAuto get() {
        CAuto car = new CAuto(mColor, mBrand, mMaxSpeed, mGears);
        car.accelerate(mCurrentSpeed);
        car.shiftGears(mCurrentGear);

        return car;
    }

    public String getColor() {
        return mColor;
    }

    public String getBrand() {
        return mBrand;
    }

    public int getMaxSpeed() {
        return mMaxSpeed;
    }

    public int getGears() {
        return mGears;
    }

    public int getCurrentSpeed() {
        return mCurrentSpeed;
    }

    public int getCurrentGear() {
        return mCurrentGear;
    }

    @Override
    public void shiftGears(int gear) {
        if (gear < -1 || gear > mGears)
            return;

        mCurrentGear = gear;

        System.out.println(this.getClass().getName() + " shifted to gear: " + mCurrentGear);
    }

    public void setPerformance(int performanceInKW) {
        if (mPerformance <= 0.0)
            return;
        
        mPerformance = performanceInKW;
    }

    public double getPerformanceKW() {
        return mPerformance;
    }

    public double getPerformanceHP() {
        return getHP(mPerformance);
    }

    public String getSerialNumber() {
        int first = 0;
        int serial = mSerialNumber;
        while (serial >= 10) {
            first++;
            serial -= 10;
        }

        return "" + first + "-" + serial;
    }

    @Override
    public void accelerate(int increment) {
        if (mCurrentGear == 0)
            return;
        
        if (mCurrentGear == -1)
        increment = -1 * increment;

        if (mCurrentSpeed + increment > mMaxSpeed) {
            mCurrentSpeed = mMaxSpeed;
            return;
        }
        
        if (mCurrentSpeed + increment < 0) {
            mCurrentSpeed = 0;
            return;
        }

        mCurrentSpeed += increment;

        System.out.println(this.getClass().getName() + " changed speed to " + mCurrentSpeed + "km/h");
    }

    @Override
    public void brake(int decrement) {
        accelerate(-1 * decrement);
    }

    public void shiftUp() {        
        shiftGears(mCurrentGear + 1);
    }

    public void shiftDown() {
        shiftGears(mCurrentGear - 1);
    }

    public static double getHP(double performanceInKW) {
        return performanceInKW * 1.36;
    }
}