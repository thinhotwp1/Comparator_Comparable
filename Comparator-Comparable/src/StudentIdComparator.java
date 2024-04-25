import java.util.Comparator;

// Tạo một class riêng để so sánh student theo id
public class StudentIdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}
