package chp10.ex10.ex10_4.ex10_6;

import java.util.ArrayList;

public class MainController {

    public static void main(String[] args) {
        Square square = new Square();
        square.name ="정사가경";
        square.setWidth(7);

        Triangle triangle = new Triangle();
        triangle.name ="삼각겈";
        triangle.setWidth(15);
        triangle.setHeight(9);

        Circle circle =new Circle();
        circle.name ="원";
        circle.setR(15);

        ArrayList<Shape> arrList = new ArrayList<Shape>();
        arrList.add(square);
        arrList.add(triangle);
        arrList.add(circle);

        viewShapes(arrList);
    }

    public static void viewShapes(ArrayList<Shape> arrList){
        for (Shape shape : arrList){
            System.out.printf("%s의 면적은 %.2f ㎠입니다\n", shape.name, shape.area());
        }
    }
}
