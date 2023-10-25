package org.shevtsov.task6;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        this.width = Math.abs(x2 - x1);
        this.height = Math.abs(y2 - y1);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "Rectangle (" + x + ", " + y + "), (" + (x + width) + ", " + (y + height) + ")";
    }
}

