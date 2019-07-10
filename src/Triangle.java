public class Triangle extends Shap {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea(){
        double p = getPerimeter()/2;
        double Area = Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
        return Area;
    }
    public  double getPerimeter(){
        double Perimeter = this.side1+this.side2+this.side3;
        return Perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", Area=" +getArea()+
                ",Perimeter=" +getPerimeter()+
                '}';
    }
}
