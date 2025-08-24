public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String report() {
        return "(" + x + ", " + y + ") " + direction;
    }

    public void execute(String commands) {
        for (char c : commands.toCharArray()) {
            switch (c) {
                case 'M' -> moveForward();
                case 'B' -> moveBackward();
                case 'L' -> turnLeft();
                case 'R' -> turnRight();
            }
        }
    }

    private void moveForward() {
        switch (direction) {
            case N -> y++;
            case E -> x++;
            case S -> y--;
            case W -> x--;
        }
    }

    private void moveBackward() {
        switch (direction) {
            case N -> y--;
            case E -> x--;
            case S -> y++;
            case W -> x++;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case N -> direction = Direction.W;
            case W -> direction = Direction.S;
            case S -> direction = Direction.E;
            case E -> direction = Direction.N;
        }
    }

    private void turnRight() {
        switch (direction) {
            case N -> direction = Direction.E;
            case E -> direction = Direction.S;
            case S -> direction = Direction.W;
            case W -> direction = Direction.N;
        }
    }
}
