"""p1 = input("ply 1: ")
p2 = input("ply 2: ")

if p1 == p2:
    print("Tie")
elif p1 == "rock" and p2 == "scissors":
    print("ply 1 wins")
elif p2 == "scissors" and p2 == "paper":
    print("ply 2 wins")
elif p1 == "paper" and p2 == "rock":
    print("ply 1 wins")
else:
    print("ply 2 wins")"""

def play_rps(p1: str, p2: str):
    match(p1.lower(), p2.lower()):
        case (move1, move2) if move1==move2:
            return "it is a tie"
        case('scissors','rock') | ('rock','paper') | ('paper','scissors'):
            return "player2 wins"
        case('rock','scissors') | ('paper','rock') |('scissors','paper'):
            return "player1 wins"
        case _:
            return "Invalid input"

print(play_rps('rock','scissors'))