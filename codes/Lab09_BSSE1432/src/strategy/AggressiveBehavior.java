package strategy;

// Aggressive Behavior
public class AggressiveBehavior implements Behavior {
    @Override
    public void move(String position, String nearbyObstacles, String environment) {
        System.out.println("Aggressive: Moving towards the target at position " + position +
                " despite obstacles: " + nearbyObstacles + ". Environment: " + environment);
    }
}