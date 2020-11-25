package Appointment_System.com;

public class Appointment {

    private String firstName;
    private String lastName;
    private TelephoneNumber phone;
    private Activity activity;


    public Appointment(String firstName, String lastName, TelephoneNumber phone, Activity activity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.activity = activity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public TelephoneNumber getPhone() {
        return phone;
    }

    public void setPhone(TelephoneNumber phone) {
        this.phone = phone;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", activity=" + activity +
                '}';
    }
}
