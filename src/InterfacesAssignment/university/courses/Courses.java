package InterfacesAssignment.university.courses;

public class Courses implements Display{
    private int courseId;
    private String courseName;
    private int courseFees;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(int courseFees) {
        this.courseFees = courseFees;
    }

    public Courses(int courseId, String courseName, int courseFees) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFees = courseFees;
    }

    @Override
    public void print() {
        System.out.println("Course details are ");
        System.out.println("course Name: "+getCourseName()+"\t"+"Course Id "+getCourseId()+"\t"+"Course Fees "+getCourseFees());
    }
}
