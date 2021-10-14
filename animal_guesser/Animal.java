import java.util.Scanner;
import java.util.Random;

public class Animal {

    private String species;
    private int size;

    public Animal(String species, int size) {
        this.species=species;
        this.size=size;}

    
    public boolean equals(Animal other) {
        return this.species.equals(other.species) && this.size == other.size;
    }
    
    public String compareMessage(Animal other) {
        if (this.species.equals(other.species) && this.size == other.size){
            return "Perfect Match";
        }
        else if (!this.species.equals(other.species)){
            return "Wrong Species";
        }
        else if (this.size < other.size){
            return "too large";
        }
        else if (this.size > other.size){
            return "too small";
        }
        else {
            return "wrong input";
        }
    }  
}

