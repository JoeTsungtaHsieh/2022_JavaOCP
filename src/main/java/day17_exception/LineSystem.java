package day17_exception;

public class LineSystem {
    public static void main(String[] args) {
        LineService lineService = new LineService();
        int statusCode = 0;
        try {
            statusCode = lineService.sendSticker("貼圖", 6136, 10551379);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(statusCode);
    }
}
