package strategy;

// Strategy Interface
public interface Behavior {
    void move(String position, String nearbyObstacles, String environment);
}
