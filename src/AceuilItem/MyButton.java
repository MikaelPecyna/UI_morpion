package AceuilItem;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class MyButton extends Button {

	private String style = ""; 
	
	public MyButton(String text) {
		super(text); 
		
		this.style += "-fx-background-color: #E4D9FF;"; 
		this.style += "-fx-font-size: 20;";
		this.style += "-fx-font-weight: bold;";
		this.style += "-fx-background-radius: 20;"; 
		this.style += "-fx-border-radius: 20;"; 
		
		
		this.setStyle(this.style);
		
		this.setTextFill(Color.web("0x30343F"));
		
		
		this.setOnMouseEntered(e->{
			this.setCursor(Cursor.HAND);
			this.style += "-fx-background-color: #f6f2ff;"; 			
			this.setStyle(this.style);
		});
		
		this.setOnMouseExited(e->{
			this.style += "-fx-background-color: #E4D9FF;"; 
			
			this.setStyle(this.style);
		});
		
		
	}

}
