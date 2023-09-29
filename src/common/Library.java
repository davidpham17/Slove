package common;

import java.util.Scanner;

public class Library {
   
    Scanner sc = new Scanner(System.in);
    
     public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
    
    public float inputFloat() {
    float number = 0;
    boolean validInput = false;

    while (!validInput) {
        try {
            number = sc.nextFloat();
            validInput = true; // Giả sử đầu vào là hợp lệ, sẽ kiểm tra điều kiện sau
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid number. Please re-enter:");
            sc.next(); // Đọc và loại bỏ giá trị không hợp lệ
        }
    }
        return number;
    }
    
}
