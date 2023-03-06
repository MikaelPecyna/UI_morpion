package ColorTheme;

import java.util.HashMap;

public class MyColor {
	
	private HashMap<String, String> palette;
	
	private static HashMap<String, String> create = new HashMap(); 
	
	static {
		
	MyColor.create.put("main", "5B8FB9"); // Couleur background Title //LE PLUS CLAIR ICI 
	MyColor.create.put("second", "301E67"); // COuleur Texte Title 
	MyColor.create.put("font_color", "FAFAFF" );
	MyColor.create.put("third", "03001C"); // Couleur TextField    LE PLUS FONCé ICI 
	MyColor.create.put("buttonHover", "FAFAFF"); // Couleur TextField //
	}
	
	public static MyColor MyCol = new MyColor(create);
	

	public MyColor(HashMap<String, String> palette) {
		
		this.palette = palette;
	}
	
	public String getMain() {
		return this.palette.get("main");
	}
	
	public String getSecond() {
		return this.palette.get("second");
	}
	
	public String getThird() {
		return this.palette.get("third");
	}
	
	public String getButtonHover() {
		return this.palette.get("buttonHover");
	}
	
	public String getFontColor() {
		return this.palette.get("font_color");
	}

}
