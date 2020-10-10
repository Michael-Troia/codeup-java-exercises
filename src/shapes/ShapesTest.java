package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());

//        Square box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

    Measurable myShape1 = new Square(6);
    Measurable myShape2 = new Rectangle(4,5);

        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());






    }
}
