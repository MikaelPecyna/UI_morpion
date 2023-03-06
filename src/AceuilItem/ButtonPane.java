package AceuilItem;
import ColorTheme.MyColor;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class ButtonPane extends VBox {

	public ButtonPane() {
		super();
		MyButton fromSize = new MyButton("Jouer à partir d'une taille"); 
		MyButton fromImage = new MyButton("Jouer à partir d'une image"); 
		MyButton loadPartie = new MyButton("Charger une partie"); 
		
		this.setAlignment(Pos.CENTER);
		
		VBox.setMargin(fromSize, new Insets(50, 0, 15 , 0));
		VBox.setMargin(fromImage, new Insets(15 , 0, 15, 0));
		VBox.setMargin(loadPartie, new Insets(15, 0, 50, 0));
		
		this.setStyle("-fx-background-color: #" + MyColor.MyCol.getThird() + ";" );
		this.getChildren().addAll(fromSize, fromImage, loadPartie);
		
		
		
	}

}
