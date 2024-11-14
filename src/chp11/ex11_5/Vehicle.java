package chp11.ex11_5;

public interface Vehicle {
    void horn();
    default public void move(String from, String to){
        System.out.printf("%s에서 %s까지이덩\n", from, to);
    }
    static public void stop(String place){
        System.out.println(place + "엠멈ㅁ춪ㅁ");
    }
}
