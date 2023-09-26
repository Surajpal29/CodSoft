import java.util.Scanner;

public class Task1_Number_Game {

    public static void main(String[] args) {
        
        System.out.println("****************************************************************************************");
        System.out.println("****************************************************************************************");
        System.out.println("****************************************************************************************");
        System.out.println();
        System.out.println("\t\t\t WELCOME TO THE NUMBER GAME!");
        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("****************************************************************************************");
        System.out.println("****************************************************************************************");
        System.out.println();
        System.out.println("Let's play the game...");
        System.out.println("I will pick a number between 1 and 100, and you will try to pick that number");
        System.out.println();
        Scanner scc=new Scanner(System.in);
        boolean playAgain;
        do{
            playGame();
            System.out.println("Would you like to play the game again!");
            System.out.println("If you want to play the game again then press 'y' to continue, otherwise press 'n' to cancel");
            String want_to_play_again=scc.next();
            if(want_to_play_again.equals("y")){
                  playAgain=true;
            }else{
                playAgain=false;
            }
            
        }while (playAgain);
        System.out.println("Thanks! for playing this awesome game!");    
    }
    static void playGame(){
        int Number_taken_by_computer;
        int Number_guess_by_user;
        int guess_count=0;
        Number_taken_by_computer=(int)(100*Math.random())+1;
        System.out.println();
        System.out.println();
        System.out.println("Enter the number you have guessed");
        Scanner sc = new Scanner(System.in);
        
        boolean play=true;
        while(play){
            Number_guess_by_user=sc.nextInt();
            guess_count++;
            if(Number_guess_by_user==Number_taken_by_computer){
                System.out.println();
                System.out.println("*******************YEHH! YOU WON THE THE GAME *******************");
                System.out.println("The number guess by you and computer that was same");
                score(guess_count);
                break;
            }else if(Number_guess_by_user<Number_taken_by_computer){
                System.out.println();
                System.out.println("wrong choice!");
                System.out.println(Number_guess_by_user +" is smaller than that number");
                System.out.println("try again with greater number than "+Number_guess_by_user);
                System.out.println("Enter the number again");
            }else if(Number_guess_by_user>Number_taken_by_computer){
                System.out.println();
                 System.out.println("wrong choice!");
                System.out.println(Number_guess_by_user +" is greater than that number");
                System.out.println("try again with smaller number than "+Number_guess_by_user);
                System.out.println("Enter the number again");
            }
            if(guess_count==5){
                System.out.println();
                System.out.println("GAME OVER!");
                System.out.println("Better Luck next time");
                break;
            }
        }
    }
    static void score(int guess_count){
          System.out.println();
          System.out.println();
          if (guess_count==1) {  
              System.out.println("YOUR TOTAL SCORE OF THE GAME IS "+100);
          }else if (guess_count==2){
            System.out.println("YOUR TOTAL SCORE OF THE GAME IS "+75);
          }else if(guess_count==3){
            System.out.println("YOUR TOTAL SCORE OF THE GAME IS "+50);
          }else if(guess_count==4){
            System.out.println("YOUR TOTAL SCORE OF THE GAME IS "+30);
          }else{
            System.out.println("YOUR TOTAL SCORE OF THE GAME IS "+10);
          }
          System.out.println();
    }
}