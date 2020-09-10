package ru.mirea.pract01_var2;

import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball("Красный", 20, "Резиновый");
        Ball ball2 = new Ball("Чёрный", 7);
        Ball ball3 = new Ball("Зелёный");
        Ball ball4 = new Ball();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        System.out.println(ball4);

        ball3.setSize(13);
        ball3.setMaterial("Чугунный");
        ball4.setSize(3);

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        System.out.println(ball4);
    }
}