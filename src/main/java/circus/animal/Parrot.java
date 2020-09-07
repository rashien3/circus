package circus.animal;

public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }

    @Override
    public int getValue() {
<<<<<<< HEAD:src/main/java/circus/animal/Parrot.java
        return 10;
=======
        return 20;
>>>>>>> 2d109e71ee0a22922ccdc5d6cc83f47c858ad5c3:src/main/java/Parrot.java
    }
}
