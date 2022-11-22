package org.example.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validParenthesisTest {

    @Test
    void isValid() {
        validParenthesis v=new validParenthesis();


        //test paths
        assertFalse(v.isValid("("), "valid parenthesis Test successful");
        assertTrue(v.isValid("()"), "valid parenthesis Test successful");
        //prime paths
        assertFalse(v.isValid(")("), "valid parenthesis Test successful");
        assertFalse(v.isValid(")"), "valid parenthesis Test successful");
        assertTrue(v.isValid(""), "valid parenthesis Test successful");
        assertFalse(v.isValid("(("), "valid parenthesis Test successful");
        assertTrue(v.isValid(""), "valid parenthesis Test successful");
    }
}