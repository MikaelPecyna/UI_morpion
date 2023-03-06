package MenuImage;

import AceuilItem.MyButton;
import AceuilItem.TitlePane;
import MenuTaille.TextFieldPane;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MenuImage extends VBox {

	public MenuImage() {
		super(); 
		this.setAlignment(Pos.CENTER);
		TitlePane title = new TitlePane(); 
		
		
		this.setSpacing(50);
		
		
		MyButton start = new MyButton("Démarrer"); 
		
		
		
		ChoixImagePane cip = new ChoixImagePane(); 
		
		
		this.setStyle("-fx-background-color: #30343F");
		this.getChildren().addAll(title, cip, start);
	}

}
