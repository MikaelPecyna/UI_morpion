package MenuImage;

import AceuilItem.MyButton;
import AceuilItem.TitlePane;
import MenuTaille.MyTextField;
import MenuTaille.TextFieldPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ChoixImagePane extends HBox{

	public ChoixImagePane() {
		super(); 
		
		MyTextField hauteur = new MyTextField("Image");
		
		this.setStyle("-fx-background-color: #E4D9FF;");
		
		
		HBox.setMargin(hauteur, new Insets(50, 15, 50, 30));
		
		
		
		
		
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(hauteur);
		
	}

}
