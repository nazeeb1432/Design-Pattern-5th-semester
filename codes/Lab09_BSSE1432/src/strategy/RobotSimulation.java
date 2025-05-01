package strategy;

public class RobotSimulation {
    public static void main(String[] args) {
        // Create robots with initial sensor data
        Robot robot1 = new Robot("Robot1", "Sector A", "None", "Sunny");
        Robot robot2 = new Robot("Robot2", "Sector B", "Rocks", "Windy");
        Robot robot3 = new Robot("Robot3", "Sector C", "Walls", "Rainy");

        // Create behaviors
        Behavior aggressive = new AggressiveBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();

        // Assign initial behaviors
        robot1.setBehavior(aggressive);
        robot2.setBehavior(defensive);
        robot3.setBehavior(normal);

        // Perform moves
        robot1.performMove();
        robot2.performMove();
        robot3.performMove();

        System.out.println("\nUpdating sensors and changing behaviors dynamically...\n");

        // Update sensors
        robot1.updateSensors("Sector D", "Enemies", "Cloudy");
        robot2.updateSensors("Sector E", "Barriers", "Stormy");
        robot3.updateSensors("Sector F", "Clear", "Sunny");

        // Change behaviors dynamically
        robot1.setBehavior(defensive);
        robot2.setBehavior(normal);
        robot3.setBehavior(aggressive);

        // Perform moves again
        robot1.performMove();
        robot2.performMove();
        robot3.performMove();
    }
}

