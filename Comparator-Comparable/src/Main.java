/**
 * <h3>Interface Comparable</h3>
 * <p>Comparable cung cấp method compareTo() để so sánh và sắp xếp các đối tượng được viết trong class
 * theo trường thuộc tính của object, ví dụ: Sắp xếp theo tên, id, tuổi,... </p>
 *
 * <h3>Interface Comparator</h3>
 * <p>Comparator tạo ra các class riêng để so sánh các đối tượng được khai báo <T>,
 * có thể dùng các trường thuộc tính của object để so sánh</p>
 *
 * <h3>Khi nào dùng:</h3>
 *  <p>- Dùng Comparable khi muốn so sánh đơn giản bằng 1 method mặc định compareTo() trong class,
 *      ví dụ so sánh thứ tự học sinh theo tên hoặc id,...</p>
 *  <p>- Dùng Comparator khi muốn so sánh nhiều cách, hay so sánh mở rộng
 *      Ví dụ so sánh 2 object theo tên ở danh sách lớp, còn trên danh sách thi thì đánh theo id </p>
 */
public class Main {
    public static void main(String[] args) {
        Student a = new Student("bod", 10);
        Student b = new Student("bob", 9);
        System.out.println("Use Comparable: " + a.compareTo(b));
        StudentNameComparator studentNameComparator = new StudentNameComparator();
        StudentIdComparator studentIdComparator = new StudentIdComparator();
        System.out.println("Use studentIdComparator: " + studentIdComparator.compare(a, b));
        System.out.println("Use StudentNameComparator: " + studentNameComparator.compare(a, b));
    }
}
