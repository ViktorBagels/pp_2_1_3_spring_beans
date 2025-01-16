package app.model;

public abstract class Animal {

    public abstract String makeSound();

    @Override
    public String toString() {
        return "This is an animal " + this.getClass().getSimpleName();
    }
}
