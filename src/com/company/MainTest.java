package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MainTest {

    // Helper method to capture console output
    private String captureConsoleOutput(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        action.run();

        System.setOut(originalOut);
        return outputStream.toString().trim();
    }

    @Test
    void testCheckSpeed() {
        assertEquals("Fast", captureConsoleOutput(() -> Main.checkSpeed(5)));
        assertEquals("Faster", captureConsoleOutput(() -> Main.checkSpeed(15)));
        assertEquals("Fastest", captureConsoleOutput(() -> Main.checkSpeed(25)));
    }

    @Test
    void testPrintNumbersUsingForLoop() {
        String expected = "Numbers using for loop:\n1 2 3 4 5";
        assertEquals(expected, captureConsoleOutput(() -> Main.printNumbersUsingForLoop(5)));
    }

    @Test
    void testPrintNumbersUsingWhileLoop() {
        String expected = "Numbers using while loop:\n5 4 3 2 1";
        assertEquals(expected, captureConsoleOutput(() -> Main.printNumbersUsingWhileLoop(5)));
    }

    @Test
    void testPerformArithmeticCalculations() {
        assertEquals("Arithmetic Result (x + y): 115", captureConsoleOutput(Main::performArithmeticCalculations));
    }

    @Test
    void testDisplayVariables() {
        String expected = """
                Integer value: 125
                Float value: 45.6
                Boolean value: true
                Char value: #
                Incorrect""";
        assertEquals(expected, captureConsoleOutput(Main::displayVariables));
    }
}
