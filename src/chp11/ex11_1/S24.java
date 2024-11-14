package chp11.ex11_1;

public class S24 implements Phone, Alarm, Message {
    @Override    public void playMusic(String musicTitle) {
        System.out.println(musicTitle+" 음악을 재생한다");
    }
    @Override    public void beep() {
        System.out.println("비프음을 재생한다");
    }
    @Override    public void sendMessage(String content) {
        System.out.println(content+" 메세지를 전송한다");
    }
    @Override    public void receiveMessage(String content) {
        System.out.println(content+" 메세지를 받는다");
    }
    @Override    public void callPhone(String phoneNumber) {
        System.out.println(phoneNumber+" 로 전화를건다");
    }
    @Override    public void receivePhone(String phoneNumber) {
        System.out.println(phoneNumber+" 의 전화를 받는다");
    }

}
