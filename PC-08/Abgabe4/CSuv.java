public class CSuv extends CAuto {
    private final int mSerialNumber;
    private static int sSuvCount;
    private final boolean mOffroadDrivable;

    public CSuv() {
        super();
        mOffroadDrivable = false;
        mSerialNumber = sSuvCount++;
    }

    public CSuv(boolean offroadDrivable) {
        super();
        mOffroadDrivable = offroadDrivable;
        mSerialNumber = sSuvCount++;
    }

    public CSuv(final String color, final String brand, final int maxSpeed, final int gears, int performance, boolean offroadDrivable) {
        super(color, brand, maxSpeed, gears, performance);
        mOffroadDrivable = offroadDrivable;
        mSerialNumber = sSuvCount++;
    }

    public CSuv get() {
        CSuv suv = new CSuv(
                getColor(),
                getBrand(),
                getMaxSpeed(),
                getGears(),
                (int)getPerformanceKW(),
                mOffroadDrivable
        );

        suv.accelerate(this.getCurrentSpeed());
        suv.shiftGears(this.getCurrentGear());

        return suv;
    }

    public boolean isOffroadDrivable() {
        return mOffroadDrivable;
    }

    @Override
    public String getSerialNumber() {
        int first = 0;
        int serial = mSerialNumber;
        while (serial >= 10) {
            first++;
            serial -= 10;
        }

        return "" + first + "-" + serial;
    }
}