package org.FatimaHasT.qamp.zadaci.zadaca6.task2;

public class MainRobot {

    public static void main (String[] args) {
        Robot robot = new Robot(2, 3);
        robot.moveSouth();
        robot.moveWest();
        robot.moveNorth();
        robot.moveEast();
        robot.moveEast();

        int[] currentPosition = robot.getPosition();
        System.out.println("Current position: (" + currentPosition[0] + ", " + currentPosition[1] + ")");

        double distance = robot.getDistance();
        System.out.println("Distance from initial position: " + distance);

        int moves = robot.getMoves();
        System.out.println("Number of moves: " + moves);

        System.out.println("Last 3 positions:");
        robot.printLastPosition(3);
    }

}
