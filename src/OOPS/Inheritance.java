package OOPS;

class PokemonClass {
    int power;
    String type;

    PokemonClass(String type, int power) {
        this.power = power;
        this.type = type;
    }

    PokemonClass() {
    }

    void print() { // getter
        System.out.println(this.power + " " + this.type);
    }
}

class StrongPokemon extends PokemonClass { // child class / derived class
    int speed;

}

class LegendaryPokemon extends PokemonClass { // child class / derived class
    String specialAbility;

}

class GodPokemon extends LegendaryPokemon {
    char tag;
    
}

public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.specialAbility = "Pressure";
        GodPokemon dialga = new GodPokemon();
        dialga.tag = 'D';

    }

}
