public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArena(){
        return radius * radius * Math.PI;
    }

    public double getPrimeter(){
        return 2 * radius* Math.PI;
    }

    @Override
    public String toString(){
        return " A Cricle with raidus = "
                + getRadius()
                + " , which is a subclass of "
                + super.toString();
    }

    public static class CricleTest {
        public static void main(String[] args) {
            Circle cricle = new Circle();
            System.out.println(cricle);

            cricle = new Circle(3.5);
            System.out.println(cricle);

            cricle = new Circle(3.5, "indigo", false);
            System.out.println(cricle);
        }
    }
}
