package People;

public class Teacher {
    //Setter & Getter
    private String name;
    private String subject;
    private int phoneNumber;
    private int SchoolID;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getSubject() {
        return subject;
    }

    private void setSubject(String subject) {
        this.subject = subject;
    }

    private int getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private int getSchoolID() {
        return SchoolID;
    }

    private void setSchoolID(int schoolID) {
        SchoolID = schoolID;
    }
}
