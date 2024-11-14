package chp11.ex11_5;

public class Bicycle implements Vehicle{
    @Override
    public void horn(){
        System.out.println("따르릉 따르르");
    }
    //졸리고 배고픔
    static public void stop(String place){
        System.out.println(place+ "자전거가 ㅁ머춤");
    }
}
