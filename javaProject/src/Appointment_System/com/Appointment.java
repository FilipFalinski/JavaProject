package Appointment_System.com;

import java.util.Calendar;

public class Appointment {

    private String firstName;
    private String lastName;
    private TelephoneNumber phone;
    private Activity activity;
    private Calendar aptDate;





    public Appointment(Calendar aptDate,String firstName, String lastName, TelephoneNumber phone, Activity activity) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setActivity(activity);
        setAptDate(aptDate);
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

    public Calendar getAptDate() {
        return aptDate;
    }

    public void setAptDate(Calendar aptDate) {
        this.aptDate = aptDate;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getActivity() + '\'' +
                ", phone=" + getPhone() +
                ", activity=" + getActivity() +
                ", aptDate=" + getAptDate() +
                '}';
    }
}
