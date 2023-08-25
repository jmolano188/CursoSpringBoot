package com.FlyBoot.Core.prototype.shape;

import java.util.HashMap;
import java.util.Map;

public class BlundedShapeCache {
        private Map<String, Shape> cache = new HashMap<>();

        public BlundedShapeCache() {
            Circle circle = new Circle();
            circle.x = 5;
            circle.y = 7;
            circle.radio = 45;
            circle.color = "Green";
            Rectangule rectangle = new Rectangule();
            rectangle.x = 6;
            rectangle.y = 9;
            rectangle.b = 8;
            rectangle.h = 10;
            rectangle.color = "Blue";
            cache.put("Big green circle", circle);
            cache.put("Medium blue rectangle", rectangle);
        }

        public Shape put(String key, Shape shape) {
            cache.put(key, shape);
            return shape;
        }

        public Shape get(String key) {
            return cache.get(key).clone();
        }
}
