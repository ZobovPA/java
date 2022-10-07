import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class StudentsSet {
    private final  List<Student> students;

    public StudentsSet(List<Student> students) {
        this.students = students;
    }

    /* Добавляет в множество нового студента с пустым набором оценок */
    public Student addStudent(String firstName, String name, String group) {
        students.add(new Student(firstName,name,group));
        return new Student(firstName,name,group);
    }

    /* Находит в множестве студента по имени, фамилии и группе */
    public Student findStudent(String firstName, String name, String group) {
        for (Student student : students)
        {
            if ((student.getFirstName() == firstName) && (student.getName() == name) && (student.getGroup() == group)){
                return student;
            }
        }

        return null;
    }

    /* Выдает список всех студентов в множестве */
    public List<Student> listStudents() {
        return students;
    }

    /* Добавляет или заменяет оценку заданному студенты по заданному предмету */
    public void addMark(Student s, String subject, int mark) {
        s.setMarks(subject,mark);
    }

    /* Удаляет у заданного студента оценку по заданному предмету */
    public void removeMark(Student s, String subject) {
        s.delMarks(subject);
    }

    /* Выводит на консоль всех студентов, у которых все оценки - пятерки */
    public void printSet5() {
        for (Student student : students)
        {
            System.out.println(student.getMarks());
            Map<String, Integer> map = student.getMarks();
            Collection <Integer> marks = map.values();
            for (Integer mark : marks) {
                if (mark != 5) {
                    break;
                }
                student.about();
            }
        }
    }

    /* Выводит на консоль студентов, у которых есть четверки и нет оценок ниже */
    public void printSet4() {
        for (Student student : students)
        {
            Map<String, Integer> map = student.getMarks();
            Collection <Integer> marks = map.values();
            if (marks.contains(4)){
                for (Integer mark : marks) {
                    if ((mark == 3)||(mark == 2)){
                        break;
                    }
                    student.about();
                }
            }
        }
    }

    /* Выводит на консоль студентов, у которых есть тройки и нет двоек */
    public void printSet3() {
        for (Student student : students)
        {
            Map<String, Integer> map = student.getMarks();
            Collection <Integer> marks = map.values();
            if (marks.contains(3)){
                for (Integer mark : marks) {
                    if (mark != 2) {
                        break;
                    }
                    student.about();
                }
            }
        }
    }

    /* Выводит на консоль студентов, у которых есть среди оценок двойки */
    public void printSet2() {
        for (Student student : students)
        {
            Map<String, Integer> map = student.getMarks();
            Collection <Integer> marks = map.values();
            for (Integer mark : marks) {
                if (mark == 2) {
                    student.about();
                }
            }
        }
    }

    /* Выводит на консоль студентов, у которых нет ни одной оценки */
    public void printSet0() {
        for (Student student : students)
        {
            Map<String, Integer> map = student.getMarks();
            Collection <Integer> marks = map.values();
            if (marks.size() == 0){
                student.about();
            }
        }
    }

    /* Выводит на консоль студентов */
    public void printAllSets() {
        for (Student student : students)
        {
            student.about();
        }
    }
}