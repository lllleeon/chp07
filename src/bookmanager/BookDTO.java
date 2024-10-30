package bookmanager;

import java.util.ArrayList;

public class BookDTO {
    private String isbn;
    private String bookName;
    private String author;
    private String publish;
    private int price;
    private int inventory;

    public BookDTO(String isbn, String bookName, String author, String publish, int price, int inventory) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.publish = publish;
        this.price = price;
        this.inventory = inventory;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublish() { return publish; }
    public void setPublish(String publish) { this.publish = publish; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getInventory() { return inventory; }
    public void setInventory(int inventory) { this.inventory = inventory; }

    public String toString() {
        return "ISBN: " + isbn + ", 도서명: " + bookName + ", 저자명: " + author + ", 출판사: " + publish + ", 가격: " + price + ", 재고: " + inventory;
    }

    public static ArrayList<BookDTO> createDefaultBooks() {
        ArrayList<BookDTO> defaultBooks = new ArrayList<>();
        defaultBooks.add(new BookDTO("1", "날개", "이상", "민음사", 12000, 30));
        defaultBooks.add(new BookDTO("2", "파우스트", "요한 볼프강 폰 괴테", "민음사", 15000, 20));
        defaultBooks.add(new BookDTO("3", "돈 키호테", "미겔 데 세르반테스", "문학동네", 18000, 25));
        defaultBooks.add(new BookDTO("4", "지옥변", "야마모토 후유키", "열린책들", 9000, 40));
        defaultBooks.add(new BookDTO("5", "이방인", "알베르 카뮈", "민음사", 14000, 35));
        defaultBooks.add(new BookDTO("6", "홍루몽", "차오쉰춘", "창비", 20000, 15));
        defaultBooks.add(new BookDTO("7", "폭풍의 언덕", "에밀리 브론테", "문학동네", 16000, 10));
        defaultBooks.add(new BookDTO("8", "모비딕", "허먼 멜빌", "더클래식", 22000, 12));
        defaultBooks.add(new BookDTO("9", "죄와 벌", "표도르 미하일로비치 도스토옙스키", "민음사", 17000, 18));
        defaultBooks.add(new BookDTO("10", "데미안", "헤르만 헤세", "사계절", 13000, 22));
        defaultBooks.add(new BookDTO("11", "오디세이아", "호메로스", "청미래", 25000, 8));
        defaultBooks.add(new BookDTO("12", "변신", "프란츠 카프카", "문학동네", 11000, 50));
        return defaultBooks;
    }
}
