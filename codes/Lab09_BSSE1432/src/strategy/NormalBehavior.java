package strategy;

// Normal Behavior
public class NormalBehavior implements Behavior {
    @Override
    public void move(String position, String nearbyObstacles, String environment) {
        System.out.println("Normal: Maintaining a steady pace at position " + position +
                " with minor adjustments for obstacles: " + nearbyObstacles + ". Environment: " + environment);
    }
}
