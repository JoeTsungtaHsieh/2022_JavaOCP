package day24_io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileWriterDemo2 {
    public static void main(String[] args){
        
        // true: 會保留之前內容並新增
        // false: (預設)會清除之前的內容再新增
        try (FileWriter fw = new FileWriter("src/main/java/day24_io/data/news.txt", true)){
            fw.append("Hello Java");
            fw.append("\n");
            fw.append("Hello Web 網頁");
            System.out.println("輸入完畢");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
