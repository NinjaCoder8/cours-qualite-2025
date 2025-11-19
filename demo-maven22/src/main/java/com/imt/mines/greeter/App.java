package com.imt.mines.greeter;

import com.imt.mines.greeter.service.GreetingService;

public class App {
    public static void main(String[] args) {
        GreetingService service = new GreetingService();

        String name = (args.length > 0) ? args[0] : null;

        String greeting = service.greet(name);
        System.out.println(greeting);
    }
}
