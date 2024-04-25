# Comparator_Comparable
Trong Java, Comparator và Comparable đều là các interface được sử dụng để so sánh các đối tượng, nhưng chúng có một số điểm khác nhau quan trọng:

Comparable: Interface Comparable cho phép một lớp xác định cách so sánh với các đối tượng của cùng loại. Nó có một phương thức duy nhất là compareTo(). Bằng cách triển khai Comparable, bạn cung cấp một cách để tự định nghĩa thứ tự sắp xếp cho đối tượng của lớp đó


Comparator: Interface Comparator cho phép bạn xác định một cách so sánh riêng biệt không phải là phần của lớp mà bạn muốn so sánh. Bạn có thể triển khai nhiều lớp Comparator khác nhau để sắp xếp đối tượng của một lớp dựa trên nhiều tiêu chí khác nhau. Comparator cung cấp phương thức compare()

Tóm lại, Comparable được sử dụng khi bạn muốn xác định một cách sắp xếp mặc định cho lớp của mình, trong khi Comparator được sử dụng khi bạn muốn có nhiều cách sắp xếp khác nhau cho cùng một lớp.
