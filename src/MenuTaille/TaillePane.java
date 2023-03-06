package MenuTaille;

import AceuilItem.MyButton;
import AceuilItem.TitlePane;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class TaillePane extends VBox {
	private String style; 
	
	public TaillePane() {
		super(); 
		this.setAlignment(Pos.CENTER);
		TitlePane title = new TitlePane(); 
		
		
		this.setSpacing(50);
		
		
		MyButton start = new MyButton("Démarrer"); 
		
		
		
		TextFieldPane tfp = new TextFieldPane(); 
		
		
		this.setStyle("-fx-background-color: #30343F");
		this.getChildren().addAll(title, tfp, start);
		
		
	}

}
