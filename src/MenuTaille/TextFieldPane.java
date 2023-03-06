package MenuTaille;

import ColorTheme.MyColor;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class TextFieldPane extends HBox{

	public TextFieldPane()  {
		super(); 
		
		MyTextField hauteur = new MyTextField("Hauteur");
		MyTextField largeur= new MyTextField("Largeur");
		
		this.setStyle("-fx-background-color: #" + MyColor.MyCol.getThird() + ";");
		
		
		HBox.setMargin(hauteur, new Insets(50, 15, 50, 30));
		HBox.setMargin(largeur, new Insets(50, 30, 50, 15));
		
		
		
		
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(hauteur, largeur);
		
	}

}
