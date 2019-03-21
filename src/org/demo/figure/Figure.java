package org.demo.figure;

public class Figure {

    private static int lineType;

    protected int color;

    {
        color = 5;
        System.out.println("Non static initialization figure");
    }

    static {
        lineType = 5;
        System.out.println("Static initialization figure");
    }

    public Figure() {
        System.out.println("Constructor Figure");
    }

    public Figure(int color_) {
        this.color = color_;
    }

    public String getType() {
        return "Figure";
    }

}
