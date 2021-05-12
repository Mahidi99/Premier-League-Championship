package com.company;

import java.io.*;
import java.util.*;

public class PremierLeagueManager implements LeagueManager {

    public static List<FootballClub> ClubOfFootballClubList = new ArrayList<>();


    //////////////////////////////////////////////// For Adding a Football Club ///////////////////////////////////////
    @Override
    public void AddingAFootballClub99(FootballClub ClubOfFootball99) {
        ClubOfFootballClubList.add(ClubOfFootball99);
    }


    /////////////////////////////////////////////// For Deleting a Football Club ///////////////////////////////////////
    @Override
    public boolean DeletingAFootballClub99(String RegisterNoOfClub99) {
        boolean MethodOfDeleting99 = false;

        //deleting a football club which is in the 'ClubOfFootballClubList'
        for (SportsClub ClubOfFootball99 : ClubOfFootballClubList) {
            //checking that the entered Register number is in the 'ClubOfFootballClubList' or not
            if (ClubOfFootball99.getRegisterNoOfClub99().equals(RegisterNoOfClub99)) {
                MethodOfDeleting99 = true;
                //removing the selected club from the list
                ClubOfFootballClubList.remove(ClubOfFootball99);

                //printing the details fof removed club
                System.out.println("\nThis Football Club is successfully deleted from the system!");
                System.out.println("\tClub : " + ClubOfFootball99.getNameOfTheClub99()
                        + " |\tRegister Number : " + RegisterNoOfClub99
                        + " |\tLocation : " + ClubOfFootball99.getLocationOfClub99());

                break;
            }
        }
        //when a user inputs a wrong Club Register number
        if (!MethodOfDeleting99) {
            System.out.println("Sorry!! No football club with this Register Number.");
        }
        return MethodOfDeleting99;
    }


    ///////////////////////////////////////////// For printing a selected Football Club ///////////////////////////////////////
    @Override
    public boolean PrintingAFootballClub99(String RegisterNoOfClub99) {
        boolean MethodOfPrinting99 = false;

        //printing the details of selected Football Club
        for (SportsClub ClubOfFootball99 : ClubOfFootballClubList) {
        //checking that the entered Register number is in the 'ClubOfFootballClubList' or not
            if (ClubOfFootball99.getRegisterNoOfClub99().equals(RegisterNoOfClub99)) {
                MethodOfPrinting99 = true;
                //printing the details of selected Football Club
                    System.out.println("");
                    System.out.println("\tClub : " + ClubOfFootball99.getNameOfTheClub99()
                            + " \n\tRegister Number : " + ClubOfFootball99.getRegisterNoOfClub99()
                            + " \n\tLocation : " + ClubOfFootball99.getLocationOfClub99()
                            + " \n\tNumber of matches played : " + ((FootballClub) ClubOfFootball99).getNumberOfMatchesPlayed99()
                            + " \n\tWinning years : " + ((FootballClub) ClubOfFootball99).getDate99()
                            + " \n\tNumber of Wins : " + ((FootballClub) ClubOfFootball99).getNumberOfWins99()
                            + " \n\tNumber of Draws : " + ((FootballClub) ClubOfFootball99).getNumberOfDraws99()
                            + " \n\tNumber of Defeats : " + ((FootballClub) ClubOfFootball99).getNumberOfDefeats99()
                            + " \n\tNumber of Scored Goals : " + ((FootballClub) ClubOfFootball99).getNumberOfGoalsScored99()
                            + " \n\tNumber of Received Goals : " + ((FootballClub) ClubOfFootball99).getNumberOfGoalsReceived99()
                            + " \n\tNumber of Points : " + ((FootballClub) ClubOfFootball99).getNumberOfPoints99());

                break;
            }
        }
        //when a user inputs a wrong Club Register number
        if (!MethodOfPrinting99) {
            System.out.println("Sorry!! No football club with this Register Number.");
        }
        return MethodOfPrinting99;
    }


