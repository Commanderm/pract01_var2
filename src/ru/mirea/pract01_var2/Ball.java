package ru.mirea.pract01_var2;

import java.lang.*;

public class Ball {

    private String color;
    private int size;
    private String material;

    public Ball(String color, int size, String material) {
        this.color = color;
        this.size = size;
        this.material = material;
    }

    public Ball(String color, int size) {
        this.color = color;
        this.size = size;
        material = "Стальной";
    }

    public Ball(String color) {
        this.color = color;
        size = 0;
        material = "Стальной";
    }

    public Ball() {
        color = "Фиолетовый";
        size = 0;
        material = "Стальной";
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return "Мячик "+this.color + " размера " + this.size +" " + this.material + " цвета.";
    }
}