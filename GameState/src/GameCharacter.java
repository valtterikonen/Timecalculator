public class GameCharacter {
    private State state;
    private String name;
    private int experiencePoints;
    private int health;

    public GameCharacter(String name){
        this.name = name;
        this.state = new NoviceState();
        this.experiencePoints = 0;
        this.health = 100;
    }

    public void train(){
        state.train(this);
    }

    public void meditate(){
        state.meditate(this);
    }

    public void fight(){
        state.fight(this);
    }

    public void displayStatus(){
        state.displayStatus(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public void getState(){
        System.out.println(state);
    }

    public String getName(){
        return name;
    }

    public int getExperience(){
        return experiencePoints;
    }

    public void addExperience(int experience){
        experiencePoints += experience;
    }

    public void addHealth(int health){
        this.health += health;
    }

    public int getHealth(){
        return health;
    }

}
