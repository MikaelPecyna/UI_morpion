import AceuilItem.HomePane;
import ColorTheme.MyColor;
import MenuImage.MenuImage;
import MenuTaille.TaillePane;
import MenuTaille.TextFieldPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import loadPane.MenuLoad;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    
    public void start(Stage primaryStage) {
        
    	
    	
    	
    	
    	
        
 
        
    	
//    	HomePane root = new HomePane(); 
//    	TaillePane root = new TaillePane(); 
//    	MenuImage root = new MenuImage(); 
    	MenuLoad root = new MenuLoad(); 
        
    	
    	System.out.println(MyColor.MyCol.getMain());
    	System.out.println(MyColor.MyCol.getSecond());
    	System.out.println(MyColor.MyCol.getThird());
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }

	
}