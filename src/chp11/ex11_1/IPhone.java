package chp11.ex11_1;

public class IPhone implements Phone, Alarm, Message {

    @Override
    public void playMusic(String musicTitle) {
        System.out.println(musicTitle + "음악을" + PRODUCT_NAME + "Music으로 재생한다");
    }

    @Override
    public void beep() {

    }

    @Override
    public void sendMessage(String content) {

    }

    @Override
    public void receiveMessage(String content) {

    }

    @Override
    public void callPhone(String phone) {

    }

    @Override
    public void receivePhone(String PhoneNumber) {

    }

    public void sendAirdrop(String content) {
    }
}
