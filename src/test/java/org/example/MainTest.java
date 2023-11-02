package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void whenCallMethod_printMsg(){
        String expected = "Hello Jenkins!";
        String actual = new Main().greet();

         Assertions.assertEquals(expected, actual);
    }
}
