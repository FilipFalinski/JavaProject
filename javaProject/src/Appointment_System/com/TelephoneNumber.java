package Appointment_System.com;

public class TelephoneNumber {

    private int areaCode;
    private int prefix;
    private int lineNumber;

    public TelephoneNumber(int areaCode, int prefix, int lineNumber) {
        setAreaCode(areaCode);
        setPrefix(prefix);
        setLineNumber(lineNumber);
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "TelephoneNumber{" +
                "areaCode=" + getAreaCode() +
                ", prefix=" + getPrefix() +
                ", lineNumber=" + getLineNumber() +
                '}';
    }
}
