package StudentDomen;

public class Teacher extends Person{
    private long TeacherId;

    public Teacher(String firstName, String secondName, int age, long teacherId) {
        super(firstName, secondName, age);
        TeacherId = teacherId;
    }

    public long getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(long teacherId) {
        TeacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TeacherId=" + TeacherId +
                '}';
    }
}
