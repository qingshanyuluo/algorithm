package com.company.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HanoiTower {
    public static void main(String[] args) {

    }

    String origin = "1";
    String target = "2";
    String buffer = "3";

    public static void move(String origin, String target, String buffer, int n) {
        if (n == 2) {
            System.out.println("move " + origin + "to " + target);
        } else {
            move(origin, buffer, target, n -1);
            System.out.println("move" + origin + "to " + target);
            move(buffer, target, origin, n - 1);
        }
    }
}
