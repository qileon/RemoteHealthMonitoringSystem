public class RemoteHealthMonitoringSystem {

    // this method controls the main logic of the system.
    // it checks the patient's vital signs and decides if an alert is needed.
    public static void processVitals(Patient patient, Doctor doctor, VitalSign vitals) {
        System.out.println("System analyzing: " + vitals);

        // if the values are abnormal, the system creates an alert
        // and sends it to the doctor for review.
        if (vitals.isAbnormal()) {
            System.out.println(">> CRITICAL: Generating Alert.");
            Alert alert = new Alert(patient.name, vitals.toString());
            doctor.handleAlert(alert, patient);
        } else {
            // if everything is normal, the system simply prints the status.
            System.out.println(">> Status: Normal.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== System Initialized ===\n");

        // create the patient and doctor objects.
        Patient isik = new Patient("Isik");
        Doctor drSirac = new Doctor("Sirac");

        // scenario 1: patient sends normal health data.
        VitalSign v1 = isik.generateData(75, 120, 36.5);
        processVitals(isik, drSirac, v1);

        // scenario 2: patient sends abnormal health data.
        VitalSign v2 = isik.generateData(110, 160, 38.5);
        processVitals(isik, drSirac, v2);

        // patient checks the inbox to read feedback messages.
        isik.checkInbox();
    }
}
