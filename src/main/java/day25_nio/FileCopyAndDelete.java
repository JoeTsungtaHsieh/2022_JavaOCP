package day25_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyAndDelete {
    public static void main(String[] args) throws Exception{
        
        Path source = Paths.get("src/main/java/day25_nio/bar/f18.jpg");
        Path dest = Paths.get("src/main/java/day25_nio/foo/f18.jpg");
        /*
        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copy 完成");
        Files.delete(source);
        System.out.println("來源端刪除");
        */
        Files.move(source, dest, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("移動完成");
        // Files.delete(source); // 使用 move() 不用在加上 delete
    }
}
