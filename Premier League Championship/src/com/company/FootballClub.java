package com.company;

public class FootballClub extends SportsClub {
        //private NumbersOfMatchesPlayed
    private int NumbersOfMatchesPlayed99;
        //private NumberOfWins99
    private int NumberOfWins99;
        //private Date99
    private String Date99;
        //private NumberOfDraws99
    private int NumberOfDraws99;
        //private NumberOfDefeats99
    private int NumberOfDefeats99;
        //private NumberOfGoalsScored99
    private int NumberOfGoalsScored99;
        //private NumberOfGoalsReceived99
    private int NumberOfGoalsReceived99;
        //private NumberOfPoints99
    private int NumberOfPoints99;

    //Constructor to initialize NumbersOfMatchesPlayed99, NumberOfWins99, Date99,NumberOfDraws99, NumberOfDefeats99, NumberOfGoalsScored99, NumberOfPoints99
    public FootballClub(String NameOfTheClub99, String LocationOfClub99, String RegisterNoOfClub99,
                        int NumbersOfMatchesPlayed99, int NumberOfWins99, String Date99, int NumberOfDraws99,
                        int NumberOfDefeats99, int NumberOfGoalsScored99,int NumberOfGoalsReceived99, int NumberOfPoints99) {

        //statistics of super class; "SportsClub"
        super(NameOfTheClub99, LocationOfClub99, RegisterNoOfClub99);

        //statistics of sub class; "FootballClub"
        this.NumbersOfMatchesPlayed99 = NumbersOfMatchesPlayed99;
        this.NumberOfWins99 = NumberOfWins99;
        this.Date99 = Date99;
        this.NumberOfDraws99 = NumberOfDraws99;
        this.NumberOfDefeats99 = NumberOfDefeats99;
        this.NumberOfGoalsScored99 = NumberOfGoalsScored99;
        this.NumberOfGoalsReceived99 = NumberOfGoalsReceived99;
        this.NumberOfPoints99 = NumberOfPoints99;

    }

    //getter method for NumberOfMatchesPlayed99
    public int getNumberOfMatchesPlayed99() {
        return (NumbersOfMatchesPlayed99);
    }

    //setter method for NumberOfMatchesPlayed99
    public void setNumbersOfMatchesPlayed99(int numbersOfMatchesPlayed99) {
        NumbersOfMatchesPlayed99 = numbersOfMatchesPlayed99;
    }

    //getter method for Date99
    public String getDate99() {
        return (Date99);
    }

    //setter method for Date99
    public void setDate99(String Date99) {
        Date99 = Date99;
    }

    //getter method for NumberOfWins99
    public int getNumberOfWins99() {
        return (NumberOfWins99);
    }

    //setter method for NumberOfWins99
    public void setNumberOfWins99(int numberOfWins99) {
        NumberOfWins99 = numberOfWins99;
    }

    //getter method for NumberOfDraws99
    public int getNumberOfDraws99() {
        return (NumberOfDraws99);
    }

    //setter method for NumberOfDraws99
    public void setNumberOfDraws99(int numberOfDraws99) {
        NumberOfDraws99 = numberOfDraws99;
    }

    //getter method for NumberOfDefeats99
    public int getNumberOfDefeats99() {
        return (NumberOfDefeats99);
    }

    //setter method for NumberOfDefeats99
    public void setNumberOfDefeats99(int numberOfDefeats99) {
        NumberOfDefeats99 = numberOfDefeats99;
    }

    //getter method for NumberOfGoalsScored99
    public int getNumberOfGoalsScored99() {
        return (NumberOfGoalsScored99);
    }

    //setter method for NumberOfGoalsScored99
    public void setNumberOfGoalsScored99(int numberOfGoalsScored99) {
        NumberOfGoalsScored99 = numberOfGoalsScored99;
    }

    //getter method for NumberOfGoalsReceived99
    public int getNumberOfGoalsReceived99() {
        return NumberOfGoalsReceived99;
    }

    //setter method for NumberOfGoalsReceived99
    public void setNumberOfGoalsReceived99(int numberOfGoalsReceived99) {
        NumberOfGoalsReceived99 = numberOfGoalsReceived99;
    }

    //getter method for NumberOfPoints99
    public int getNumberOfPoints99() {
        return (NumberOfPoints99);
    }

    //setter method for NumberOfPoints99
    public void setNumberOfPoints99(int numberOfPoints99) {
        NumberOfPoints99 = numberOfPoints99;
    }

}
