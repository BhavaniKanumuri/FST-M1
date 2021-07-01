user1=input("Enter Player1 name")
user2=input("Enter Player2 name")
while True:
    user1_choice=input(user1+" What do you want to choose: rock, paper or scissors ?").lower()
    user2_choice=input(user2+" What do you want to choose: rock, paper or scissors ?").lower()

    if user1_choice == user2_choice:
        print("It's a tie")
    elif user1_choice == 'rock':
        if user2_choice == 'scissors':
            print("The winner is rock")
        else:
            print("The winner is paper")
    elif user1_choice == 'scissors':        
        if user2_choice == 'paper':
            print("The winner is scissors")  
        else:
            print("The winner is rock")
    elif user1_choice == 'paper':
        if user2_choice == 'rock':
            print("The winner is paper")
        else:
            print("The winner is scissors")
    else:
        print("It is an invalid input. Please enter rock, paper or scissors")
    begin_again=input("do you want to play another round: yes or no").lower()
    if (begin_again == 'yes'):
        pass
    elif(begin_again == 'no'):
        raise SystemExit
    else:
        print("You have entered an invalid option. Exiting now.")
        raise SystemExit