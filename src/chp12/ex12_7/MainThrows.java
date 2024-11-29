package chp12.ex12_7;

import chp12.ex12_6.MyAgeException;

public class MainThrows {
    public static void main(String[] args) {
        ThrowsTest tt = new ThrowsTest();
        try {
            tt.test1();
        }catch ((MyAgeException e){
            System.out.println(e.getMessage());
        }
    }
}

