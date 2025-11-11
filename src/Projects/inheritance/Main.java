package Projects.inheritance;

import java.time.LocalDateTime;

public class Main {
    public static void main() {
        GeometricFigure figure = new Rectangle(10,20);
       //"is a"
       // "has a"
        GeometricFigure figure2 = new Rectangle(10,10);
        Circle circle = new Circle("1",true, LocalDateTime.now(),10);
        System.out.println(figure.test());
        System.out.println(figure2.test());
        System.out.println(circle.test());

        //overloading
        //overriding

        //topic 11 st 18
    }


}
