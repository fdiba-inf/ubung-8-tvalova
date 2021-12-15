package exercise8;
import java.util.Scanner;

public class Point {
    // Define attributes
    double x;
    double y;

    public Point() {
        // Initialize attributes to 0
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        // Initialize attributes by coping x and y parameters
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        // Initialize attributes by coping attributes of otherPoint
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    public void initialize() {
        // Change attributes through console
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        // Change attributes by adding xDelta and yDelta
        x += xDelta;
        y += yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        // Create new point which is translated relative to this point
        Point p = new Point(this);
        p.translate(xDelta, yDelta);
        return p;
    }

    public boolean equals(Point otherPoint) {
        // Compare attributes of this point to attributes of otherPoint for equality
        if (otherPoint.x == this.x && otherPoint.y == this.y) {
          return true;
        }
        return false;
    }

    public String toString() {
        // Represent attributes as string
        return "(" + x + ", " + y + ")";
    }
}
