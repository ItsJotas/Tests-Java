package testingOptional;

import java.util.Optional;

public class TestPresentOrElse {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");

        optional.ifPresentOrElse(
                value -> System.out.println("Present value: " + value),
                () -> System.out.println("Missing value")
        );

        Optional<String> emptyOptional = Optional.empty();

        emptyOptional.ifPresentOrElse(
                value -> System.out.println("Present value: " + value),
                () -> System.out.println("Missing value")
        );
    }
}
