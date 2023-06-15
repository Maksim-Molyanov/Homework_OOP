package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    List<Student> group;
    private int idGroup;

    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public int getGroupSize(){
        return this.group.size();
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {

        return new Iterator<Student>()
        {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter<group.size();
            }

            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                return group.get(counter++);
            }
        };

        //return new SGIterator(group);
    }

    /**
     * Метод сравнения
     * Возращает отсортированный списко студентов по колличеству студентов
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.getGroupSize() == o.getGroupSize()){
            return 0;
        }
        if (this.getGroupSize() > o.getGroupSize()){
            return 1;
        }
        return -1;
    }
}