package chp10.ex10.ex10_4.ex10_10;

public class Item {
    private String name;
    private  int price;
    private int power;

    public Item() {
        this("칼",6000);
        System.out.println("기본생성자가 호출됨");
    }

    //필드명과 지역변수(매개변수)의 이름이 같은경우 구별하는 용도로 디스 키워드사용
    public  Item(String name, int price){
        this.name = name;
        this.price = price;



    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(String name, int price, int power) {
        this.name = name;
        this.price = price;
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
