package StudentDomen;

public class Student extends Person implements Comparable<Student>{
    private long studentId;

    public Student(String firstName, String secondName, int age, long studentId) {
        super(firstName, secondName, age);
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId + "User{" +
                "FirstName='" + super.getFirstName() + '\'' +
                ", SecondName='" + super.getSecondName() + '\'' +
                ", Age=" + super.getAge() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(super.getFirstName() + " - " + o);
        if(super.getAge()==o.getAge()){
            if (this.studentId==o.studentId)
                {
                    return 0;
                }
            if (this.studentId<o.studentId)
                {
                    return -1;
                }
            return 1;
        }
        if(super.getAge()<o.getAge()){
            return -1;
        }
        return 1;
    }
}
