package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class FileModel implements iGetModel {
    /**Наименование файла */
    private String fileName;
    /**Список студентов */
    private List<Student> students;
    /**
     * Конструктор Репозитория Файлов
     * Наименование файла
     */
    public FileModel(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Метод добавления студентов в список студентов
     * @param student студент
     */
    public void addStudent(Student student){
        this.students.add(student);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students  = new ArrayList<Student>();
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
                students.add(pers);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }


    @Override
    public void removeStudent(Long number) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == number) {
                students.remove(i);
            }
        }
    }

    public void saveAllStudentToFile(List<Student> students)
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}