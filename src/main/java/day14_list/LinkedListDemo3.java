package day14_list;

import day13_set.Exam;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        Exam e1 = new Exam("Java", 100);
        Exam e2 = new Exam("Java", 100);
        Exam e3 = new Exam("VB", 90);
        Exam e4 = new Exam("Java", 80);
        Exam e5 = new Exam("VB", 95);
        Exam e6 = new Exam("VB", 90);
        List<Exam> exams = Arrays.asList(e1, e2, e3, e4, e5, e6);
        // 請問 Java 與 VB 的平均分數各是多少?
        double JavaAvg = exams.stream()
                .filter(n ->n.getSubject().equals("Java"))
                .mapToInt(score -> score.getScore())
                .average()
                .getAsDouble();
        System.out.printf("Java: %.1f\n",JavaAvg);
        double VBAvg = exams.stream()
                .filter(n ->n.getSubject().equals("VB"))
                .mapToInt(Exam::getScore)
                .average()
                .getAsDouble();
        System.out.printf("VB: %.1f\n",VBAvg);
    }
}
