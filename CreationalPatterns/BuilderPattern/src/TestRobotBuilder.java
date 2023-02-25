public class TestRobotBuilder {

    public static void main(String[] args) {

        // Get a RobotBuilder of type OldRobotBuilder
        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        // Pass the OldRobotBuilder specification to the director
        RobotDirector robotDirector = new RobotDirector(oldStyleRobot);

        // Tells the director to make the Robot using the
        // specifications of the OldRobotBuilder class
        robotDirector.makeRobot();

        // The director returns the right robot based off the
        // specifications sent to it
        Robot firstRobot = robotDirector.getRobot();

        System.out.println("Robot Build");

        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());

        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());

        System.out.println("Robot Arms Type: " + firstRobot.getRobotArms());

        System.out.println("Robot Legs Type: " + firstRobot.getRobotLegs());
    }

}
