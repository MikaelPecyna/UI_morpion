package loadPane;

import MenuTaille.MyTextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class ChoixPartiePane extends HBox {

	public ChoixPartiePane() {
		super(); 
		
		MyTextField partie = new MyTextField("Choisir une partie");
		
		this.setStyle("-fx-background-color: #E4D9FF;");
		
		
		HBox.setMargin(partie, new Insets(50, 15, 50, 30));
		
		
		
		
		
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(partie);
	}

}
