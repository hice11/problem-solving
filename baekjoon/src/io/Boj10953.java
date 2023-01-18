package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(bf.readLine());
        for (int i = 0; i < count; i++) {
            String str = bf.readLine();
            int A = str.charAt(0) - '0';
            int B = str.charAt(2) - '0';
            sb.append(A+B).append("\n");
        }
        System.out.println(sb);
    }
}
