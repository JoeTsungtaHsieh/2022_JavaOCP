package day25_nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileContent {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("src/main/java/day25_nio/ReadFileContent.java");
        // 1.BufferedRead + FileReader
        try (BufferedReader br = new BufferedReader(new FileReader(path.toString()))){
            br.lines().forEach(System.out::println);
        } catch (Exception e) {
        }
        
        // 2. Files.newBufferedReader
        try (BufferedReader reader = Files.newBufferedReader(path)){
            reader.lines().forEach(System.out::println);
        } catch (Exception e) {
        }
        
        // 3. Files.readAllLines (List 集合)
        List<String> content = Files.readAllLines(path);
        content.stream().forEach(System.out::println);
        
        // 4. Files.lines (Stream<T>)
        Files.lines(path).forEach(System.out::println);
        
    }
}
