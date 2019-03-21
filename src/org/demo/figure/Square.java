package org.demo.figure;

public class Square extends Rectangle {

    private static final Square singleton = new Square();

    private Square(){

    }

    public static Square of() {
        return singleton;
    }
}
