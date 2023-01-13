package codeup10;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String[] strs = x.split("\\.");
        int[] ymd = new int[3];
        for(int i=0; i<strs.length; i++){
            ymd[i] = Integer.parseInt(strs[i]);
        }
        System.out.printf("%04d.%02d.%02d", ymd[0],ymd[1],ymd[2]);
    }
}
