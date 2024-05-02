import entity.Person;
import entity.Student;
import entity.Teacher;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Sử dụng constructor method reference để tạo mới một đối tượng, phù hợp khi cần tạo nhiều đối tượng từ danh sách
        // Ví dụ:
        Map<String, String> listData = new HashMap<>();
        listData.put("Adam", "Student");
        listData.put("John Wick", "Teacher");
        listData.put("Eva", "Engineer");

        listData.forEach((s, s2) -> {
            // Gọi Function để tạo contructor
            Function<String, Person> constructor;
            // Tạo object
            Person obj;
            // Ép kiểu object
            switch (s2.toLowerCase()) {
                case "student" -> constructor = Student::new;
                case "teacher" -> constructor = Teacher::new;
                default -> constructor = Person::new;
            }
            // Gán dữ liệu cho object
            obj = constructor.apply(s);
            // Do something with object
            System.out.println("My name is " + obj.getName() + ", Im an " + obj.getClass().getSimpleName());
        });
    }

}
