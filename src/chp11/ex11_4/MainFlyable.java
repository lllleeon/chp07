package chp11.ex11_4;

import java.util.ArrayList;

public class MainFlyable {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Helicopter hc = new Helicopter();
        Rocket rc = new Rocket();
        //ㄱㄱㄱㄱㅁ각개체의참좀감음젖맞함

        Flyable[] flyables = {bird, hc, rc};

        for (Flyable flyable : flyables){
            flyable.fly();
        }
        ArrayList<Flyable> flyableList = new ArrayList<Flyable>();
        flyableList.add(bird);
        flyableList.add(hc);
        flyableList.add(rc);


        for (Flyable flyable:FlyableList){
            flyable.fly();
        }
    }
}
