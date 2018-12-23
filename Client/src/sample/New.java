package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class New extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("New.fxml"));
        primaryStage.setTitle("Collection System");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


        public static void main(String[] args) {
            launch(args);
        }
        @FXML
    private void preesNl(ActionEvent e) throws Exception {
            Parent home_page_parent = FXMLLoader.load(getClass().getResource("New.fxml"));
            Scene home_page_scene = new Scene(home_page_parent);
            Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(home_page_scene);
            app_stage.show();
        }
    }
