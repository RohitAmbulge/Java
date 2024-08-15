abstract class Animal {
    public Animal() {
        System.out.println("They are pet Animals");
    }

    abstract public void makesSound();

    abstract public void honest();

    public void Eat() {
        System.out.println("They can eat");
    }
}

class Dog extends Animal {
    public void makesSound() {
        System.out.println("Bark");
    }

    public void honest() {
        System.out.println("they are honest");
    }
}

class Cat extends Animal {
    public void makesSound() {
        System.out.println("mew-mew");
    }

    public void honest() {
        System.out.println("They are not as much honest");
    }

}

public class main {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.makesSound();
        d.honest();
        d.Eat();
        Animal c = new Cat();
        c.makesSound();
        c.honest();
        c.Eat();
    }

}
