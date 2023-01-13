package codeup10;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String[] strs = x.split("-");
        System.out.println(strs[0]+strs[1]);
    }
}
