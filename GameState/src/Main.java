import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameCharacter character = new GameCharacter("Joulupukki");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game! " + character.getName() + "!");
        System.out.println("Level 1");

        while (character.getExperience() < 300){
            character.displayStatus();
            System.out.println("1. Train");
            System.out.println("2. Meditate");
            System.out.println("3. Fight");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    character.train();
                    break;
                case 2:
                    character.meditate();
                    break;
                case 3:
                    character.fight();
                    break;
            }
        }
    }
}