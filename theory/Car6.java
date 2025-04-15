package org.example;

class Car62 {
    private String model;

    // 생성자
    public Car62(String model) {
        this.model = model;
    }

    // equals 메서드 오버라이드
    public boolean equals(Object obj) {
        if(obj instanceof Car62) {
            return model.equals(((Car62)obj).model);
        }
        else
            return false;
    }
}

public class Car6 {
    public static void main(String[] args) {
        Car62 firstCar = new Car62("HMW520");
        Car62 secondCar = new Car62("HMW520");

        if (firstCar.equals(secondCar)) {
            System.out.println("동일한 종류의 차량입니다.");
            // 동일한 종류의 차량입니다.
        } else {
            System.out.println("동일한 종류의 차량이 아닙니다.");
        }
    }
}