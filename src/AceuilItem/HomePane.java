package AceuilItem;
import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class HomePane extends BorderPane{
	
	
	public HomePane(){
		super();
		
		
		
		TitlePane title = new TitlePane(); 
		ButtonPane btns = new ButtonPane(); 
		
		Platform.runLater(() -> {
			double height = this.getHeight(); 
			System.out.println(height);
			title.setPrefHeight(height/3);
			
			btns.setPrefHeight(2 * height/3);
			
		});
		
		
		this.setTop(title);
		this.setCenter(btns);
		
		
		
		
		
		
		
		this.setStyle("-fx-background-color: #000000; ");
	}
	
	

}
