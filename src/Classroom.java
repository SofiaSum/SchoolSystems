public class Classroom {
    private String name;
    private int classCode;
    private String location;
    private String schedule;
    private int studentSize;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getClassCode() {
        return classCode;
    }

    private void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    private String getLocation() {
        return location;
    }

    private void setLocation(String location) {
        this.location = location;
    }

    private String getSchedule() {
        return schedule;
    }

    private void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    private int getStudentSize() {
        return studentSize;
    }

    private void setStudentSize(int studentSize) {
        this.studentSize = studentSize;
    }

}
