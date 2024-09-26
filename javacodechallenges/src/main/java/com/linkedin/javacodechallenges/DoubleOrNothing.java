package com.linkedin.javacodechallenges;


import java.util.Scanner;
import java.util.Random;

public class DoubleOrNothing {

  private static int startPoints = 10;
  private Scanner scanner = new Scanner(System.in);
  private Random random = new Random();
  private int current = startPoints;
  private boolean isStillPlaying = true;

  public void playGame() {

    printWelcome();
    askUserToContinue();

    while (this.isStillPlaying) {
      printTryToDouble();

      if (shouldDouble()) {
        doubleCurrent();
        printCongrats();
        askUserToContinue();
      } else {
        printLost();
        return;
      }
    } printWalkawayMessage();
  }

  private void printWelcome () {
    System.out.println("Welcome to a game of double!");    
  }

  private void printTryToDouble () {
    System.out.println("Lets try to double it!");
  }

  private void printCongrats () {
    System.out.println("Congratulations! You now have: " + this.current);
  }

  private void printLost () {
    System.out.println("Uh oh. You've lost. No points for you");
  }

  private void printWalkawayMessage() {
    System.out.println("Congratulasion! You finished with: " + this.current);
  }

  private boolean shouldDouble () {
    return this.random.nextInt(2) == 0;
  }

  private void doubleCurrent () {
    this.current = this.current * 2;
  }

  protected void askUserToContinue () {
    System.out.println("Would you like to continue? ");
    this.isStillPlaying = this.scanner.nextLine().toUpperCase().equals("YES");
  }

  protected boolean getIsStillPlaying() {
    return this.isStillPlaying;
  }


/*     Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println(" --Welcome to Double or Nothing!-- ");
    System.out.println("Enter you bet amount: ");
    double bet = scanner.nextDouble();

    System.out.println("Flipping the coin...");
    boolean win = random.nextBoolean();

    if (win) {
      bet *= 2;
      System.out.println("Congratulations! You doubble your money!");
      System.out.println("Your new balance is: " + bet);
    } else {
      System.out.println("Sorry, you didnt win this time");
    }

    scanner.close(); */

}