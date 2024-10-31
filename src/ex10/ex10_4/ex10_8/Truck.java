package ex10.ex10_4.ex10_8;

public class Truck extends Car{

    private double payload;

    public Truck(String name, double payload) {
        super(name);
        this.payload = payload;
        System.out.printf("적재량: %.1f\n", payload);
    }

    public void load(){
        System.out.printf("[%s]감 ㅜㄹ걸을 적ㄴ재합니다(최대 %.1f 톤\n",getName(),payload);
    }
}
