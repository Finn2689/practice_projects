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

    public void addCard(int space, int card) { 
        this.hand[space] = card; 
    }

    public String getName() { 
        return this.name; 
    }

    @Override 
    public String toString() { 
        String result = ""; 
        result += this.getName(); 
        result += "["; 
        for(int c=0; c<this.hand.length; c++) { 
            if(c == hand.length -1) { 
                result += (hand[c] + "]"); 
            } else {
                result += (hand[c] + ", "); 
            }
        }
        return result; 
    }
}
