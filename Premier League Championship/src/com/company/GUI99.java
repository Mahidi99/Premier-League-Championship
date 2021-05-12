package com.company;

import com.sun.org.apache.xpath.internal.operations.String;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.List;

import static com.company.PremierLeagueManager.ClubOfFootballClubList;

public class GUI99 extends Application {
    private final static PremierLeagueManager managerOfPremierLeague = new PremierLeagueManager();
    Stage window99;
    Scene scene_HomePage99,Scene_TablePage99;


    List<FootballClub> memberList = ClubOfFootballClubList;


    @Override
    public void start(Stage primaryStage99) {
        ///////////////////////////////////////////////////////Home Page////////////////////////////////////////////////

        window99 = primaryStage99;
        window99.setTitle("Premier League Championship");

            // to create a grid pane to first page
        GridPane grid_HomePg99 = new GridPane();
        grid_HomePg99.setHgap(20);
        grid_HomePg99.setVgap(20);
        grid_HomePg99.setAlignment(Pos.TOP_CENTER);

            //setting padding for grid pane of home page
        grid_HomePg99.setPadding(new Insets(0, 1, 5, 1));

        //adding background image
        Image GUI_Wallpaper99 = new Image(getClass().getResourceAsStream("HomePage99.jpg"));

        BackgroundImage GUI__Theme99 = new BackgroundImage(GUI_Wallpaper99,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);

        //create the Background
        Background GUI_Background99 = new Background(GUI__Theme99);
        grid_HomePg99.setBackground(GUI_Background99);

        Image LogoText99 = new Image(getClass().getResourceAsStream("FootBallLogo99.png"));
        Label LogoText_Label99 = new Label("", new ImageView(LogoText99));
        grid_HomePg99.add(LogoText_Label99, 0, 5);

        //creating a HBox
        HBox hbGoButton = new HBox();

        Image ImageGo99 = new Image(getClass().getResourceAsStream("go99.png"));
        Button Go = new Button("", new ImageView(ImageGo99));

        hbGoButton.getChildren().addAll(Go);
        grid_HomePg99.add(hbGoButton,2,5,2,1);
        Go.setOnAction(event -> window99.setScene(Scene_TablePage99));


        scene_HomePage99 = new Scene(grid_HomePg99, 1400, 700);    //Set Scene

        ///////////////////////////////////////////////////Table Page///////////////////////////////////////////////////

            // to create a grid pane to Table page
        GridPane grid_TablePg99 = new GridPane();
        grid_TablePg99.setAlignment(Pos.TOP_CENTER);
        grid_TablePg99.setHgap(20);
        grid_TablePg99.setVgap(20);

            //setting padding for grid pane of Table page
        grid_TablePg99.setPadding(new Insets(0, 1, 5, 1));

                //Background Image
        GUI_Wallpaper99 = new Image(getClass().getResourceAsStream("HomePage99.jpg"));

        GUI__Theme99 = new BackgroundImage(GUI_Wallpaper99,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);

            // creating Background
        GUI_Background99 = new Background(GUI__Theme99);
        grid_TablePg99.setBackground(GUI_Background99);



        //////////////////////// Creating Table /////////////////////////

        //creating a table view from the list; "ListOfClubs99"
        TableView<FootballClub> TableList99 = new TableView<FootballClub>();
        ObservableList<FootballClub> ListOfClubs99;{
            ListOfClubs99 = FXCollections.observableArrayList(ClubOfFootballClubList);
        }

            //1st column for club name
        TableColumn column_name99 = new TableColumn("Club Name");
        column_name99.setMinWidth(150);
        column_name99.setCellValueFactory(new PropertyValueFactory<SportsClub, String>("NameOfTheClub99"));

            //2nd column for location
        TableColumn column_location99 = new TableColumn<>("Location");
        column_location99.setMinWidth(120);
        column_location99.setCellValueFactory(new PropertyValueFactory<SportsClub, String>("LocationOfClub99"));

            //3rd column for register number
        TableColumn column_registerNo99 = new TableColumn<>("Register No");
        column_registerNo99.setMinWidth(100);
        column_registerNo99.setCellValueFactory(new PropertyValueFactory<SportsClub, String>("RegisterNoOfClub99"));

            //4th column for played matches
        TableColumn column_matchesPlayed99 = new TableColumn("Played matches");
        column_matchesPlayed99.setMinWidth(120);
        column_matchesPlayed99.setCellValueFactory(new PropertyValueFactory<SportsClub, String>("NumberOfMatchesPlayed99"));

            //5th column for date
        TableColumn column_Date99 = new TableColumn<>("Date");
        column_Date99.setMinWidth(150);
        column_Date99.setCellValueFactory(new PropertyValueFactory<SportsClub, String>("Date99"));

            //6th column for number of wins
        TableColumn column_wins99 = new TableColumn<>("Wins");
        column_wins99.setMinWidth(90);
        column_wins99.setCellValueFactory(new PropertyValueFactory<SportsClub, String>("NumberOfWins99"));

            //7th column for number of draws
        TableColumn column_draws99 = new TableColumn<>("Draws");
        column_draws99.setMinWidth(90);
        column_draws99.setCellValueFactory(new PropertyValueFactory<SportsClub, String>("NumberOfDraws99"));

            //8th column for number of defeats
        TableColumn column_defeats99 = new TableColumn<>("Defeats");
        column_defeats99.setMinWidth(90);
        column_defeats99.setCellValueFactory(new PropertyValueFactory<SportsClub, String>("NumberOfDefeats99"));

            //9th column for goals scored
        TableColumn column_goalsScored99 = new TableColumn<>("Scored Goals");
        column_goalsScored99.setMinWidth(90);
        column_goalsScored99.setCellValueFactory(new PropertyValueFactory<SportsClub, String>("NumberOfGoalsScored99"));

            //10th column for goals received
        TableColumn column_goalsReceived99 = new TableColumn<>("Received Goals");
        column_goalsReceived99.setMinWidth(90);
        column_goalsReceived99.setCellValueFactory(new PropertyValueFactory<SportsClub, String>("NumberOfGoalsReceived99"));

            //11th column for number of points
        TableColumn column_points99 = new TableColumn<>("Points");
        column_points99.setMinWidth(90);
        column_points99.setCellValueFactory(new PropertyValueFactory<SportsClub, String>("NumberOfPoints99"));

        //creating a Filtered List
        FilteredList<FootballClub> filteredList99 = new FilteredList(ListOfClubs99, f -> true);
        TableList99.setItems(filteredList99);
        TableList99.getColumns().addAll(column_name99,column_location99,column_registerNo99,column_matchesPlayed99,column_Date99,column_wins99,column_draws99,column_defeats99,column_goalsScored99,column_goalsReceived99,column_points99);



        //creating a new choiceBox to select three parameters for searching the premier league table
        ChoiceBox<java.lang.String> ChoiceBoxToSearch99 = new ChoiceBox();
        //adding three choices into Choice Box
        ChoiceBoxToSearch99.getItems().addAll("Club Name", "Register No", "Date");
        //setting  Date as the default value for choice box
        ChoiceBoxToSearch99.setValue("Date");

        //creating a new textfield
        TextField TypingTextField99 = new TextField();
        TypingTextField99.setPromptText("Type here!");

        //Switching the values for the choiceBox
        TypingTextField99.setOnKeyReleased(keyEvent -> {
            switch (ChoiceBoxToSearch99.getValue())
            {
                //When the user select "Name"
                case "Club Name":
                    filteredList99.setPredicate(f -> f.getNameOfTheClub99().toLowerCase().contains(TypingTextField99.getText().toLowerCase().trim()));
                    break;
                //When the user select "Register No"
                case "Register No":
                    filteredList99.setPredicate(f -> f.getRegisterNoOfClub99().toLowerCase().contains(TypingTextField99.getText().toLowerCase().trim()));
                    break;
                //When the user select "Date"
                case "Date":
                    filteredList99.setPredicate(f -> f.getDate99().toLowerCase().contains(TypingTextField99.getText().toLowerCase().trim()));
                    break;
            }
        });

        //resetting the table and typing text field when the user selects a new choice
        ChoiceBoxToSearch99.getSelectionModel().selectedItemProperty().addListener((observableValue,Old__Value,New__Value) ->
        {
            if (New__Value != null)
            {
                TypingTextField99.setText("");
                filteredList99.setPredicate(null);
            }
        });

        //adding the table to the grid pane
        grid_TablePg99.getChildren().addAll(TableList99);

        ///////////////////Adding buttons//////////////////////

        //Creating a HBox to add buttons
        HBox guiButtons99 = new HBox();
        //Setting the space of all the buttons of HBox
        guiButtons99.setSpacing(20.0);

        Image ImageBack99 = new Image(getClass().getResourceAsStream("Back99.png"));

        //Creating a button to go back to the home page
        Button backButton99 = new Button("", new ImageView(ImageBack99));

        //when the user clicks the "BackButton99" button
        backButton99.setOnAction(event -> window99.setScene(scene_HomePage99));

        //Creating a button to sort the table by Goals (Descending order)
        Button btn_SortByGoals99 = new Button(" Sorting-Goals ");
        //Setting the font size of "btn_SortByGoals99" button
        btn_SortByGoals99.setFont(Font.font(20));

        //When the user clicks the button
        btn_SortByGoals99.setOnAction(event ->
                {
                    //to sort the table by scored goals
                    Collections.sort(
                            ListOfClubs99,
                            (userInput_1, userInput_2) -> (userInput_1.getNumberOfGoalsScored99() - userInput_2.getNumberOfGoalsScored99())
                    );

                    //To Sort in Descending Order
                    Collections.reverse(ListOfClubs99);

                }
        );

        //Creating a button to sort the table by Number of Wins (Descending order)
        Button btn_SortByNumberOfWins99 = new Button(" Sorting-No Of Wins ");
        //Setting the font size of "btn_SortByNumberOfWins99" button
        btn_SortByNumberOfWins99.setFont(Font.font(20));

        //When the user clicks the button
        btn_SortByNumberOfWins99.setOnAction(event ->
                {
                    //Sorting the table by Number of Wins
                    Collections.sort(
                            ListOfClubs99,
                            (userInput_1, userInput_2) -> (userInput_1.getNumberOfWins99() - userInput_2.getNumberOfWins99())
                    );

                    //To Sort in Descending Order
                    Collections.reverse(ListOfClubs99);

                }
        );

        //To create a HBox and add a ChoiceBox and Text Field into it
        HBox Box = new HBox(ChoiceBoxToSearch99, TypingTextField99);
        Box.setMaxSize(500, 100);
        ChoiceBoxToSearch99.setMaxHeight(44);

        TypingTextField99.setFont(Font.font(20));

        //Creating a button to add random played matches
        Button btn_AddingRandomMatches99 = new Button(" Random Matches ");
        //Setting the font size of "btn_AddingRandomMatches99" button
        btn_AddingRandomMatches99.setFont(Font.font(20));

        //when the user clicks the button "Random Matches"
        btn_AddingRandomMatches99.setOnAction(event ->
                {
                    for (int i = 0; i < 1; i++) {

                        //creating a new HBox for labels to display randomly generated clubs ans goals
                        HBox randomLabels = new HBox();
                        //Setting the space of the label
                        randomLabels.setSpacing(20.0);

                        for (SportsClub ClubOfFootball99 : ClubOfFootballClubList) {
                            java.lang.String[] names1 = {ClubOfFootball99.getNameOfTheClub99()};
                            int index1 = (int) (Math.random() * names1.length);

                            // Remove selected element from original list
                            ClubOfFootballClubList.remove(index1);

                            // Obtaining a number between 0 and 49 for goals
                            int goals1 = (int)(Math.random() * 50 + 1);

                            //create a label to print auto generated first club and goals of it
                            Label labelName1 = new Label("Club 01 Name : " + names1[index1]
                                    +"\t\t|     Goals of Club 01 : " + goals1);
                            //setting the font size of label
                            labelName1.setFont(Font.font(20));
                            //setting the color for label
                            labelName1.setStyle("-fx-background-color : WHITE;");

                            //adding the 'labelName1' into HBox
                            randomLabels.getChildren().addAll(labelName1);
                            //updating new values
                            if (ClubOfFootball99.getNameOfTheClub99().equals(names1[index1])) {
                                ((FootballClub) ClubOfFootball99).setNumberOfGoalsScored99(((FootballClub) ClubOfFootball99).getNumberOfGoalsScored99()+goals1);
                            }
                            break;
                        }
                        for (SportsClub ClubOfFootball99 : ClubOfFootballClubList) {
                            java.lang.String[] names2 = {ClubOfFootball99.getNameOfTheClub99()};
                            int index2 = (int) (Math.random() * names2.length);


                            // Obtaining a number between 0 and 49 for goals
                            int goals2 = (int)(Math.random() * 50 + 1);

                            //create a label to print auto generated second club and goals of it
                            Label labelName2 = new Label("      Club 02 Name : " + names2[index2]
                                    + "\t\t|      Goals of Club 02 : " + goals2);
                            //setting the font size of label
                            labelName2.setFont(Font.font(20));
                            //setting the color of label
                            labelName2.setStyle("-fx-background-color : WHITE;");

                            //adding the 'labelName1' into HBox
                            randomLabels.getChildren().addAll(labelName2);

                            //adding the labels into grid pane
                            grid_TablePg99.add(randomLabels, 0, 3, 2, 1);

                            //updating new values
                            if (ClubOfFootball99.getNameOfTheClub99().equals(names2[index2])) {
                                ((FootballClub) ClubOfFootball99).setNumberOfGoalsScored99(((FootballClub) ClubOfFootball99).getNumberOfGoalsScored99()+goals2);
                            }

                            break;
                        }
                    }
                });


        //Creating a button to sort the table by Date (Ascending order)
        Button btn_SortByDate99 = new Button(" Sorting-Date ");
        //Setting the font size of "btn_SortByDate99" button
        btn_SortByDate99.setFont(Font.font(20));

        //When the user clicks the button
        btn_SortByDate99.setOnAction(event ->
        {
            //Sorting the table by date (Ascending order)
                Collections.sort(
                        ListOfClubs99,
                        (userInput_1, userInput_2) -> (userInput_1.getDate99().compareTo(userInput_2.getDate99()))
                );

        });

        //Adding all the buttons in Grid pane
        guiButtons99.getChildren().addAll(backButton99, Box, btn_SortByGoals99, btn_SortByNumberOfWins99, btn_AddingRandomMatches99, btn_SortByDate99);
        grid_TablePg99.add(guiButtons99, 0,2,2,1);


        Scene_TablePage99 = new Scene(grid_TablePg99, 1400, 700);

        ///////////////////////////////////////
        window99.setScene(scene_HomePage99);
        window99.show();
        /////////////////////////////////////

    }

    public static void main(String[] args) {
        launch(args);
    }
    //
    private static void launch(String[] args) {
    }

}
