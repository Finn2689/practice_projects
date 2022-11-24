package theGame;

import java.util.Scanner;

public class GamePlay {
    private int numOfPlayers; 
    private Player[] playerNames; 
    private Deck deck; 

    public GamePlay() { 
        // prompt user to enter number of players 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number of players: "); 
        int number = scanner.nextInt(); 
        scanner.nextLine(); 
        this.numOfPlayers = number; 

        // create an array of Strings that are player's names
        this.playerNames = new Player[this.numOfPlayers];
        for(int i=0; i<numOfPlayers; i++) { 
            System.out.println("Enter Player " + (i + 1) + "'s name: "); 
            String name = scanner.nextLine(); 
            Player player = new Player(name); 
            this.playerNames[i] = player; 

            // sets the length of player's hand array to the appropriate number based on how many people are playing
            if(this.numOfPlayers == 1) { 
                player.setHand(8);
            }
            else if(this.numOfPlayers == 2) { 
                player.setHand(7);
            }
            else { 
                player.setHand(6);
            }
        }
        scanner.close(); 

        // create a new shuffled deck of playing cards 
        this.deck = new Deck();
    }

    @Override 
    public String toString() { 
        String result = ""; 
        result += "Number of cards remaining in the deck: " + this.deck.length();
        return result; 
    }

    public static void main(String[] args) { 
        GamePlay newGame = new GamePlay(); 
        System.out.println(newGame);
    }
}
