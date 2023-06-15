package StudentDomen;

public class Person {
    private String FirstName;
    private String SecondName;
    private int Age;

    public Person(String firstName, String secondName, int age) {
        FirstName = firstName;
        SecondName = secondName;
        Age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "FirstName='" + FirstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", Age=" + Age +
                '}';
    }
}
