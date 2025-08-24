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

    @Test
    void should_move_forward_one_step_when_facing_east() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.E);
        // When
        rover.execute("M");
        // Then
        assertEquals("(1, 0) E", rover.report());
    }

    @Test
    void should_move_forward_one_step_when_facing_south() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.S);
        // When
        rover.execute("M");
        // Then
        assertEquals("(0, -1) S", rover.report());
    }

    @Test
    void should_move_forward_one_step_when_facing_west() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.W);
        // When
        rover.execute("M");
        // Then
        assertEquals("(-1, 0) W", rover.report());
    }

    @Test
    void should_move_backward_one_step_when_facing_north() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When
        rover.execute("B");
        // Then
        assertEquals("(0, -1) N", rover.report());
    }

    @Test
    void should_move_backward_one_step_when_facing_east() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.E);
        // When
        rover.execute("B");
        // Then
        assertEquals("(-1, 0) E", rover.report());
    }

    @Test
    void should_move_backward_one_step_when_facing_south() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.S);
        // When
        rover.execute("B");
        // Then
        assertEquals("(0, 1) S", rover.report());
    }

    @Test
    void should_move_backward_one_step_when_facing_west() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.W);
        // When
        rover.execute("B");
        // Then
        assertEquals("(1, 0) W", rover.report());
    }

    @Test
    void should_turn_left_from_north() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When
        rover.execute("L");
        // Then
        assertEquals("(0, 0) W", rover.report());
    }

    @Test
    void should_turn_left_from_west() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.W);
        // When
        rover.execute("L");
        // Then
        assertEquals("(0, 0) S", rover.report());
    }

    @Test
    void should_turn_left_from_south() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.S);
        // When
        rover.execute("L");
        // Then
        assertEquals("(0, 0) E", rover.report());
    }

    @Test
    void should_turn_left_from_east() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.E);
        // When
        rover.execute("L");
        // Then
        assertEquals("(0, 0) N", rover.report());
    }

    @Test
    void should_turn_right_from_north() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When
        rover.execute("R");
        // Then
        assertEquals("(0, 0) E", rover.report());
    }

    @Test
    void should_turn_right_from_east() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.E);
        // When
        rover.execute("R");
        // Then
        assertEquals("(0, 0) S", rover.report());
    }

    @Test
    void should_turn_right_from_south() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.S);
        // When
        rover.execute("R");
        // Then
        assertEquals("(0, 0) W", rover.report());
    }

    @Test
    void should_turn_right_from_west() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.W);
        // When
        rover.execute("R");
        // Then
        assertEquals("(0, 0) N", rover.report());
    }

    @Test
    void should_execute_batch_commands_sequentially() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When
        rover.execute("MRMLM");
        // Then
        assertEquals("(1, 2) N", rover.report());
    }
}
