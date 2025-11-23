public class Alert {

    // this class represents an alert created when abnormal data is detected.
    // it stores the patient name, a short summary of the data, and if the alert is solved.
    public String patientName;
    public String dataSummary;
    public boolean resolved;

    // creates a new alert with the given information.
    // the alert starts as not resolved.
    public Alert(String patientName, String dataSummary) {
        this.patientName = patientName;
        this.dataSummary = dataSummary;
        this.resolved = false;
    }

    // marks the alert as resolved when the doctor finishes reviewing it.
    public void resolve() {
        this.resolved = true;
    }
}
