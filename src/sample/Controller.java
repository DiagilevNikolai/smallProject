package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Controller {
    @FXML
    TitledPane titledPane = new TitledPane();
    @FXML
    Button button = new Button();

    private boolean isClicked = true;

    private void searchFilesInDirectory(){
        VBox content = new VBox();
        titledPane.setExpanded(true);

        File dir = new File("C:\\Users\\compu\\IdeaProjects\\untitled2\\resourses");
        File[] listOfFiles = dir.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            Image image = new Image(i,listOfFiles[i].getName(), listOfFiles[i].getPath());

            Hyperlink hyperlink = new Hyperlink((image.getName()));
            hyperlink.setOnAction(event -> image.openFile());

            content.getChildren().addAll(hyperlink);
        }
        titledPane.setContent(content);
    }

    public void addToPane() {
        if (isClicked){
        searchFilesInDirectory();
        isClicked = false;
        } else {
        isClicked = true;
        }
    }

    public void buttonClick() throws IOException, URISyntaxException {
        Desktop.getDesktop().browse(new URL("https://start.spring.io/").toURI());
    }
}
