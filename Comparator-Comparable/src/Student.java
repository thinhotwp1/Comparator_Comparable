// Trong ví dụ này, phương thức compareTo() so sánh hai sinh viên dựa trên ID của họ.
public class Student implements Comparable<Student> {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Student(String name, int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.id - otherStudent.id;
    }
}
