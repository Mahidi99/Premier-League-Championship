package com.company;

public class UniversityFootballClub {
        //private NameOfTheUni99
    private String NameOfTheUni99;
        //private UniversityId99
    private String UniversityId99;

        //Constructor to initialize NameOfTheUni99, UniversityId99
    public UniversityFootballClub (String NameOfTheUni99, String UniversityId99){
        this.NameOfTheUni99 = NameOfTheUni99;
        this.UniversityId99 = UniversityId99;
    }

        //getter method for NameOfTheUni99
    public String getNameOfTheUni99() {
        return NameOfTheUni99;
    }

        //setter method for NameOfTheUni99
    public void setNameOfTheUni99(String nameOfTheUni99) {
        NameOfTheUni99 = nameOfTheUni99;
    }

        //getter method for UniversityId99
    public String getUniversityId99() {
        return UniversityId99;
    }

        //setter method for UniversityId99
    public void setUniversityId99(String universityId99) {
        UniversityId99 = universityId99;
    }

}
