package loadPane;

import AceuilItem.MyButton;
import AceuilItem.TitlePane;
import MenuImage.ChoixImagePane;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MenuLoad extends VBox {

	public MenuLoad() {
		super(); 
		this.setAlignment(Pos.CENTER);
		TitlePane title = new TitlePane(); 
		
		
		this.setSpacing(50);
		
		
		MyButton start = new MyButton("Démarrer"); 
		
		
		
		ChoixPartiePane cpp = new ChoixPartiePane(); 
		
		
		this.setStyle("-fx-background-color: #30343F");
		this.getChildren().addAll(title, cpp, start);
	}

}
