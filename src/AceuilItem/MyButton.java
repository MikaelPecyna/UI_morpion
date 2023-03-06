package AceuilItem;
import ColorTheme.MyColor;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class MyButton extends Button {

	private String style = ""; 
	
	public MyButton(String text) {
		super(text); 
		
		this.style += "-fx-background-color: #" + MyColor.MyCol.getMain() + ";"; 
		this.style += "-fx-font-size: 20;";
		this.style += "-fx-font-weight: bold;";
		this.style += "-fx-background-radius: 20;"; 
		this.style += "-fx-border-radius: 20;"; 
		
		
		this.setStyle(this.style);
		
		this.setTextFill(Color.web("0x" + MyColor.MyCol.getSecond()));
		
		
		this.setOnMouseEntered(e->{
			this.setCursor(Cursor.HAND);
			this.style += "-fx-background-color: #" + MyColor.MyCol.getButtonHover() + ";"; 			
			this.setStyle(this.style);
		});
		
		this.setOnMouseExited(e->{
			this.style += "-fx-background-color: #" + MyColor.MyCol.getMain() + ";"; 
			
			this.setStyle(this.style);
		});
		
		
	}

}
