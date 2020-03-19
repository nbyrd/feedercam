package net.nbyrd.feedercam;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MainTest {

    @Test
    void runWithNames() {
        // Setup
        final PrintStream mockPrinter = mock(PrintStream.class);
        final String[] names = {"Nick", "Karina", "Debra", "Lee"};
        Main main = new Main(mockPrinter, names);

        // Execute
        main.run();

        // Assert
        verify(mockPrinter, times(1)).println("Hello Nick, Karina, Debra, Lee!");
    }

    @Test
    void runWithoutNames() {
        // Setup
        final PrintStream mockPrinter = mock(PrintStream.class);
        final String[] names = new String[0];
        Main main = new Main(mockPrinter, names);

        // Execute
        main.run();

        // Assert
        verify(mockPrinter, times(1)).println("Hello World!");
    }

    @Test
    void runWithNullNames() {
        // Setup
        final PrintStream mockPrinter = mock(PrintStream.class);
        Main main = new Main(mockPrinter, null);

        // Execute
        main.run();

        // Assert
        verify(mockPrinter, times(1)).println("Hello World!");
    }
}