    /////////////////////////////////////////////For printing Premier League Table//////////////////////////////////////
   @Override
    public List<FootballClub> GetComparator(){
        //to sort the premier league table
        ClubOfFootballClubList.sort(new Comparator());
       FootballClub[] ArrayInList99 = ClubOfFootballClubList.toArray(new FootballClub[]{});
       List<FootballClub> SortedList99 = Arrays.asList(ArrayInList99);
       System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.printf("%10s %20s %15s %15s %16s %15s %15s %15s %18s %18s %12s","Club Name","Register Number","Location","Matches","Winning years",
               "Wins","Draws","Defeats","Scored Goals","Received Goals","Points");
       System.out.println();
       System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (FootballClub ClubOfFootball99 : ClubOfFootballClubList){
            System.out.format("%5s %15s %20s %15s %15s %15s %15s %15s %15s %15s %17s",
                    ClubOfFootball99.getNameOfTheClub99(),
                    ClubOfFootball99.getRegisterNoOfClub99(),
                    ClubOfFootball99.getLocationOfClub99(),
                    ((FootballClub) ClubOfFootball99).getNumberOfMatchesPlayed99(),
                    ((FootballClub) ClubOfFootball99).getDate99(),
                    ((FootballClub) ClubOfFootball99).getNumberOfWins99(),
                    ((FootballClub) ClubOfFootball99).getNumberOfDraws99(),
                    ((FootballClub) ClubOfFootball99).getNumberOfDefeats99(),
                    (((FootballClub) ClubOfFootball99).getNumberOfGoalsScored99()),
                    ((FootballClub) ClubOfFootball99).getNumberOfGoalsReceived99(),
                    ((FootballClub) ClubOfFootball99).getNumberOfPoints99());
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

       //when the 'ClubOfFootballClubList' is empty
       if (ClubOfFootballClubList.size() == 0) {
           System.out.println("Nothing to sort !");
       }
        return SortedList99;
    }


    ///////////////////////////////////////////// For adding a played match ////////////////////////////////////////////
    @Override
    public boolean AddingAPlayedMatch99(String NameOfTheTeam01, String NameOfTheTeam02, int GoalsOfTeam01, int GoalsOfTeam02) {
        boolean MethodOfAddingAPlayedMatch99 = false;

        //adding a played match of 2 teams which are in the 'ClubOfFootballClubList'
        for (SportsClub ClubOfFootball99 : ClubOfFootballClubList) {

            //checking that the entered Club name is in the 'ClubOfFootballClubList' or not
            if (ClubOfFootball99.getNameOfTheClub99().equals(NameOfTheTeam01)) {
                MethodOfAddingAPlayedMatch99 = true;

                //updating the list with new values
                if(GoalsOfTeam01 > GoalsOfTeam02){
                    ((FootballClub) ClubOfFootball99).setNumberOfWins99(((FootballClub) ClubOfFootball99).getNumberOfWins99()+1);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsScored99(((FootballClub) ClubOfFootball99).getNumberOfGoalsScored99()+GoalsOfTeam01);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsReceived99(((FootballClub) ClubOfFootball99).getNumberOfGoalsReceived99()+GoalsOfTeam02);
                    ((FootballClub) ClubOfFootball99).setNumberOfPoints99(((FootballClub) ClubOfFootball99).getNumberOfPoints99()+3);
                    ((FootballClub) ClubOfFootball99).setNumbersOfMatchesPlayed99(((FootballClub) ClubOfFootball99).getNumberOfMatchesPlayed99()+1);
                }
                //updating the list with new values
                else if(GoalsOfTeam01 == GoalsOfTeam02) {
                    ((FootballClub) ClubOfFootball99).setNumberOfDraws99(((FootballClub) ClubOfFootball99).getNumberOfDraws99()+1);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsScored99(((FootballClub) ClubOfFootball99).getNumberOfGoalsScored99() + GoalsOfTeam01);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsReceived99(((FootballClub) ClubOfFootball99).getNumberOfGoalsReceived99()+GoalsOfTeam02);
                    ((FootballClub) ClubOfFootball99).setNumberOfPoints99(((FootballClub) ClubOfFootball99).getNumberOfPoints99()+1);
                    ((FootballClub) ClubOfFootball99).setNumbersOfMatchesPlayed99(((FootballClub) ClubOfFootball99).getNumberOfMatchesPlayed99()+1);
                }
                //updating the list with new values
                else{
                    ((FootballClub) ClubOfFootball99).setNumberOfDefeats99(((FootballClub) ClubOfFootball99).getNumberOfDefeats99()+1);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsScored99(((FootballClub) ClubOfFootball99).getNumberOfGoalsScored99()+GoalsOfTeam01);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsReceived99(((FootballClub) ClubOfFootball99).getNumberOfGoalsReceived99()+GoalsOfTeam02);
                    ((FootballClub) ClubOfFootball99).setNumbersOfMatchesPlayed99(((FootballClub) ClubOfFootball99).getNumberOfMatchesPlayed99()+1);
                }
                break;
            }
        }
        //adding a played match of 2 teams which are in the 'ClubOfFootballClubList'
        for (SportsClub ClubOfFootball99 : ClubOfFootballClubList) {

            //checking that the entered club name is in the 'ClubOfFootballClubList' or not
            if (ClubOfFootball99.getNameOfTheClub99().equals(NameOfTheTeam02)) {
                MethodOfAddingAPlayedMatch99 = true;

                //updating the list with new values
                if(GoalsOfTeam02 > GoalsOfTeam01){
                    ((FootballClub) ClubOfFootball99).setNumberOfWins99(((FootballClub) ClubOfFootball99).getNumberOfWins99()+1);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsScored99(((FootballClub) ClubOfFootball99).getNumberOfGoalsScored99()+GoalsOfTeam02);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsReceived99(((FootballClub) ClubOfFootball99).getNumberOfGoalsReceived99()+GoalsOfTeam01);
                    ((FootballClub) ClubOfFootball99).setNumberOfPoints99(((FootballClub) ClubOfFootball99).getNumberOfPoints99()+3);
                    ((FootballClub) ClubOfFootball99).setNumbersOfMatchesPlayed99(((FootballClub) ClubOfFootball99).getNumberOfMatchesPlayed99()+1);
                }
                //updating the list with new values
                else if(GoalsOfTeam01 == GoalsOfTeam02) {
                    ((FootballClub) ClubOfFootball99).setNumberOfDraws99(((FootballClub) ClubOfFootball99).getNumberOfDraws99()+1);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsScored99(((FootballClub) ClubOfFootball99).getNumberOfGoalsScored99() + GoalsOfTeam02);
                    ((FootballClub) ClubOfFootball99).setNumberOfPoints99(((FootballClub) ClubOfFootball99).getNumberOfPoints99()+1);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsReceived99(((FootballClub) ClubOfFootball99).getNumberOfGoalsReceived99()+GoalsOfTeam01);
                    ((FootballClub) ClubOfFootball99).setNumbersOfMatchesPlayed99(((FootballClub) ClubOfFootball99).getNumberOfMatchesPlayed99()+1);
                }
                //updating the list with new values
                else{
                    ((FootballClub) ClubOfFootball99).setNumberOfDefeats99(((FootballClub) ClubOfFootball99).getNumberOfDefeats99()+1);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsScored99(((FootballClub) ClubOfFootball99).getNumberOfGoalsScored99()+GoalsOfTeam02);
                    ((FootballClub) ClubOfFootball99).setNumberOfGoalsReceived99(((FootballClub) ClubOfFootball99).getNumberOfGoalsReceived99()+GoalsOfTeam01);
                    ((FootballClub) ClubOfFootball99).setNumbersOfMatchesPlayed99(((FootballClub) ClubOfFootball99).getNumberOfMatchesPlayed99()+1);
                }
                break;
            }
        }
        //when a user inputs a wrong name of club which was not added to the system previously
        if (!MethodOfAddingAPlayedMatch99) {
            System.out.println("\nSorry!! No football club with this Name");
        }
        return MethodOfAddingAPlayedMatch99;
    }


    //////////////////////////////////Saving Details of Football Club In A File ////////////////////////////////////
    @Override
    //storing all the information in 'FootballClub_Details' text file
    public void SavingInAFile99() throws IOException {
            //Creating the text file; "FootballClub_Details.txt"
        File TextDocument99 =  new File("FootballClub_Details.txt");
            //This is to create file writer object
        FileWriter WriteFootballClubsDetails =  null;
            //appending
        WriteFootballClubsDetails =  new FileWriter(TextDocument99,true);
            ////This is to create a new print writer object and for auto flushing
        PrintWriter FootballClubsDetails99 =  new PrintWriter(WriteFootballClubsDetails, true);

        //Saving all details of Football Clubs which are entered by user, in ClubOfFootballClubList
        for (SportsClub ClubOfFootball99 : ClubOfFootballClubList){

             //writing data user entered, in the text file
            FootballClubsDetails99.write("\n\tClub : " + ClubOfFootball99.getNameOfTheClub99()
                    + " \n\tRegister Number : " + ClubOfFootball99.getRegisterNoOfClub99()
                    + " \n\tLocation : " + ClubOfFootball99.getLocationOfClub99()
                    + " \n\tNumber of matches played : " + ((FootballClub) ClubOfFootball99).getNumberOfMatchesPlayed99()
                    + " \n\tWinning years : " + ((FootballClub) ClubOfFootball99).getDate99()
                    + " \n\tNumber of Wins : " + ((FootballClub) ClubOfFootball99).getNumberOfWins99()
                    + " \n\tNumber of Draws : " + ((FootballClub) ClubOfFootball99).getNumberOfDraws99()
                    + " \n\tNumber of Defeats : " + ((FootballClub) ClubOfFootball99).getNumberOfDefeats99()
                    + " \n\tNumber of Scored Goals : " + ((FootballClub) ClubOfFootball99).getNumberOfGoalsScored99()
                    + " \n\tNumber of Received Goals : " + ((FootballClub) ClubOfFootball99).getNumberOfGoalsReceived99()
                    + " \n\tNumber of Points : " + ((FootballClub) ClubOfFootball99).getNumberOfPoints99());
            FootballClubsDetails99.println();
        }
            //when 'ClubOfFootballClubList' is empty
        if (ClubOfFootballClubList.size() == 0){
            System.out.println("Sorry! The list of football clubs is empty !");
        } else {
            System.out.println("All the information you entered are successfully saved in 'FootballClub_Details' text file..");
        }
    }


    /////////////////////////////////////////////Opening_GUI////////////////////////////////////////////////////////
    @Override
    public void GUI99() {
        new Thread() {
            //to run the interface
            @Override
            public void run() {
                //for opening the GUI
                javafx.application.Application.launch(GUI99.class);
            }
        }
                /////
                .start();
    }
}
