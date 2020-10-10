package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public double getPerimeter() {
        return length*4;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}
//    public int side;
//    public Square(int side){
//        super(side,side);
//        this.side = side;
//    }
//
//
//    public int getPerimeter(){
//        System.out.println("override perimeter: ");
//        return side*4;
//    }
//
//    public int getArea(){
//        System.out.println("override area: ");
//        return side*side;
//    }
//}
