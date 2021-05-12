package com.company;

public class Comparator implements java.util.Comparator<FootballClub> {
    @Override
    public int compare(FootballClub userInput99_01, FootballClub userInput99_02) {
        if (userInput99_01.getNumberOfPoints99()>userInput99_02.getNumberOfPoints99())
            return -1;
        else
            if (userInput99_01.getNumberOfPoints99() < userInput99_02.getNumberOfPoints99())
                return 1;
            else{
                int goalDifferent99_01 = userInput99_01.getNumberOfGoalsScored99() - userInput99_01.getNumberOfGoalsReceived99();
                int goalDifferent99_02 = userInput99_02.getNumberOfGoalsScored99() - userInput99_02.getNumberOfGoalsReceived99();

                if(goalDifferent99_01 > goalDifferent99_02)
                    return -1;
                else
                    if(goalDifferent99_01 < goalDifferent99_02)
                        return 1;
                    else return 0;
            }
    }

}
