package org.FatimaHasT.qamp.zadaci.zadaca6.task2;

import java.util.ArrayList;
import java.util.List;

    public class Robot {
        private final int x;
        private final int y;
        private int moves;
        private final List<int[]> positions;

        public Robot() {
            this.x = 0;
            this.y = 0;
            this.moves = 0;
            this.positions = new ArrayList<>();
            this.positions.add(new int[] {0, 0});
        }

        public Robot(final int x, final int y) {
            this.x = x;
            this.y = y;
            this.moves = 0;
            this.positions = new ArrayList<>();
            this.positions.add(new int[] {x, y});
        }

        public void moveSouth() {
            final int newY = y - 1;
            moves++;
            positions.add(new int[] {x, newY});
        }

        public void moveNorth() {
            final int newY = y + 1;
            moves++;
            positions.add(new int[] {x, newY});
        }

        public void moveEast() {
            final int newX = x + 1;
            moves++;
            positions.add(new int[] {newX, y});
        }

        public void moveWest() {
            final int newX = x - 1;
            moves++;
            positions.add(new int[] {newX, y});
        }

        public int[] getPosition() {
            return new int[] {x, y};
        }

        public double getDistance() {
            final int[] initialPos = positions.get(0);

            return Math.sqrt((x - initialPos[0]) * (x - initialPos[0]) + (y - initialPos[1]) * (y - initialPos[1]));
        }

        public int getMoves() {
            return moves;
        }

        public void printLastPosition(final int n) {
            final int numOfMovesToPrint = Math.min(n, moves);
            for (int i = moves - numOfMovesToPrint; i < moves; i++) {
                final int[] pos = positions.get(i);
                System.out.println("(" + pos[0] + "," + pos[1] + ")");
            }
        }
    }


