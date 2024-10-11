package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FirstTest{
    @Test
    void testfizzString2A(){
        StringProblems o = new StringProblems();
        String expectedOutput = "1!";
        String studentOutput= o.fizzString2(1);
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testfizzString2B(){
        StringProblems o = new StringProblems();
        String expectedOutput = "2!";
        String studentOutput= o.fizzString2(2);
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testfizzString2C(){
        StringProblems o = new StringProblems();
        String expectedOutput = "Fizz!";
        String studentOutput= o.fizzString2(3);
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testfizzString2D(){
        StringProblems o = new StringProblems();
        String expectedOutput = "Buzz!";
        String studentOutput= o.fizzString2(10);
        assertEquals(expectedOutput,studentOutput);
    }


   
    @Test
    void testfizzString2E(){
        StringProblems o = new StringProblems();
        String expectedOutput = "FizzBuzz!";
        String studentOutput= o.fizzString2(15);
        assertEquals(expectedOutput,studentOutput);
    }
}
