package com.company;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleMenu {
    private final static PremierLeagueManager managerOfPremierLeague = new PremierLeagueManager();

    public static void main (String[] args) throws IOException {

        Scanner option99 = new Scanner(System.in);
        int choice99 = 0;

        //options of the system which the user can select
        do {
            System.out.println("\nEnter any option number of choice");
            System.out.println("\t1)Add a new football club");
            System.out.println("\t2)Delete a football club");
            System.out.println("\t3)Display statistics for a selected club");
            System.out.println("\t4)Display the Premier League Table");
            System.out.println("\t5)Add a played match");
            System.out.println("\t6)Save details in a Text File");
            System.out.println("\t7)Open the GUI");
            System.out.println("\t8)Exit program");

            // For entering an option number
            System.out.print("\nWhat is your option > ");

            //when the user's input is a letter
            while (!option99.hasNextInt()) {
                System.out.println("\nInvalid letter! Please try again with option number.");
                System.out.print("What is your option > ");
                option99.next();
            }
            choice99 = option99.nextInt();

            switch (choice99) {
                //when the user inputs "1"
                case 1:
                    AddingFootballClub99();
                    break;
                //when the user inputs "2"
                case 2:
                    DeletingAFootballClub99();
                    break;
                //when the user inputs "3"
                case 3:
                    PrintingAFootballClub99();
                    break;
                //when the user inputs "4"
                case 4:
                    managerOfPremierLeague.GetComparator();
                    break;
                //when the user inputs "5"
                case 5:
                    AddingAPlayedMatch99();
                    break;
                //when the user inputs "6"
                case 6:
                    managerOfPremierLeague.SavingInAFile99();
                    break;
                //when the user inputs "7"
                case 7:
                    managerOfPremierLeague.GUI99();
                    System.out.println("Graphical User Interface is successfully opened !");
                    break;
                //when the user inputs "7"
                case 8:
                    System.out.println(" ~You exited from the System~ ");
                    System.exit(0);
                //when the user inputs wrong number
                default:
                    System.out.println("Your input is an invalid number!!! Please try again with correct option number.");
            }
        } while (choice99 != 8);
    }

////////////////////////////////// For adding a Football Club //////////////////////////////////////////////////

        private static void AddingFootballClub99(){
            Scanner InputData99 = new Scanner(System.in);

            //statistics of super class; "SportsClub"
            System.out.print("\nEnter the name of the Football club : ");
            String NameOfTheClub99 = InputData99.next();
            System.out.print("Enter the location of the Football club : ");
            String LocationOfClub99 = InputData99.next();
            System.out.print("Enter the register number of the Football club : ");
            String RegisterNoOfClub99 = InputData99.next();

            //statistics of sub class; "FootballClub"
            System.out.print("Enter the number of matches played : ");
            int NumbersOfMatchesPlayed99 = InputData99.nextInt();
            System.out.print("Enter the Date of the match (YY-MM-DD) : ");
            String Date99 = InputData99.next();
            System.out.print("Enter the number of wins achieved in the season : ");
            int NumberOfWins99 = InputData99.nextInt();
            System.out.print("Enter the number of draws achieved in the season : ");
            int NumberOfDraws99 = InputData99.nextInt();
            System.out.print("Enter the number of defeats achieved in the season : ");
            int NumberOfDefeats99 = InputData99.nextInt();
            System.out.print("Enter the number of goals scored : ");
            int NumberOfGoalsScored99 = InputData99.nextInt();
            System.out.print("Enter the number of goals received : ");
            int NumberOfGoalsReceived99 = InputData99.nextInt();
            System.out.print("Enter the number of points currently has : ");
            int NumberOfPoints99 = InputData99.nextInt();

            FootballClub ClubOfFootball99 = null; //null value

            ClubOfFootball99 = new FootballClub(NameOfTheClub99, LocationOfClub99, RegisterNoOfClub99, NumbersOfMatchesPlayed99,
                    NumberOfWins99, Date99, NumberOfDraws99, NumberOfDefeats99, NumberOfGoalsScored99,NumberOfGoalsReceived99,
                    NumberOfPoints99);

            managerOfPremierLeague.AddingAFootballClub99(ClubOfFootball99);
        }

////////////////////////////////////////////// For Deleting a Football Club /////////////////////////////////////////////////

    private static void DeletingAFootballClub99(){
        Scanner InputDeleteClub = new Scanner(System.in);
        System.out.print("\nEnter the Register Number of the football club you want to delete : ");
        String RegisterNoOfClub99 = InputDeleteClub.next();
        boolean DeletingResult = managerOfPremierLeague.DeletingAFootballClub99(RegisterNoOfClub99);
        }

///////////////////////////////////////////// For Printing a selected Football Club ///////////////////////////////////////

    private static void PrintingAFootballClub99(){
        Scanner InputPrintClub = new Scanner(System.in);
        System.out.print("\nEnter the Register Number of the football club you want to print : ");
        String RegisterNoOfClub99 = InputPrintClub.next();
        boolean PrintingResult = managerOfPremierLeague.PrintingAFootballClub99(RegisterNoOfClub99);
    }

    ////////////////////////////////// For adding a played match //////////////////////////////////////////////////

    private static void AddingAPlayedMatch99() {
        Scanner InputPlayedMatch99 = new Scanner(System.in);

        System.out.print("\nEnter the name of Team 01 : ");
        String NameOfTheTeam01 = InputPlayedMatch99.next();
        System.out.print("Enter the scored goals of Team 01 : ");
        int GoalsOfTeam01 = InputPlayedMatch99.nextInt();

        System.out.print("\nEnter the name of Team 02 : ");
        String NameOfTheTeam02 = InputPlayedMatch99.next();
        System.out.print("Enter the scored goals of Team 02 : ");
        int GoalsOfTeam02 = InputPlayedMatch99.nextInt();


        boolean AddingPlayedMatchResult = managerOfPremierLeague.AddingAPlayedMatch99(NameOfTheTeam01, NameOfTheTeam02, GoalsOfTeam01, GoalsOfTeam02);

    }
}
