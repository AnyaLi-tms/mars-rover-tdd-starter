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
            if (c == 'M') {
                moveForward();
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
}
