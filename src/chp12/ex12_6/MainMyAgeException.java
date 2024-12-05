package chp12.ex12_6;

import java.util.Scanner;

class MyAgeException extends Exception {
    public MyAgeException(String message) {
        super(message);
    }
}

public class MainMyAgeException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = s.nextInt();

        try {
            if (age < 0 || age > 150) {
                throw new MyAgeException("나이는 0 ~ 150 사이여야 합니다.");
            } else {
                System.out.printf("당신의 나이는 %d 입니다.\n", age);
            }
        } catch (MyAgeException e) {
            System.out.println(e.getMessage());
        }

        s.close();
    }
}
