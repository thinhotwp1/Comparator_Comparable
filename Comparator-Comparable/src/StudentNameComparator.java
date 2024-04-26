import java.util.Comparator;

// Tạo một class riêng để so sánh student theo name
public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
