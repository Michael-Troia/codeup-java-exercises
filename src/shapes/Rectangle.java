package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double aLength, double aWidth){
        super(aLength,aWidth);
    }

    @Override
    public void setLength(double alength) {
        this.length = alength;
    }

    @Override
    public void setWidth(double aWidth) {
        this.width = aWidth;
    }


    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (2*length)+ (2*width);
    }

    //    protected int length;
//    protected int width;
//
//    public Rectangle(int aLength, int aWidth){
//        this.length = aLength;
//        this.width = aWidth;
//    }
//
//    public int getArea(){
//        return this.width*this.length;
//    }
//
//    public int getPerimeter(){
//        return (2*this.length) + (2*this.width);
//    }
}
