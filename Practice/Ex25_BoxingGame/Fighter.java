package Ex25_BoxingGame;

public class Fighter {
    // qualifications determined
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    // constructor method
    Fighter(String name, int damage, int health, int weight,int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100)
            this.dodge = dodge;
        else
            this.dodge = 0;
    }
    // fighter foe
    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " damaged");
        if (foe.isDodge()){
            System.out.println("But "+ foe.name + " blocked");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }
    // block chance
    boolean isDodge(){
        double randomNum = Math.random() * 100;
        return randomNum <= this.dodge;
    }
}
