package day25_nio;

// 路徑結合

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathResolve {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:/temp/company/it"); 
        Path p2 = Paths.get("salary.txt"); // 相對路徑
        p1 = p1.resolve(p2);
        System.out.println(p1);
        Path p3 = Paths.get("/salary.txt"); //絕對路徑
        p1 = p1.resolve(p3);
        System.out.println(p1);
    }
}
