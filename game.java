import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String args[]) {
        int choice;
        int turn=1;
        String name;
        int bot_score=0;
        int player_score=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to rock paper and scissor game");
        System.out.println("enter your name");
        name = sc.nextLine();
        System.out.println("Rules:");
        System.out.println("This is 3 round game\nEnter '1' for 'rock'\n'2' for 'paper'\n'3' for 'scissor'");
        while (turn != 4) {
            System.out.println(name + " turn:");
            choice = sc.nextInt();
            if (choice==1){
                System.out.println("you choose 'rock'");
            }
            if (choice==2){
                System.out.println("you choose 'paper'");
            }
            if (choice==3){
                System.out.println("you choose 'scissor'");
            }
            System.out.println("Bot turn:");
            Random num = new Random();
            int rand_num = num.nextInt(1, 4);
            if (rand_num == 1) {
                System.out.println("rock");
            } else if (rand_num == 2) {
                System.out.println("paper");
            } else {
                System.out.println("scissor");
            }

            if (choice == rand_num) {
                bot_score=bot_score+0;
                player_score=player_score+0;
                System.out.println("Bot score=" + bot_score);
                System.out.println(name + " score=" + player_score);
            }
            if (choice == 1 && rand_num == 3) {
                bot_score=bot_score+0;
                player_score=player_score+1;
                System.out.println("Bot score=" + bot_score);
                System.out.println(name + " score=" + player_score);
            }
            if (choice == 1 && rand_num == 2) {
                bot_score=bot_score+1;
                player_score=player_score+0;
                System.out.println("Bot score=" + bot_score);
                System.out.println(name + " score=" + player_score);
            }
            if (choice == 2 && rand_num == 3||choice==3&& rand_num==1) {
                bot_score=bot_score+1;
                player_score=player_score+0;
                System.out.println("Bot score=" + bot_score);
                System.out.println(name + " score=" + player_score);
            }
            if (choice == 2 && rand_num == 1||choice==3&&rand_num==2) {
                bot_score=bot_score+0;
                player_score=player_score+1;
                System.out.println("Bot score=" + bot_score);
                System.out.println(name + " score=" + player_score);
            }
            turn = turn + 1;
        }
             if(bot_score>player_score){
                 System.out.println("You lose the game");
             }
             else{
                 System.out.println("congrates!You won the game");
             }
        }
    }

