import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {
    @Test
    void should_report_initial_position_and_direction() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When & Then
        String report = rover.report();
        assertEquals("(0, 0) N", report);
    }
    @Test
    void should_move_forward_one_step_when_facing_north() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When
        rover.execute("M");
        // Then
        assertEquals("(0, 1) N", rover.report());
    }
}
