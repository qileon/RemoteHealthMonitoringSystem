public class Doctor {

    // this class represents a doctor in the system.
    // the doctor reviews alerts and sends feedback to patients.
    public String name;

    // creates a new doctor with the given name.
    public Doctor(String name) {
        this.name = name;
    }

    // handles an alert by checking the abnormal data,
    // creating a feedback message, and sending it to the patient.
    public void handleAlert(Alert alert, Patient patient) {
        System.out.println("Dr. " + name + " reviewing alert for " + patient.name);

        // builds a simple message explaining that the values are not normal.
        String msg = "Values abnormal (" + alert.dataSummary + "). Please visit the clinic.";
        Feedback fb = new Feedback(this.name, msg);

        // sends the feedback to the patient and marks the alert as resolved.
        patient.receiveFeedback(fb);
        alert.resolve();

        System.out.println("Dr. " + name + " sent feedback.");
    }
}
