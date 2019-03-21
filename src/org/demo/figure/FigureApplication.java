package org.demo.figure;

public class FigureApplication {

    public static void main(String[] args) {
        Object object3 = new Integer(1);
        //runtime error
        if (object3 instanceof Figure) {
            ((Figure) object3).getType();
        } else {
            System.out.println("Not figure class");
        }
        Figure circle = new Circle();
        System.out.println(circle.getType()); //Circle

        Circle circle2 = new Circle();
        doSomething(circle2); //circle

        Figure figure3 = new Circle();
        doSomething(figure3); // figure

        Rectangle rect = new Rectangle();
        doSomething(rect); //figure

        Figure circle4 = new Circle();
        doSomething(circle4); //figure
        doSomething((Circle)circle4); //circle

        Square square1 = Square.of();
    }

    public static void  doSomething(Circle circle) {
        System.out.println("circle method");
    }

    public static void  doSomething(Figure figure) {
        System.out.println("figure method");
    }

    public static void  doSomething(Object figure) {
        System.out.println("figure method");
    }

    public void empty(){
        Square square1 = Square.of();
    }

}
