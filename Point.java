public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y){
        x = this.x;
        y = this.y;
    }

    public double distance(Point dest){
        double destX = dest.x;
        double destY = dest.y;

        return Math.sqrt(Math.pow((destX - x), 2) + Math.pow((destY - y), 2));
    }
    // distance(Point dest) - distance from current point to the dest point

    // toString
}
