import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        Boolean gameOver = false;
        Boolean noPoint = false;
        String yesNo = "";

        do {
            int die1 = rnd.nextInt(6) + 1;
            System.out.println("First role: " + die1);
            int die2 = rnd.nextInt(6) + 1;
            System.out.println("Second role: " + die2);
            int crapsRole = die1 + die2;
            System.out.println("Total: " + crapsRole);
            System.out.println();
            if (crapsRole != 2 && crapsRole != 3 && crapsRole != 12) {
                if (crapsRole != 7 && crapsRole != 11) {
                    System.out.println("You got the point! Rolling again.");

                    do {
                        int die3 = rnd.nextInt(6) + 1;
                        System.out.println("First die roles: " + die3);
                        int die4 = rnd.nextInt(6) + 1;
                        System.out.println("Second die roles: " + die4);
                        int crapsRole2 = die3 + die4;
                        System.out.println("Die Total: " + crapsRole2);
                        if (crapsRole2 == 7) {
                            System.out.println("You got a 7! Game over.");
                            noPoint = true;
                        } else if (crapsRole2 == crapsRole) {
                            System.out.println("You got the point! You win.");
                            noPoint = true;
                        } else {
                            System.out.println("Not a point or 7. Rolling Again.");
                            noPoint = false;
                        }
                    } while(!noPoint);

                    System.out.println("Would you like to play again? Y/N");
                    yesNo = in.nextLine();
                    if (yesNo.equalsIgnoreCase("Y")) {
                        gameOver = false;
                    } else {
                        gameOver = true;
                    }
                } else {
                    System.out.println("You got a natural! You Win.");
                    System.out.println("Play Again? Y/N");
                    yesNo = in.nextLine();
                    if (yesNo.equalsIgnoreCase("Y")) {
                        gameOver = false;
                    } else {
                        gameOver = true;
                    }
                }
            } else {
                System.out.println("You got a craps! Game Over.");
                System.out.println("Would you like to play again? Y/N");
                yesNo = in.nextLine();
                if (yesNo.equalsIgnoreCase("Y")) {
                    gameOver = false;
                } else {
                    gameOver = true;
                }
            }
        } while(!gameOver);

    }
}
