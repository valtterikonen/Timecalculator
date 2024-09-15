public class ExpertState implements State{

    private static final int EXPERIENCE_REQUIRED = 300;

    public void train (GameCharacter character){
        character.addExperience(10);
        System.out.println("Training...");
        checkLevelUp(character);
    }

    public void meditate(GameCharacter character){
        character.addHealth(10);
        System.out.println("Meditating...");
        character.getHealth();
    }

    public void fight(GameCharacter character){
        character.addExperience(20);
        character.addHealth(-10);
        System.out.println("Fighting...");
        character.getHealth();
        checkLevelUp(character);
    }

    public void displayStatus(GameCharacter character){
        System.out.println("Level: " + character.getExperience() + " Experience: " + character.getExperience() + " Health: " + character.getHealth());
    }

    private void checkLevelUp(GameCharacter character){
        if(character.getExperience() >= EXPERIENCE_REQUIRED){
            System.out.println("Congratulations! You are now a Master.");
        }
    }
}
