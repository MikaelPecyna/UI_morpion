package MenuTaille;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class MyTextField extends VBox {
	private String style; 

	public MyTextField(String text) {
		super();
		Label lab = new Label(text); 
		
		TextField tf = new TextField(); 
		
		this.style += "-fx-font-size: 20;";
		this.style += "-fx-font-weight: bold;"; 
		
		
		
		tf.setStyle("-fx-background-radius: 5; -fx-border-radius: 20;");
		
		lab.setStyle(this.style);
		
		
		this.setAlignment(Pos.CENTER);
		
		this.setMargin(lab, new Insets(0, 0, 10, 0));
		
		
		lab.setTextFill(Color.web("0x273469"));
		
		
		this.getChildren().addAll(lab, tf); 
		
		
	}

}
