package chp11.ex11_8;

public class MainGamesimulation {
    public static void main(String[] args) {
        Knight atomic = new Knight("아토믹");
        Knight uther = new HolyKnight("우서");
        Knight genji = new MagicKnight("겐지");

        atomic.slach();
        uther.slach();
        genji.slach();

        Hearler hearler1 = (HolyKnight) uther;
        Hearler hearler2 = new HolyKnight(" 우서ㅗ동생");

        hearler1.heal();
        hearler1.recovery();

        Magician magician1 = (MagicKnight)genji;
        magician1.magicShield();
        magician1.teleport();

        MagicKnight magicKnight = new MagicKnight("겐지동생");
        magicKnight.magicShield();
        magicKnight.teleport();
        magicKnight.slach();


    }
}
