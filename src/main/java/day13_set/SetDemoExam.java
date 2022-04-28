package day13_set;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toSet;

public class SetDemoExam {
    public static void main(String[] args) {
        Exam e1 = new Exam("國文", 100);
        Exam e2 = new Exam("英文", 70);
        Exam e3 = new Exam("數學", 100);
        
        Set<Exam> exams = new LinkedHashSet<>();
        exams.add(e1);
        exams.add(e2);
        exams.add(e3);
        System.out.println(exams.size());
        System.out.println(exams);
        
        // 請求出總分 = ?
        int sum1 = exams.stream().mapToInt(exam -> exam.getScore()).sum();
        int sum2 = exams.stream().mapToInt(Exam::getScore).sum();
        System.out.println(sum1);
        System.out.println(sum2);
        
        // 請求出最高分 = ?
        int max = exams.stream().mapToInt(Exam::getScore).max().getAsInt();
        System.out.println(max);
        
        // 請求出最高分的科目 =? Java 7
        Set<String> subjects = new LinkedHashSet<>(); // 儲存最高分的科目
        for(Exam exam : exams){
            if(exam.getScore() == max){
                subjects.add(exam.getSubject());
            }
        }
        System.out.println(subjects);
        
        // 請求出最高分的科目 =? Java 8 part 1
        Set<String> subjects2 = exams.stream()
                                        .filter(exam -> exam.getScore() == max)
                                        .map(exam -> exam.getSubject()) // ("國文", "數學") stream 型態
                                        .collect(toSet()); // 轉 Set 集合
        System.out.println(subjects2);
        
        
        // 請求出最高分的科目 =? Java 8 part 2
        // filter(Predicate)
        // map(Function)
        Predicate<Exam> hightScoreFilter = exam -> exam.getScore() == max;
        Function<Exam, String> mapToSubject = exam -> exam.getSubject();
        Set<String> subject3 = exams.stream()
                                    .filter(hightScoreFilter)
                                    .map(mapToSubject)
                                    .collect(toSet());
        System.out.println(subject3);
    }
}
