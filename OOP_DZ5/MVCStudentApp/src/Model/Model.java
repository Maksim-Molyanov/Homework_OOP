package Model;

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    /**Метод получения списка всех студентов */
    public List<Student> getAllStudents()
    {
        return students;
    }

    /**Метод удаления студента из списка по идентификатору студента */
    @Override
    public void removeStudent(Long id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
            }
        }
    }
}