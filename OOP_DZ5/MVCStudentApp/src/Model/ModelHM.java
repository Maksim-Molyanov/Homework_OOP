package Model;

import java.util.ArrayList;
import java.util.HashMap;

import Controller.iGetModel;
import java.util.List;
/**Класс Модель, хранения студентов в  HashMap */
public class ModelHM implements iGetModel {
    /**Список студентов в HashMap */
    private HashMap<Long,Student> studentsHashMap;
    /**
     * Конструктор Модели
     * @param students список студентов
     */
    public ModelHM(HashMap<Long,Student> students ){
        this.studentsHashMap = new HashMap<>();
    }
    /**Метод получения всех студентов, по значению */
    public List<Student> getAllStudents(){
        return new ArrayList<>(studentsHashMap.values());
    }
    /**Метод удаления студента из списка, по идентификатору студента */
    @Override
    public void removeStudent(Long id) {
        studentsHashMap.remove(id);
    }
}