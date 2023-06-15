package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentCourse implements Iterable<StudentGroup>{
    /** Список групп */
    public List<StudentGroup> course;
    /** Идентификатор потоков */
    public int IDCourse;

    /**
     * Конструктор студенческих потоков
     */
    public StudentCourse(int NumStream) {
        this.course = new ArrayList<>();
        this.IDCourse = NumStream;
    }


    /**
     * Метод добавления группы в список потоков
     */
    public void addCourse(StudentGroup stream){
        this.course.add(stream);
    }

    /**
     *Возвращает идентификатор потока
     */
    public int getIDCourse(){
        return IDCourse;
    }
    /**
     *Возвращает список потоков
     */
    public List<StudentGroup> getCourse() {
        return course;
    }

    /** Переопределение метода "toString()" */
    @Override
    public String toString() {
        String streamOtput = new String();
        streamOtput = String.format("\n№Потока %d", getIDCourse());
        for (StudentGroup studentGroup: course){
            streamOtput = streamOtput + "\n" + studentGroup.getGroup() + "\n";
        }
        return streamOtput;
    }

    /**Подключение итератора для списка групп */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < course.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return course.get(index++);
            }
        };
    }

}
