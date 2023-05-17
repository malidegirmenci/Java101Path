package Ex25_BoxingGame;

import java.util.Random;
public class Match {
    // qualification determined
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Random random = new Random();

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        // values from parameter assigned to attributes
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    // main struct
    public void run(){
        if(isCheck()){
            int randomNum = random.nextInt(2);
            if (randomNum == 0) {
                System.out.println(f1.name + " made first attack");
                this.f2.health = this.f1.hit(f2);
            } else {
                System.out.println(f2.name + " made first attack");
                this.f1.health = this.f2.hit(f1);
            }
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("========NEW ROUND========");
                this.f2.health = this.f1.hit(f2);
                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " Health: " + this.f1.health);
                System.out.println(this.f2.name + " Health: " + this.f2.health);
                }
        }else{
            System.out.println("The weights of the athletes do not match.");
        }
    }
    // check weight of fighters
    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    // check to win
    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " won!");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(this.f1.name + " won!");
            return true;
        }
        return false;
    }
}
