/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/
public class Square extends Shape {
    private double length;

    // constructor
    public Square(double length, String name) {
        super(name);
        this.length = length;
    }

    // getters and setters for  length of Square
    public void setLength(double length) { this.length = length; }
    public double getLength() { return this.length; }

    // override the getArea method
    @Override
    public double getArea() { return this.length * this.length; }

    // override the get perimeter method
    @Override
    public double getPerimeter() { return 4*this.length; }


    // override the equals method
    @Override
    public boolean equals(Object o) {
        if (o == this)  return true;
        if (!(o instanceof Square)) return false;
        Square obj = (Square) o;
        return (obj.length == this.length && obj.name.equals(this.name));
    }

    // override the toString method
    @Override
    public String toString() {
        return this.name + ":" + this.length;
    }
}