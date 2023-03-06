package loadPane;

import ColorTheme.MyColor;
import MenuTaille.MyTextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class ChoixPartiePane extends HBox {

	public ChoixPartiePane() {
		super(); 
		
		MyTextField partie = new MyTextField("Choisir une partie");
		
		this.setStyle("-fx-background-color: #" + MyColor.MyCol.getThird() + ";");
		
		
		HBox.setMargin(partie, new Insets(50, 15, 50, 30));
		
		
		
		
		
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(partie);
	}

}
