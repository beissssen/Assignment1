
import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    ArrayList<Point> points = new ArrayList<>();
    // addPoint(Point) - adds to the container
    public void addPoint(Point point){
        boolean add = points.add(point);
    }
    // calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 0;
        int numPoints = points.size();

        for (int i = 0; i < numPoints; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numPoints);

            perimeter += currentPoint.distance(nextPoint);
        }

        return perimeter;
    }

    // getAverageSide()
    public double getAverageSide() {
        double totalDistance = 0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            totalDistance += currentPoint.distance(nextPoint);
        }

        return totalDistance / points.size();
    }


// getLongestSide()
    public double getLongest() {
        double longestSide = 0;

        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                double distance = points.get(i).distance(points.get(j));
                longestSide = Math.max(longestSide, distance);
            }
        }

        return longestSide;
    }

    // double distance = point.distance(dest);
}
