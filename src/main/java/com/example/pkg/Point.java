package com.example.pkg;

public class Point {

    private int x;
    private int y;
    private String message;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Point(int x, int y, String message) {
        this.x = x;
        this.y = y;
        this.message = message;

        System.out.println(String.format("Point Constructor with with message is called, and message is %s", message));
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("Point Constructor with X and Y values Called");
    }
    public Point() {
        System.out.println("Point No Arg Constructor Called");
    }

    @Override
    public String toString() {
        return String.format("Point : X=%d; Y=%d \n", getX(), getY());
    }
}
