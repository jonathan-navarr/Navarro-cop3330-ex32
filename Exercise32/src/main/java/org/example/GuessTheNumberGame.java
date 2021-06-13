package org.example;
import java.util.Scanner;
import java.util.Random;
import java.lang.Object;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rndm = new Random();
        int difflvl, guess, guesscount;

        int rndm1 = rndm.nextInt(10);
        int rndm2 = rndm.nextInt(100);
        int rndm3 = rndm.nextInt(1000);
        String play =  "y";



        while(play.equals("y") || play.equals("Y"))
        {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            difflvl = scnr.nextInt();

            if (difflvl == 1) {
                guesscount = 0;
                System.out.print("I have my number. What's your guess? ");
                guesscount++;
                guess = scnr.nextInt();
                while (guess != rndm1) {

                    if (guess < rndm1) {
                        System.out.print("Too low. Guess again: ");
                        guess = scnr.nextInt();
                        guesscount += 1;
                    } else if (guess > rndm1) {
                        System.out.print("Too high. Guess again: ");
                        guess = scnr.nextInt();
                        guesscount += 1;
                    } else {
                        System.out.print("That's not a valid guess: ");
                        guess = scnr.nextInt();
                        guesscount += 1;
                    }

                }
                if (guess == rndm1) {
                    System.out.print("You got it in " + guesscount + " guesses!");
                    guess = scnr.nextInt();
                }
                if (difflvl == 2) {
                    guesscount = 0;
                    System.out.print("I have my number. What's your guess? ");
                    guess = scnr.nextInt();
                    guesscount++;
                    while (guess != rndm2) {

                        if (guess < rndm2) {
                            System.out.print("Too low. Guess again: ");
                            guess = scnr.nextInt();
                            guesscount += 1;
                        } else if (guess > rndm2) {
                            System.out.print("Too high. Guess again: ");
                            guess = scnr.nextInt();
                            guesscount += 1;
                        } else {
                            System.out.print("That's not a valid guess: ");
                            guess = scnr.nextInt();
                            guesscount += 1;
                        }

                    }
                    if (guess == rndm2) {
                        System.out.print("You got it in " + guesscount + " guesses!");
                        guess = scnr.nextInt();
                    }
                    if (difflvl == 3) {
                        guesscount = 0;
                        System.out.print("I have my number. What's your guess? ");
                        guess = scnr.nextInt();
                        guesscount++;
                        while (guess != rndm3) {

                            if (guess < rndm3) {
                                System.out.print("Too low. Guess again: ");
                                guess = scnr.nextInt();
                                guesscount+= 1;
                            } else if (guess > rndm3) {
                                System.out.print("Too high. Guess again: ");
                                guess = scnr.nextInt();
                                guesscount += 1;
                            } else {
                                System.out.print("That's not a valid guess: ");
                                guess = scnr.nextInt();
                                guesscount += 1;
                            }

                        }
                        if (guess == rndm3) {
                            System.out.print("You got it in " + guesscount + " guesses!");
                            guess = scnr.nextInt();
                        }
                    }
                }
                System.out.print("Do you wish to play again (Y/N)? ");
                play = scnr.next();
            }
        }
    }
}