public class VitalSign {

    // this class stores the basic health values of a patient.
    // it keeps heart rate, blood pressure, and body temperature.
    private int heartRate;
    private int bp;
    private double temp;

    // creates a new vital sign record with the given values.
    public VitalSign(int heartRate, int bp, double temp) {
        this.heartRate = heartRate;
        this.bp = bp;
        this.temp = temp;
    }

    // checks if any value is higher than the normal range.
    // if yes, the system will treat the data as abnormal.
    public boolean isAbnormal() {
        return heartRate > 100 || bp > 140 || temp > 38.0;
    }

    // returns the vital signs as a simple and readable text.
    @Override
    public String toString() {
        return String.format("[HR: %d, BP: %d, Temp: %.1f]", heartRate, bp, temp);
    }
}
