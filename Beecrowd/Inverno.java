import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if(A > B && B <= C) System.out.println(":)");
        else if(A < B && B >= C) System.out.println(":(");
        else if(A < B && B < C && (C - B) < (B - A)) System.out.println(":(");
        else if(A < B && B < C && (C - B) >= (B - A)) System.out.println(":)");
        else if(A > B && B > C && (B - C) < (A - B)) System.out.println(":)");
        else if(A > B && B > C && (B - C) >= (A - B)) System.out.println(":(");
        else if(A == B && B < C) System.out.println(":)");
        else System.out.println(":(");
    }
}