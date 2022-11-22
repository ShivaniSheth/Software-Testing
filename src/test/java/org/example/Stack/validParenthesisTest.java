package org.example.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validParenthesisTest {

    @Test
    void isValid() {
        validParenthesis v=new validParenthesis();
        assertEquals(true,v.isValid("()"),"valid parenthesis Test successful");
    }
}