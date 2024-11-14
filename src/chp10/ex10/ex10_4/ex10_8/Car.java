package chp10.ex10.ex10_4.ex10_8;

public class Car {
    private String name;

    public  Car(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(){
        System.out.printf("모델명:%s \n",name);
    }

    private String getName(){
        return name;
    }
}
