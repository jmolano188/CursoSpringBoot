package com.FlyBoot.Core.singleton;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {

        public static void main(String[] args) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            String number = "12300";
            BigDecimal truncatedValue = bigDecimal.add(new BigDecimal(number)).multiply(new BigDecimal(3)).setScale(2, RoundingMode.DOWN).stripTrailingZeros();
            System.out.println(truncatedValue);
        }
}
