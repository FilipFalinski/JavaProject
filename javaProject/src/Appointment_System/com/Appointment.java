package Appointment_System.com;


import java.util.Calendar;

public class Appointment {

    private String Name;
    private TelephoneNumber phone;
    private Activity activity;
    private Calendar aptDate;


    public Appointment(String name, TelephoneNumber phone, Activity activity, Calendar aptDate) {
        setName(name);
        setPhone(phone);
        setActivity(activity);
        setAptDate(aptDate);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
                "Name='" + getName() + '\'' +
                ", phone=" + getPhone() +
                ", activity=" + getActivity() +
                ", aptDate=" + getAptDate() +
                '}';
    }
}
