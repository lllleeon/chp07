package chp11.ex11_8;

public class HolyKnight extends Knight implements Hearler{

    public int dp = 100;
    public HolyKnight(String name){
        super(name);
    }

    @Override
    public void heal(){
        System.out.printf("[%s]의 채력이 가득찹니다\n", name);
    }

    @Override
    public void recovery(){
        System.out.printf("[%s]채력회복량이 증가 됩ㄴ다\n", name);
    }

    @Override
    public void slach() {
        System.out.printf("[%s]의 신성력이 깃든 베기공격~~~\n", name);
    }
}
