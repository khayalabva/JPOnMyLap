package day35_Encapsulation.encapsulation;

public class Circle {
    private double radius;
    public double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if(radius<=0){
            return;
        }
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double calcPerimeter(){
        double p = 2 * pi * getRadius();
        return p;
    }
    public double calcArea(){
        double a = getRadius()*getRadius()*pi;
        return a;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
/*
privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()


 */
