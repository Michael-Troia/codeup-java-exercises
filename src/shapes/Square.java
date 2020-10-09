package shapes;

public class Square extends Rectangle {
    public int side;
    public Square(int side){
        super(side,side);
        this.side = side;
        getPerimeter(this.side);
        getArea(this.side);
    }

    public void getPerimeter(int side){
        System.out.printf("override: %d\n", side*4);
    }

    public void getArea(int side){
        System.out.printf("override: %d\n", side*side);
    }
}
