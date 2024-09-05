package ch07;

public class Dog {

    private String name;

    private  String breeds;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

        public void wag(){
            System.out.println("살랑살랑");
        }
        public void bark(){
            System.out.println("멍멍");
        }
    }
}