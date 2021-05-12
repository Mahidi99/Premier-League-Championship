package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class PremierLeagueManagerTest {

    @Test
    public void AddingAFootballClub99(){
        PremierLeagueManager addingTest = new PremierLeagueManager();
        FootballClub ClubOfFootball99 = new FootballClub("Gladiators","Galle",
                                                            "W1234", 12,
                                                             12,"2020-09-20",2,
                                                             2,34,11,
                                                              89);
        assertNotNull(ClubOfFootball99);

    }

    @Test
    public void deletingAFootballClub99() {
        PremierLeagueManager deletingTest = new PremierLeagueManager();
        boolean result = deletingTest.DeletingAFootballClub99("W1234");
        assertEquals("W1234", "W1234");
    }

    @Test
    public void printingAFootballClub99() {
        PremierLeagueManager printingTest = new PremierLeagueManager();
        boolean result = printingTest.PrintingAFootballClub99("W1234");
        assertEquals("W1234", "W1234");
    }

    @Test
    public void getComparator() {
    }

    @Test
    public void addingAPlayedMatch99() {
        PremierLeagueManager playedMatchTest = new PremierLeagueManager();
        boolean result = playedMatchTest.AddingAPlayedMatch99("Gladiators", "Sladiators", 67, 89);

    }

    @Test
    public void savingInAFile99() {
    }

    @Test
    public void GUI99() {
    }
}