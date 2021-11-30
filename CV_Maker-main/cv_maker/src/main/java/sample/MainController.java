package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Random;

//Add the functionality to save the text field on given data

public class MainController {

    @FXML
    public Button Gen;
    @FXML
    public Button PersonalInfo;
    @FXML
    public Button Education;
    @FXML
    public Button WorkExp;
    @FXML
    public Button Skills;
    @FXML
    public Button Project;
    @FXML
    public Button Achievement;

    @FXML
    public Button FileLocation;

    @FXML
    public AnchorPane anchor;

    @FXML
    private TextField fileloc;


    public void Personalinfo(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/PersonalInfof.fxml"));
        Stage stage = new Stage();
        stage.setTitle("PersonalInformation");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Education(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/Education.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Education");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Skill(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/Skill.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Skills");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void WorkExp(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/WorkExp.fxml"));
        Stage stage = new Stage();
        stage.setTitle("WorkExp");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Project(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/Project.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Projects");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Achievement(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("styles/Achievement.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Achievements");
        stage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "images/icon.png" )));
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void GenResume(ActionEvent event) throws IOException{

        GenerateResume.main(null);
        Stage stage = (Stage) Gen.getScene().getWindow();
        stage.close();
    }

    public void Browse(ActionEvent event) throws IOException{
        final DirectoryChooser dir = new DirectoryChooser();
        Stage stage = (Stage)anchor.getScene().getWindow();
        File file = dir.showDialog(stage);
        String x = file.getAbsolutePath();
        fileloc.setText(x);
        GenerateResume.destination = x;
    }
}
