package chp11.ex11_1;

public class MainIphone {
    public static void main(String[] args) {
        //업캐스팅된경우의 참조변수는부모의것을삿룡ㅇ할수있족자시긔것은 오버라아딩된것만 사용가능
        Phone p = new IPhone();
        p.callPhone("010-3333-7777");
        p.receivePhone("02-111-5555");
        System.out.println("제조사명"+ Phone.PRODUCT_NAME);

        IPhone iPhone = new IPhone();
        iPhone.beep();
        iPhone.callPhone("02-777-1111");
        iPhone.playMusic("APT");
        iPhone.sendAirdrop("사진");
        iPhone.sendMessage("오늘수능금지곡");
//부아앙앍
        Alarm alarm = iPhone;
        alarm.beep();
        alarm.playMusic("Sticky");

    }
}
