package com.noah.Exercise32_03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlagRisingAnimation risingFlagAnimation = new FlagRisingAnimation();
		
		Runnable risingFlagTask = risingFlagAnimation;
		Thread risingFlagThread = new Thread(risingFlagTask);
		
		Pane pane = risingFlagAnimation.getPane();
		
		risingFlagThread.start();
		
		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("FlagRisingAnimation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}


}
