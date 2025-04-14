package org.example;

public class Box3 {
    int width, length, height;

    Box3(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
    }

    boolean isSameBox(Box3 obj ){
        if(obj.width == width && obj.length == length && obj.height == height) {
            return true;
        } else  {
            return false;
        }
    }
}
