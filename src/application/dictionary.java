package src.application;

import com.google.gson.Gson;
import java.io.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import java.util.ArrayList;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException; 
import com.google.gson.stream.JsonReader;

public class dictionary extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		Gson gson = new Gson();
		
		
		
		
	}
}
