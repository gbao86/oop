package tuan7;

class Animal {
    public void makeSound() {
        System.out.println("Động vật đang kêu...");
    }
}

class Pig extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Pig kêu: Ủn ỉn");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog kêu: Gâu gâu");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat kêu: Meo meo");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird kêu: Chíp chíp");
    }
}

public class BT2_tuan7 {
    public static void main(String[] args) {
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myBird = new Bird();

        myPig.makeSound();  
        myDog.makeSound(); 
        myCat.makeSound();  
        myBird.makeSound(); 
    }
}
