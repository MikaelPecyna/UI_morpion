package AceuilItem;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class TitlePane extends HBox {
	
	private String style = ""; 

	public TitlePane() {
		super(); 
		
		this.style += "-fx-background-color: #E4D9FF;";
		this.style += "-fx-font-size: 50;";
		
//		this.style += "-fx-font-family: 'Montserrat', sans-serif;"	;  // TODO : Changer Font Family
		System.out.println(style);
		
		
		this.setStyle(style);
		
		
		Label title = new Label("GOMOKU"); 
		title.setTextFill(Color.web("0x273469"));
		title.setStyle("-fx-font-weight: bold;");
		
		
		this.setAlignment(Pos.CENTER);
		
		
		
		this.setLayoutX(0);
		this.setLayoutY(0);
		this.getChildren().add(title);
	}
	

}
