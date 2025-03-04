import java.util.ArrayList;
import java.util.Iterator;
import java.awt.*;
public class a3 {
    public static void main(String[] args) {
    ArrayList<Student> studentList = new ArrayList<>();
    studentList.add(new Student("John", 1));
    studentList.add(new Student("Alice", 2));
    studentList.add(new Student("Bob", 3));
    studentList.add(new Student("Charlie", 4));
    studentList.add(new Student("David", 5));
    studentList.add(new Student("Eve", 6));
    studentList.add(new Student("Frank", 7));
    studentList.add(new Student("George", 8));
    studentList.add(new Student("Hannah", 9));
    studentList.add(new Student("Ivan", 10));
    System.out.println("ArrayList: ");
    Iterator<Student> iterator = studentList.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    }
}