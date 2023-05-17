package Ex25_BoxingGame;

public class Main {
    public static void main(String[] args) {
        // fighter created and information received
        Fighter f1 = new Fighter("Muhammed Ali", 15, 70, 62, 50);
        Fighter f2 = new Fighter("Mike Tyson", 10,100, 75,20);

        // match created
        Match match = new Match(f1,f2,50,95);

        // started match
        match.run();
    }
}
