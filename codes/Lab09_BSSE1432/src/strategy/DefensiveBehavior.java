package strategy;

// Defensive Behavior
public class DefensiveBehavior implements Behavior {
    @Override
    public void move(String position, String nearbyObstacles, String environment) {
        System.out.println("Defensive: Avoiding obstacles " + nearbyObstacles +
                " while staying in position " + position + ". Environment: " + environment);
    }
}
