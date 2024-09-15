public class NoviceState implements State{

    private static final int EXPERIENCE_REQUIRED = 100;

    public void train (GameCharacter character){
        character.addExperience(10);
        System.out.println("Training...");
        checkLevelUp(character);
    }

    public void meditate(GameCharacter character){
        System.out.println("You cannot meditate as a novice.");
    }

    public void fight(GameCharacter character){
        System.out.println("You cannot fight as a novice.");
    }

    public void displayStatus(GameCharacter character){
        System.out.println("Experience: " + character.getExperience() + " Health: " + character.getHealth());
    }

    private void checkLevelUp(GameCharacter character){
        if(character.getExperience() >= EXPERIENCE_REQUIRED){
            character.setState(new IntermediateState());
            System.out.println("Congratulations! You are now an Intermediate.");
            System.out.println("Level 2");
        }
    }
}
