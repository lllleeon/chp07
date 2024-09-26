package ex09_3;

import  java.util.Random;

public class MainRandom {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.printf("임의의정수갑: %d\n", random.nextInt());
        System.out.printf("0~9사이의정수갑: %d\n", random.nextInt(10));
        System.out.printf("1~10사이이ㅔ정수갑: %d\n", random.nextInt(10)+1);
        System.out.printf("임의의실수갑: %f\n", random.nextDouble());
        System.out.printf("임의의논리갑: %b\n", random.nextBoolean());
    }
}
