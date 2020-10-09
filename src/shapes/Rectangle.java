package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int aLength, int aWidth){
        this.length = aLength;
        this.width = aWidth;
    }

    public int getArea(int aLength, int aWidth){
        return this.width*this.length;
    }

    public int getPerimeter(int aLength, int aWidth){
        return (2*this.length) + (2*this.width);
    }
}
