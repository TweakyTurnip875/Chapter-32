package com.noah.Exercise32_03;

import java.io.File;

import javafx.animation.PathTransition; 
import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation implements Runnable {
	private Pane pane = new Pane();
	private ImageView imageView = new ImageView("us.gif");
		
	public FlagRisingAnimation() {
		pane.getChildren().add(imageView);
	}
	
	public Pane getPane() {
		return pane;
	}
	
	@Override
	public void run() {
		PathTransition pt = new PathTransition(Duration.millis(10000), new Line(100, 200, 100, 0), imageView); 
		pt.setCycleCount(5);
		pt.play();
	}
	

}