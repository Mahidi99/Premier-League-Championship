package com.company;

import java.time.Month;
import java.time.Year;
import java.util.Date;

public class DateClass implements Comparable<DateClass> {

    //Date of the match
    private Date date99;
    //Month of the match
    private Month month99;
    //Year of the match
    private Year year99;

    //getter method for Date99
    public Date getDate99() {
        return date99;
    }

    //setter method for Date99
    public void setDate99(Date date99) {
        this.date99 = date99;
    }

    //getter method for Month99
    public Month getMonth99() {
        return month99;
    }

    //setter method for Month99
    public void setMonth99(Month month99) {
        this.month99 = month99;
    }

    //getter method for Year99
    public Year getYear99() {
        return year99;
    }

    //setter method for Year99
    public void setYear99(Year year99) {
        this.year99 = year99;
    }

    //Constructor to initialize Date99, Month99 and Year99
    public DateClass(Date date99, Month month99, Year year99){
        super();
        this.date99 = date99;
        this.month99 = month99;
        this.year99 = year99;
    }

    @Override
    public int compareTo(DateClass o) {
        return 0;
    }
}
