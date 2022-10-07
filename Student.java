import java.util.HashMap;
import java.util.Map;

public class Student {

    private final String firstName;
    private final String name;
    private final String group;
    public final Map<String, Integer> marks;

    public Student(String firstName, String name, String group) {
        this.firstName = firstName;
        this.name = name;
        this.group = group;
        this.marks = new HashMap<>();
    }

    public String getFirstName() {
        return firstName;
    }


    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(String subject, int mark) {
        marks.put(subject,mark);

    }

    public void delMarks(String subject) {
        marks.remove(subject);
    }

    public void  about(){
        System.out.printf("Имя: %s Фамилия: %s Группа: %s \n",firstName,name,group);
    }

}
