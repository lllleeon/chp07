package chp12.ex12_1;

public class MainException12_1 {
    public static void main(String[] args) {
        String[] arr = {"봄", "여름", "가을", "겨울"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
        for (String season : arr) {
            System.out.print(season + "");
        }
        System.out.println();

        try {
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배ㅇㄹ의 입ㄴ덱스번호가 넘흐끄네툐");
        }
        System.out.println(arr[2]);
    }
}
