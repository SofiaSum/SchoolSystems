public class Course {
    private String name;
    private int courseCode;
    private String teacher;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getCourseCode() {
        return courseCode;
    }

    private void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    private String getTeacher() {
        return teacher;
    }

    private void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
