import java.util.ArrayList;
import java.util.List;

public class Patient {

    // this class represents a patient in the system.
    // it stores the patient's name and a list of feedback messages.
    public String name;
    private List<Feedback> inbox;

    // creates a new patient with an empty inbox.
    public Patient(String name) {
        this.name = name;
        this.inbox = new ArrayList<>();
    }

    // patient creates new vital sign data and sends it to the system.
    public VitalSign generateData(int hr, int bp, double temp) {
        System.out.println(name + " sending data...");
        return new VitalSign(hr, bp, temp);
    }

    // receives a feedback message from the doctor and saves it to the inbox.
    public void receiveFeedback(Feedback feedback) {
        inbox.add(feedback);
    }

    // prints all feedback messages in the patient's inbox.
    // if the inbox is empty, it shows a simple empty message.
    public void checkInbox() {
        System.out.println("Inbox for " + name);
        if (inbox.isEmpty()) {
            System.out.println("(Empty)");
        } else {
            for (Feedback f : inbox) {
                System.out.println(f);
            }
        }
    }
}
