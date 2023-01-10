package task_1023;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        long i = 3;
        long a;
        Scanner in = new Scanner(System.in);
        a = in.nextLong();
        while (a % i != 0) {
            i++;
        }
        System.out.println(i - 1);
    }
}

