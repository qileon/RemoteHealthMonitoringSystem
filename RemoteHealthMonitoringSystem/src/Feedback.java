public class Feedback {

    // this class represents a feedback message sent from a doctor to a patient.
    // it stores the doctor's name and the content of the message.
    private String doctorName;
    private String message;

    // creates a new feedback object with the doctor's name and the message text.
    public Feedback(String doctorName, String message) {
        this.doctorName = doctorName;
        this.message = message;
    }

    // returns the feedback in a simple and readable format.
    @Override
    public String toString() {
        return "From Dr. " + doctorName + ": " + message;
    }
}
