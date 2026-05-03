package OOPS;

class Pokemon {
    private int power;
    String type;

    Pokemon(String type, int power) { // setter
        this.power = power;
        this.type = type;
    }

    Pokemon(int power, String type) { // setter
        this.power = power;
        this.type = type;
    }

    Pokemon() {
    }

    int getPower() { // getter
        return power;
    }

    void print() { // getter
        System.out.println(this.power + " " + this.type);
    }
}

public class RevisionOOPS {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Electric", 70);
        pikachu.type = "Fire";
        // pikachu.power = 100;
        Pokemon jigglypuff = new Pokemon(50, "Fairy");
        System.out.println(pikachu.getPower());
        pikachu.print();
        jigglypuff.print();
        Pokemon gengar = new Pokemon();
        final int x = 89; // x can't be changed
    }
}
