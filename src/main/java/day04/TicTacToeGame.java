package day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// TTT 井字遊戲
public class TicTacToeGame {

    // 棋盤
    static String[][] ttt = new String[3][3];
    
    // 主程式
    public static void main(String[] args) {
        start();
    }
    
    // 玩家玩
    public static void userDoIt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請 User 輸入位置:");
        int x = scanner.nextInt();
        ttt[x / 3][x % 3] = "o";

    }
    
    // 電腦玩
    public static void pcDoIt() {
        System.out.print("請PC輸入位置:");

        while (true) {
            Random r = new Random();
            int x = r.nextInt(9); // 0 ~9
            if (ttt[x / 3][x % 3].equals(" ")) {
                System.out.println(x);
                ttt[x / 3][x % 3] = "x";
                break;
            }
        }
    }
    
    // 判斷贏家
    public static boolean checkWinner(String mark) {
        String marks = mark + mark + mark;
        // 是否有贏家
        if ((ttt[0][0] + ttt[0][1] + ttt[0][2]).equals(marks)
                || (ttt[1][0] + ttt[1][1] + ttt[1][2]).equals(marks)
                || (ttt[2][0] + ttt[2][1] + ttt[2][2]).equals(marks)
                || (ttt[0][0] + ttt[1][0] + ttt[2][0]).equals(marks)
                || (ttt[0][1] + ttt[1][1] + ttt[2][1]).equals(marks)
                || (ttt[0][2] + ttt[1][2] + ttt[2][2]).equals(marks)
                || (ttt[0][0] + ttt[1][1] + ttt[2][2]).equals(marks)
                || (ttt[0][2] + ttt[1][1] + ttt[2][0]).equals(marks)) {
            System.out.printf("%s 贏了\n", mark.equals("o") ? "User" : "PC");
            return true; // 有贏家或和局 停止遊戲
        }

        // 是否和局 ?
        // 有沒有找到 " " 的資料
        for (String[] row : ttt) {
            for (String value : row) {
                if (value.equals(" ")) {
                    return false; // 沒有贏家
                }
            }
        }
        System.out.println("和局");
        return true;
    }

    // 遊戲主體
    public static void gameLoop() {
        do {
            // print ttt
            print();
            // user do it
            userDoIt();
            // check winner?
            if(checkWinner("o")){
                break;
            }
            // pc do it 
            pcDoIt();
            // check winner?
            if(checkWinner("x")){
             break;
            }
        } while (true);
    }

    // 開始遊戲
    public static void start() {
        clear();
        gameLoop();
    }

    // 清盤
    public static void clear() {
        for (int i = 0; i < ttt.length; i++) {
            for (int k = 0; k < ttt[i].length; k++) {
                ttt[i][k] = " ";
            }
        }
    }

    // 列印
    public static void print() {
        for (String[] t : ttt) {
            System.out.println(Arrays.toString(t));
        }
    }
}
