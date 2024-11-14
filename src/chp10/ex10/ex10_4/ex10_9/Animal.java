package chp10.ex10.ex10_4.ex10_9;
//추상클래스
//자식클래스를 표준화(특정기능을 반드시 갖도록)시키기ㅟ해
abstract class Animal {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    //주상메소드
    public String Name;
    public abstract void eat(String food);
    public abstract void cry(String sound);
    public void sleep(int hours){
        System.out.println(hours + "시간동안 자다");
    }
}
