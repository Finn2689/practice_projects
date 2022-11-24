package theGame;

import java.util.Random;

public class Deck { 
    private final int cardCount = 99; 
    private final int[] unshuffledDeck = new int[99]; 
    private int[] shuffledDeck; 

    public Deck() { 
        for(int i=1; i<cardCount; i++) { 
            unshuffledDeck[i] = i; 
        }
        this.shuffledDeck = shuffle(this.unshuffledDeck); 
    }

    private int[] shuffle(int[] unshuffledDeck) { 
        Random rand = new Random(); 
        for(int n=0; n<99; n++) { 
            int indexToSwap = rand.nextInt(unshuffledDeck.length); 
            int temp = unshuffledDeck[indexToSwap]; 
            unshuffledDeck[indexToSwap] = unshuffledDeck[n]; 
            unshuffledDeck[n] = temp; 
        }
        this.shuffledDeck = unshuffledDeck; 
        return this.shuffledDeck; 
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