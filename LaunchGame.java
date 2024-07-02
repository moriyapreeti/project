import java.util.*;
 class Guesser{
    int guessNum; // store number
    int guessingNumber(){ // method name
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser kindly guess the number: ");
        guessNum = sc.nextInt();
        return guessNum;
    }
 }

 class Player{
    int guessNum;
    int guessingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Player: kindly guess the number: ");
        guessNum = sc.nextInt();
        return guessNum;


    }
 }

 class Umpire{


    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromeGuesser(){

    Guesser g = new Guesser();
    numFromGuesser=g.guessingNumber();



    }
    void collectNumFromePlayers(){


        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();


    }

    void compare(){

        if(numFromGuesser == numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("All players win the game. ");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player1 and player 2 win the game. ");

            } 
            else if(numFromGuesser == numFromPlayer2)
            {
                System.out.println("player 1 and player 2 won the game. ");
            }  
            else{
                System.out.print("Player1 won the game: ");
        }
            
        }
        else if(numFromGuesser == numFromPlayer2)
        {
            System.out.print("Player2 won the game: ");
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.print("Player3 won the game: ");
        }
        else
        {
            System.out.print("Nobody win the game ");
        }

 }
 
}
 public class LaunchGame{
    public static void main(String[] args) {

        System.out.println("Game statrted: ");
        Umpire u = new Umpire();
        u.collectNumFromeGuesser();
        u.collectNumFromePlayers();
        u.compare();
    }
 }