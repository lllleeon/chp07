package chp10.ex10.ex10_4.ex10_9;

public class MainAnimal {
    public static void main(String[] args) {
        //추상클은 뉴 연산자로 객체생성이 불가
        // Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("말티즈");
        dog.eat("사료");
        dog.cry("멍멍");
        dog.sleep(5);
        dog.wag();

        cat.setName("페르시안");
        cat.sleep(7);
        cat.cry("야옹");
        cat.grooming();
        cat.eat("생선");
        //업캐스팅을 하면 부모 클래스의 모든 멤버 사용가능
        //하지만 자식 클래스의 멤버는 부모클래스의 메소드를 오버라이딩되니 메소드만 사용가능

        Animal animal = new Dog();

    }
}
