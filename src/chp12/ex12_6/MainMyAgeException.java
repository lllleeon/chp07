package chp12.ex12_6;

import java.util.Scanner;

public class MainMyAgeException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("나이를입력");
        int age = s.nextInt();
        if (age < 0 || age > 150) {
            throw new MyAgeException("나이는0~150");
        } catch (MyAgeException e{
            System.out.println(e.getMessage());
        }
    }else{
        System.out.printf("당신읭 나ㅣ이는%d압ㄴ더", age);
    }
    s.close();
}

