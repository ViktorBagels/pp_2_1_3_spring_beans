package app.model;


import org.springframework.stereotype.Component;

@Component

public class Dog extends Animal {

    @Override
    public String makeSound() {
        return "Gav";
    }

    @Override
    public String toString() {
        return "i'm a Dog";
    }
}
