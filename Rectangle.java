public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(double v, double v1){

    }

    public Rectangle(double width, double length, String orange, boolean filled){
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        super();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double Arena(){
        return width * this.length;
    }

    public double getPrimeter(){
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    public static class RengtangleTest{
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            System.out.println(rectangle);

            rectangle = new Rectangle(2.3, 5.8);
            System.out.println(rectangle);

            rectangle = new Rectangle(2.3, 5.8, "orange", true);
            System.out.println(rectangle);
        }
    }
}
