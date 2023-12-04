package theGame;

import java.util.Random;

public class Deck { 
    private final int cardCount = 97; 
    private final int[] unshuffledDeck = new int[97]; 
    private int[] shuffledDeck; 

    public Deck() { 
        for(int i=0; i<cardCount; i++) { 
            unshuffledDeck[i] = i; 
        }
        this.shuffledDeck = shuffle(this.unshuffledDeck); 
    }

    public Deck(int[] deck) { 
        this.shuffledDeck = deck; 
    }

    private int[] shuffle(int[] unshuffledDeck) { 
        Random rand = new Random(); 
        for(int n=0; n<97; n++) { 
            int indexToSwap = rand.nextInt(unshuffledDeck.length); 
            int temp = unshuffledDeck[indexToSwap]; 
            unshuffledDeck[indexToSwap] = unshuffledDeck[n]; 
            unshuffledDeck[n] = temp; 
        }
        this.shuffledDeck = unshuffledDeck; 
        return this.shuffledDeck; 
    }

    public int[] getDeck() { 
        return this.shuffledDeck; 
    }

    public void setDeck(int[] deck) { 
        this.shuffledDeck = deck; 
    }

    @Override 
    public String toString() { 
        String result = ""; 
        for(int card : this.shuffledDeck) { 
            result += "[" + card + "]\t "; 
        }
        return result; 
    }

    public int length() { 
        return this.shuffledDeck.length; 
    }

    public static void main(String[] args) { 
        Deck deck = new Deck(); 
        System.out.println(deck); 
    }
}