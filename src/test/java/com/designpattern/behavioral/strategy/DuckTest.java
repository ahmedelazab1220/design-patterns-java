package com.designpattern.behavioral.strategy;

import com.designpattern.behavioral.strategy.ducks.Duck;
import com.designpattern.behavioral.strategy.ducks.MallardDuck;
import com.designpattern.behavioral.strategy.ducks.RedHeadDuck;
import com.designpattern.behavioral.strategy.ducks.RubberDuck;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private PrintStream originalOut;

    @BeforeEach
    public void setUp() {
        originalOut = System.out;
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testRedHeadDuck() {
        Duck redHeadDuck = new RedHeadDuck();

        // Test flying behavior
        redHeadDuck.doFly();
        assertEquals("I'm flying with wings!", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        // Test quacking behavior
        redHeadDuck.doQuack();
        assertEquals("Quack!", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testMallardDuck() {
        Duck mallardDuck = new MallardDuck();

        // Test flying behavior
        mallardDuck.doFly();
        assertEquals("I'm flying with wings!", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        // Test quacking behavior
        mallardDuck.doQuack();
        assertEquals("Quack!", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testRubberDuck() {
        Duck rubberDuck = new RubberDuck();

        // Test flying behavior
        rubberDuck.doFly();
        assertEquals("I can't fly.", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        // Test quacking behavior
        rubberDuck.doQuack();
        assertEquals("Squeak!", outputStreamCaptor.toString().trim());
    }

}
