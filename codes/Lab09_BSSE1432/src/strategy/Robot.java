package strategy;

// Context Class
public class Robot {
    private String name;
    private Behavior behavior;

    // Sensors information
    private String position;
    private String nearbyObstacles;
    private String environment;

    public Robot(String name, String position, String nearbyObstacles, String environment) {
        this.name = name;
        this.position = position;
        this.nearbyObstacles = nearbyObstacles;
        this.environment = environment;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void updateSensors(String position, String nearbyObstacles, String environment) {
        this.position = position;
        this.nearbyObstacles = nearbyObstacles;
        this.environment = environment;
    }

    public void performMove() {
        System.out.print(name + " is ");
        if (behavior != null) {
            behavior.move(position, nearbyObstacles, environment);
        } else {
            System.out.println("standing still (no behavior assigned).");
        }
    }
}

