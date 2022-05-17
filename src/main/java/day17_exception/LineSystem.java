package day17_exception;

public class LineSystem {
    public static void main(String[] args) {
        LineService lineService = new LineService();
        int statusCode = 0;
        try {
            statusCode = lineService.sendText("阿姨我不想努力了!!!");
            statusCode = lineService.sendText("https://www.youtube.com/watch?v=C-sAGnIxTWc");
            statusCode = lineService.sendSticker("貼圖", 6136, 10551379);
            String imageUrl = "https://p2.bahamut.com.tw/B/2KU/12/135b88e6941b6c7540e7677ff01fb8c5.JPG?v=1644915565786";
            statusCode = lineService.sendWebImage("Web", imageUrl);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(statusCode);
    }
}
