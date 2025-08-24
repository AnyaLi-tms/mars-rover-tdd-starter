import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {
    @Test
    void should_report_given_rover_when_init() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When & Then
        String report = rover.report();
        assertEquals("(0, 0) N", report);
    }
}
