package com.FlyBoot.Core.prototype.shapes;

//Uso de un registry de prototipos
public class Demo2 {

    public static void main(String[] args) {

        BundledShapeCache cache = new BundledShapeCache();

        Shapes shape1 = cache.get("Big green circle");
        Shapes shape2 = cache.get("Medium blue rectangle");
        Shapes shape3 = cache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Medium blue rectangle (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }
    }

}
