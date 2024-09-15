public class IntermediateState implements State{

    private static final int EXPERIENCE_REQUIRED = 200;

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
        System.out.println("You cannot fight as a Intermediate.");
    }

    public void displayStatus(GameCharacter character){
        System.out.println("Level: " + character.getExperience() + " Experience: " + character.getExperience() + " Health: " + character.getHealth());
    }

    private void checkLevelUp(GameCharacter character){
        if(character.getExperience() >= EXPERIENCE_REQUIRED){
            character.setState(new ExpertState());
            System.out.println("Congratulations! You are now an Expert.");
            System.out.println("Level 3");
        }
    }
}
