package theGame;

public class Player {
    private String name; 
    private int[] hand; 

    public Player(String name) { 
        this.name = name; 
    }

    public void setHand(int numOfCards) { 
        this.hand = new int[numOfCards];
    }

    public String getName() { 
        return this.name; 
    }
}
