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

    public void deal(Player[] players) { 
        for(Player player : players) { 

            int card = deck.getDeck()[0];
            if(numOfPlayers == 1) { 
                for(int g=0; g<8; g++) { 
                    player.addCard(g, card);
                }
            } else if(numOfPlayers == 2) { 
                for(int k=0; k<7; k++) { 
                    player.addCard(k, card);
                }
            } else { 
                for(int u=6; u<6; u++) { 
                    player.addCard(u, card);
                }
            }

            // makes a copy of the deck and sets this as the new deck with the card removed
            int[] newDeck = new int[deck.length()-1]; 
            for(int i=0; i<newDeck.length; i++) { 
                newDeck[i] = deck.getDeck()[i+1]; 
            }
            deck = new Deck(newDeck); 
        }
    }

    public static void main(String[] args) { 
        GamePlay newGame = new GamePlay(); 
        System.out.println(newGame);
    }
}
