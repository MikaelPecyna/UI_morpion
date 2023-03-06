package MenuTaille;

import AceuilItem.ButtonPane;
import AceuilItem.MyButton;
import AceuilItem.TitlePane;
import ColorTheme.MyColor;
import javafx.application.Platform;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class TaillePane extends BorderPane {
	private String style; 
	
	public TaillePane() {
		super(); 
		
		
		
		TitlePane title = new TitlePane(); 
		VBox center = new VBox(); 
		
		center.setAlignment(Pos.CENTER);
		
		
		center.setSpacing(50);
		
		
		MyButton start = new MyButton("Démarrer"); 
		
		
		
		TextFieldPane tfp = new TextFieldPane(); 
		
		
		this.setStyle("-fx-background-color: #" + MyColor.MyCol.getThird() + ";"); ////////------
		center.getChildren().addAll(title, tfp, start);
		
		Platform.runLater(() -> {
			double height = this.getHeight(); 
			System.out.println(height);
			title.setPrefHeight(height/3);
			
			center.setPrefHeight(2 * height/3);
			
		});
		
		
		
		
		this.setTop(title);
		this.setCenter(center);
		
		
		
		
	}

}
