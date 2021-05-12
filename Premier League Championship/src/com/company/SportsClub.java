package com.company;

import java.util.Objects;

public class SportsClub {
        //private NameOfTheClub99
    private String NameOfTheClub99;
        //private LocationOfClub99
    private String LocationOfClub99;
        //private RegisterNoOfClub99
    private String RegisterNoOfClub99;

        //Constructor to initialize NameOfTheClub99, LocationOfClub99, RegisterNoOfClub99, TypeOfSport99
    public SportsClub (String NameOfTheClub99, String LocationOfClub99, String RegisterNoOfClub99){
        super();
        //statistics of super class; "SportsClub"
        this.NameOfTheClub99 = NameOfTheClub99;
        this.LocationOfClub99 = LocationOfClub99;
        this.RegisterNoOfClub99 = RegisterNoOfClub99;
    }

        //getter method for NameOfTheClub99
    public String getNameOfTheClub99() {
        return NameOfTheClub99;
    }

        //setter method for NameOfTheClub99
    public void setNameOfTheClub99(String nameOfTheClub99) {
        NameOfTheClub99 = nameOfTheClub99;
    }

        //getter method for LocationOfClub99
    public String getLocationOfClub99() {
        return LocationOfClub99;
    }

        //setter method for LocationOfClub99
    public void setLocationOfClub99(String locationOfClub99) {
        LocationOfClub99 = locationOfClub99;
    }

        //getter method for RegisterNoOfClub99
    public String getRegisterNoOfClub99() {
        return RegisterNoOfClub99;
    }

     //setter method for RegisterNoOfClub99
    public void setRegisterNoOfClub99(String registerNoOfClub99) {
        RegisterNoOfClub99 = registerNoOfClub99;
    }

    @Override
    public boolean equals(Object object99) {
        if (this == object99) return true;
        if (object99 == null || getClass() != object99.getClass()) return false;
        SportsClub that = (SportsClub) object99;
        return Objects.equals(NameOfTheClub99, that.NameOfTheClub99) &&
                Objects.equals(LocationOfClub99, that.LocationOfClub99) &&
                Objects.equals(RegisterNoOfClub99, that.RegisterNoOfClub99);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NameOfTheClub99, LocationOfClub99, RegisterNoOfClub99);
    }

}
