package chp11.ex11_8;

import javax.swing.plaf.PanelUI;

public class MagicKnight extends Knight implements Magician {
    public  int mp = 100;
    public MagicKnight(String name) {
        super(name);
}
    @Override
    public void magicShield() {
        System.out.printf("[%s]가 모든공격을 방어합니다\n", name);
    }

    @Override
    public void teleport() {
        System.out.printf("[%s]순강읻ㅇ을합ㅇ니다\n", name);
    }

    @Override
    public void slach() {
        System.out.printf("[%s]마력이킷든 베기공겻~\n", name);
    }
}
