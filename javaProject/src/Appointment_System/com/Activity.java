package Appointment_System.com;

public class Activity {

    private String descriptionOfWork;
    private String category;


    public String getDescriptionOfWork() {
        return descriptionOfWork;
    }

    public void setDescriptionOfWork(String descriptionOfWork) {
        this.descriptionOfWork = descriptionOfWork;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "descriptionOfWork='" + getDescriptionOfWork() + '\'' +
                ", category='" + getCategory() + '\'' +
                '}';
    }
}
