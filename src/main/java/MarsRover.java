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
                case 'B' -> moveBackward(); // 新增
                // L/R 先不实现，遵循 baby steps
                default -> { /* stretch: 可选择抛异常 */ }
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
}
