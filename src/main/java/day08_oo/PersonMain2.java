package day08_oo;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Arrays;

public class PersonMain2 {
    // 使用多型
    public static void main(String[] args) {
        Person p1 = new Student("John", 18, 100);
        Person p2 = new Student("Jane", 19, 90);
        Person p3 = new Teacher("Mary", 28, 50000);
        Student s1 = new Student("Helen", 18, 70);
        Teacher t1 = new Teacher("Bob", 35, 70000);
        
        Person[] people = {p1,p2,p3,s1,t1};
        // 1.顯示所有人名
        for(Person person:people) {
            System.out.println(person.getName());
        }
        // 2.計算平均年齡
        double avgOfAge = Arrays.stream(people)
                .mapToInt(Person::getAge) // (p -> p.getAge())
                .average()
                .getAsDouble();
        System.out.println(avgOfAge);
        // 3. 印出學生的分數
        for(Person person : people) {
            // 判斷 person 是不是學生
            //System.out.println(person.getClass());
            //System.out.println(person.getClass().getSimpleName());
            //System.out.println(person.getClass().getSimpleName().equals("student"));
            if(person.getClass().getSimpleName().equals("student")) {
                Student student = (Student)person; // 將 person 轉型成 Student
                System.out.println(student.getScore());
            }
        }
        for(Person person : people){
           // System.out.println((person instanceof Student) + ","+ person.getClass());
            if(person instanceof Student) {
                Student student = (Student)person; // 將 person 轉型成 Student
                System.out.println(student.getScore());
            }
        }
        // 4.印出所有學生分數(JAVA 8 )
        Arrays.stream(people)
               .filter(person -> person instanceof Student)
               .map(person -> (Student)person)
               .forEach(student -> System.out.println(student.getScore()));
        // 5. 請求出老師的薪資(JAVA 8)
        double avg1 = Arrays.stream(people)
                .filter(person -> person instanceof Teacher) // 確認是不是老師
                .map(person -> (Teacher)person) // 將Person 轉型為Teacher
                .mapToInt(Teacher::getSalary) // (teacher -> teacher.getSalary)
                .average()
                .getAsDouble();
        System.out.println(avg1);      
    }
}
