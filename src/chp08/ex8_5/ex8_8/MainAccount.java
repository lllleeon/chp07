//package chp08.ex8_5.ex8_8;
//
//import java.util.Scanner;
//public class MainAccount {
//    public static void main(String[] args) {
//        Scanner scanner1 = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);
//
//        System.out.printf("게자번호입력 (5자리):");
//        String accountNumber = scanner1.nextLine();
//        System.out.printf("성명ㅇㅂ력");
//        String name = scanner1.nextLine();
//        System.out.printf("비밀번호 (4자리)");
//        String pwd = scanner1.nextLine();
//        System.out.printf("입금할 금액");
//        int balance = scanner2.nextInt();
//
//        Account account = new Account(accountNumber, name ,pwd, balance);
//        System.out.println(account);
//
//        System.out.printf("d입급할 금애기");
//        int deposit = scanner2.nextInt();
//        account.deposit(deposit);
//        System.out.printf("출금할 금애기");
//        int witdraw = scanner2.nextInt();
//        account.withdraw(witdraw);
//
//        scanner1.close();
//        scanner2.close();
//    }
//}
