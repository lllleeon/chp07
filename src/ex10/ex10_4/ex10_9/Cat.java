package ex10.ex10_4.ex10_9;

public class Cat extends Animal{

    @Override
    public void eat(String food) {
        System.out.println(getName()+"가(이)"+ food + "를(을)먹는다");
    }

    @Override
    public void cry(String sound) {
        System.out.println(getName()+"가(이)"+ sound + "소리를낸다");
    }
    public void grooming(){
        System.out.println(getName() +"가(이)그루밍을한다");
    }
}
