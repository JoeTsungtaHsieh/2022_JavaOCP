package day24_io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileWriterDemo1 {
    public static void main(String[] args){
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/main/java/day24_io/data/news.txt");
            fw.append("Hello Java");
            fw.append("\n");
            fw.append("Hello Web 網頁");
            System.out.println("輸入完畢");
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
