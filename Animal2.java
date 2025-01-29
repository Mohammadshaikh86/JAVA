class Animal {
    void eat() {
        System.out.println("This animal can eat.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

public class Animal2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}