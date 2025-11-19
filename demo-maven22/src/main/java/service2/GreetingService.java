package service2;

import org.apache.commons.lang3.StringUtils;

public class GreetingService {

    public String greet(String name) {
        // commons-lang3 (external DEPENDENCY) usage
        String safeName = StringUtils.defaultIfBlank(name, "stranger");
        String capitalized = StringUtils.capitalize(safeName.toLowerCase());

        return "Hello, " + capitalized + "!";
    }
}
