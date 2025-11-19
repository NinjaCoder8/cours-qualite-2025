package com.imt.mines.greeter.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTest {

    @Test
    void greet_shouldCapitalizeName() {
        GreetingService service = new GreetingService();
        String result = service.greet("charbel");
        assertEquals("Hello, Charbel!", result);
    }

    @Test
    void greet_shouldUseDefaultWhenNameIsBlank() {
        GreetingService service = new GreetingService();
        String result = service.greet("   ");
        assertEquals("Hello, Stranger!", result);
    }
}
