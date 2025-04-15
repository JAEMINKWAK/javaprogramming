package org.example;

public class ShapeTest3 {
    private static Shape5 arrayOfShapes[];

    public static void main(String arg[]) {
        init();
        drawAll();
    }

    public static void init() {
        arrayOfShapes = new Shape5[3];
        arrayOfShapes[0] = new Rectangle6();
        arrayOfShapes[1] = new Triangle6();
        arrayOfShapes[2] = new Circle6();
    }
    public static void drawAll() {
        for(int i = 0; i < arrayOfShapes.length; i++){
            arrayOfShapes[i].draw();
//            Rectangle6 Draw
//            Triangle6 Draw
//            Circle6 Draw
        }
    }
}
