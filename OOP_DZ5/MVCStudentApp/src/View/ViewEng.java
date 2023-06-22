package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;
/**Класс Вид на Аглийском языке */
public class ViewEng implements iGetView{
    public void printAllStudents(List<Student> students) {
        System.out.println("----Displaying a list of students!----");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----End of list!----");
    }

    @Override
    public String prompt(String message) {
        Scanner scaner = new Scanner(System.in);
        System.out.println(message);
        return scaner.nextLine();
    }


}