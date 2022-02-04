import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat; // make sure to import this
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest { // this play button will run all tests

    // Assertj for better syntax
    // allows you to perform
    // add to dependencies, reload
    // make sure to import: import static org.assertj.core.api.Assertions.assertThat;

    @Test // this tells junit this is our test
    void hello(){ // this is our actual test
        // Format :
        // - Given e.g. x=1 y=1
        // - When  e.g. x is added to y
        // - Then  e.g. we should get 2

        // tests need a way for us to assert something
        // junit user guide will help show you online how it works

        int result = 4 + 4;

        assertThat(result).isEqualTo(8);
        // expect: what it should do, value: the value we're getting

        // right-click and run with coverage to see what you have and haven't tested

    }
}
