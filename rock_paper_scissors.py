import random 
ROCK = 1 
PAPER = 2
SCISSORS = 3 

def play_game(user_move, comp_move): 
    if comp_move == 1: 
        comp_move = 'rock' 
    elif comp_move == 2: 
        comp_move = 'paper' 
    else: 
        comp_move = 'scissors'

    if user_move == comp_move: 
        print('Tie!') 
    elif user_move == 'rock' and comp_move == 'paper' or user_move == 'paper' and comp_move == 'scissors' or user_move == 'scissors' and comp_move == 'rock': 
        print('Computer wins.')
    else: 
        print('You win!')

def main():
    user_move = input('Rock, paper, scissors, shoot! ')
    comp_move = random.randint(1, 3)
    print(comp_move)
    play_game(user_move, comp_move)

main()