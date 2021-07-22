public class ProblemEight {
    
    /**
     * The area of a circle is defined as πr^2. 
     * Estimate π to 3 decimal places using a Monte Carlo method.
     * Hint: The basic equation of a circle is x2 + y2 = r2.
     * 
     * @return
     */
    public double answer(){

        final int CENTER_X = 1;
        final int CENTER_Y = 1;
        final int RADIUS = 1;
        final long NUMBER_OF_POINTS = 100000000L;
    
        int squareArea = RADIUS * 2 * 2;
        double tempCircleArea = 0;
        double pi = 0;
        int numberOfInCirclePoints = 0;

        for (int i = 0; i <= NUMBER_OF_POINTS; i++){
            //generate a point inside de square
            double x = Math.random() * 2;
            double y = Math.random() * 2;
            if (isPointInsideCircle(CENTER_X, CENTER_Y, x, y, RADIUS)) numberOfInCirclePoints++;
        }
        if (numberOfInCirclePoints != 0) {
            double percentage = (numberOfInCirclePoints / (double) NUMBER_OF_POINTS);
            tempCircleArea = squareArea * percentage;
            pi = getPi(tempCircleArea, RADIUS);
        }
        return Math.round(pi * 1000) / (double) 1000;
    }

    private boolean isPointInsideCircle(int centerX, int centerY, double x, double y, double radius){
        double result = Math.pow((x - centerX), 2) + Math.pow((y - centerY), 2);
        return result <= Math.pow(radius, 2);
    }

    private double getPi(double circleArea, double radius){
        return circleArea / Math.pow(radius, 2);
    }
}
