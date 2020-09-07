package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
<<<<<<< HEAD:src/main/java/circus/Trainer.java
        // trazin(new circus.animal.Parrot());
//        circus.animal.Animal a2 = new circus.animal.Animal();
//        circus.animal.Bird b2 = new circus.animal.Bird();
=======
        // train(new Parrot());
>>>>>>> 2d109e71ee0a22922ccdc5d6cc83f47c858ad5c3:src/main/java/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
