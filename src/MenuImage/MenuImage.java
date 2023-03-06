package MenuImage;

import AceuilItem.MyButton;
import AceuilItem.TitlePane;
import ColorTheme.MyColor;
import MenuTaille.TextFieldPane;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MenuImage extends BorderPane {

	public MenuImage() {
		super(); 
		
		
		
		TitlePane title = new TitlePane(); 
		VBox center = new VBox(); 
		
		center.setAlignment(Pos.CENTER);
		
		
		center.setSpacing(50);
		
		
		MyButton start = new MyButton("Démarrer"); 
		
		
		
		ChoixImagePane cip = new ChoixImagePane(); 
		
		
		this.setStyle("-fx-background-color: #" + MyColor.MyCol.getThird() + ";"); /////// --------
		center.getChildren().addAll(title, cip, start);
		
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
