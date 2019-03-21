package org.demo.figure;

public class Circle extends Figure{

    {
        System.out.println("Non static init circle.");
        color = 3;
    }

    static {

        System.out.println("Static init circle.");
    }

    public Circle() {
        System.out.println("Constructor circle");
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
