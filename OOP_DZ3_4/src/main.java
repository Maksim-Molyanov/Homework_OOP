import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.*;

public class main {
    public static void main(String[] args) throws Exception {
        Person man = new Person("Денис", "Криницын", 35);

        Student pers1 = new Student("Денис", "Криницын", 35, 1);
        Person p1 = new Student("Сергей", "Иванов", 22, 101);

        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);
        Student s7 = new Student("Ксюша", "Сентюрова", 24, 134);
        Student s8 = new Student("Сергей", "Коровин", 24, 112);
        Student s9 = new Student("Илья", "Сухов", 25, 142);
        Student s10 = new Student("Олег", "Веселухин", 23, 164);


        /** Заполнение @listStud1 студентами */
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(pers1);
        StudentGroup StudentGroup1 = new StudentGroup(listStud1,1);
        /** Заполнение @listStud2 студентами */
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s5);
        listStud2.add(s6);
        listStud2.add(s7);
        StudentGroup StudentGroup2 = new StudentGroup(listStud2,2);
        /** Заполнение @listStud3 студентами */
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s8);
        listStud3.add(s9);
        listStud3.add(s10);
        StudentGroup StudentGroup3 = new StudentGroup(listStud3,3);

        /** Добавление групп со студентами */
        StudentCourse course = new StudentCourse(100);
        course.addCourse(StudentGroup1);
        course.addCourse(StudentGroup2);
        course.addCourse(StudentGroup3);

        System.out.println("=============================");
        /** Сортировка группы*/
        Collections.sort(course.getCourse());
        for (StudentGroup studentGroup : course) {
            System.out.println(studentGroup);
        }


        StudentGroup group4335 = new StudentGroup(listStud1, 4335);
        //System.out.println(group4335.toString());

        for (Student stud : group4335) {
            System.out.println(stud.toString());
        }

        System.out.println("===============================");
        Collections.sort(group4335.getGroup());

        for (Student stud : group4335) {
            System.out.println(stud.toString());
        }
    }
}