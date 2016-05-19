package p;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DataFormat;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class matrix_design extends Application{

	
	GridPane pane;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,dot,clear,clearAll,add,sub,mul,div,equal,sign,percent,
	bracketL,bracketR,SbracketL,SbracketR,mat_det,mat_mul,mat_div,mat_t,semicolon,coma;
	TextArea screen;
	Clipboard systemClipboard;
	ClipboardContent content; 
	 
	boolean result=false;

	
	@Override
	public void start(Stage stage) throws Exception {
		
		
		
		createButtons();
		addButtons();
		binding();
		styling();
		handle();
		//stage.setFullScreen(true);
		standard_design.scene.setRoot(standard_design.mainPane);
								
}

void createButtons()
	{
	
	
		screen = new TextArea();
		
		SbracketL = new Button("[");
		SbracketR = new Button("]");
		semicolon = new Button(";");
		mat_mul = new Button(".*");
		 mat_div = new Button("./");
		 mat_t = new Button(".'");
		 mat_det = new Button("det");
		 b5 = new Button("5");
		 b0 = new Button("0");
		 b1 = new Button("1");
		 b2 = new Button("2");
		 b3 = new Button("3");
		 b4 = new Button("4");
		 b5 = new Button("5");
		 b6 = new Button("6");
		 b7 = new Button("7");			
		 b8 = new Button("8");
		 b9 = new Button("9");
		 dot = new Button(".");
		 clear = new Button("DEL");
		 clearAll = new Button("C");
		 add = new Button("+");
		 sub = new Button("-");
		 mul = new Button("X");
		 div = new Button("/");
		 equal = new Button("=");
		 percent = new Button("%");
		 sign = new Button("+/-");
		 coma =new Button(",");
		 bracketR =new Button(",");
		 bracketL =new Button(",");
		 systemClipboard = Clipboard.getSystemClipboard();
		 content = new ClipboardContent();
	
	}
void addButtons()
{
	
	pane = new GridPane();
	// First Row
	       pane.add(SbracketL, 0, 0);
	       pane.add(clearAll, 1, 0);
	       pane.add(coma, 2, 0);
	       pane.add(semicolon, 3, 0);
	       pane.add(sign, 4, 0);
	// Second Row
	       pane.add(SbracketR, 0, 1);
	       pane.add(clear, 1, 1);
	       pane.add(div, 2, 1);
	       pane.add(mul, 3, 1);
	       pane.add(percent, 4, 1);
	// Third Row
	       pane.add(mat_det, 0, 2);
	       pane.add(b7, 1, 2);
	       pane.add(b8, 2, 2);
	       pane.add(b9, 3, 2);
	       pane.add(sub, 4, 2);
	// Fourth Row
	       pane.add(mat_mul, 0, 3);
			pane.add(b4, 1, 3);
			pane.add(b5, 2, 3);
			pane.add(b6, 3, 3);
			pane.add(add, 4, 3);
	// Fifth Row
			pane.add(mat_div, 0, 4);
			pane.add(b1, 1, 4 );
			pane.add(b2, 2, 4);
			pane.add(b3, 3, 4);
			pane.add(equal, 4, 4, 1, 2);
	// Sixth Row
			pane.add(mat_t, 0, 5);
			pane.add(b0, 1, 5,2,1);
			pane.add(dot, 3, 5);
	
			standard_design.mainPane.setBottom(pane);
			standard_design.mainPane.setCenter(screen);
			
			screen.setEditable(false);
}
void binding()
{
	 pane.prefWidthProperty().bind(standard_design.mainPane.widthProperty().divide(0.8));
	 pane.prefHeightProperty().bind(standard_design.mainPane.heightProperty().divide(1.3));
	 screen.prefWidthProperty().bind(standard_design.mainPane.widthProperty());
	 screen.prefHeightProperty().bind(standard_design.mainPane.heightProperty().divide(5));       

	 coma.prefHeightProperty().bind(pane.heightProperty());
	 SbracketL.prefHeightProperty().bind(pane.heightProperty());
	 SbracketR.prefHeightProperty().bind(pane.heightProperty());
	 semicolon.prefHeightProperty().bind(pane.heightProperty());
			mat_det.prefHeightProperty().bind(pane.heightProperty());
			mat_mul.prefHeightProperty().bind(pane.heightProperty());
			mat_div.prefHeightProperty().bind(pane.heightProperty());
			mat_t.prefHeightProperty().bind(pane.heightProperty());
					b0.prefHeightProperty().bind(pane.heightProperty());
					b1.prefHeightProperty().bind(pane.heightProperty());
					b2.prefHeightProperty().bind(pane.heightProperty());
					b3.prefHeightProperty().bind(pane.heightProperty());
					b4.prefHeightProperty().bind(pane.heightProperty());
					b5.prefHeightProperty().bind(pane.heightProperty());
					b6.prefHeightProperty().bind(pane.heightProperty());
					b7.prefHeightProperty().bind(pane.heightProperty());
					b8.prefHeightProperty().bind(pane.heightProperty());
					b9.prefHeightProperty().bind(pane.heightProperty());
					add.prefHeightProperty().bind(pane.heightProperty());
					sub.prefHeightProperty().bind(pane.heightProperty());
					mul.prefHeightProperty().bind(pane.heightProperty());
					div.prefHeightProperty().bind(pane.heightProperty());
					equal.prefHeightProperty().bind(pane.heightProperty());
					dot.prefHeightProperty().bind(pane.heightProperty());
					clear.prefHeightProperty().bind(pane.heightProperty());
					clearAll.prefHeightProperty().bind(pane.heightProperty());
					percent.prefHeightProperty().bind(pane.heightProperty());
					sign.prefHeightProperty().bind(pane.heightProperty());
					bracketL.prefHeightProperty().bind(pane.heightProperty());
					bracketR.prefHeightProperty().bind(pane.heightProperty());
					
					coma.prefWidthProperty().bind(pane.widthProperty());
					SbracketL.prefWidthProperty().bind(pane.widthProperty());
					SbracketR.prefWidthProperty().bind(pane.widthProperty());
					semicolon.prefWidthProperty().bind(pane.widthProperty());
					mat_det.prefWidthProperty().bind(pane.widthProperty());
					mat_mul.prefWidthProperty().bind(pane.widthProperty());
					mat_div.prefWidthProperty().bind(pane.widthProperty());
					mat_t.prefWidthProperty().bind(pane.widthProperty());
					    b0.prefWidthProperty().bind(pane.widthProperty());
						b1.prefWidthProperty().bind(pane.widthProperty());
						b2.prefWidthProperty().bind(pane.widthProperty());
						b3.prefWidthProperty().bind(pane.widthProperty());
						b4.prefWidthProperty().bind(pane.widthProperty());
						b5.prefWidthProperty().bind(pane.widthProperty());
						b6.prefWidthProperty().bind(pane.widthProperty());
						b7.prefWidthProperty().bind(pane.widthProperty());
						b8.prefWidthProperty().bind(pane.widthProperty());
						b9.prefWidthProperty().bind(pane.widthProperty());
						add.prefWidthProperty().bind(pane.widthProperty());
						sub.prefWidthProperty().bind(pane.widthProperty());
						mul.prefWidthProperty().bind(pane.widthProperty());
						div.prefWidthProperty().bind(pane.widthProperty());
						equal.prefWidthProperty().bind(pane.widthProperty());
						dot.prefWidthProperty().bind(pane.widthProperty());
						clear.prefWidthProperty().bind(pane.widthProperty());
						clearAll.prefWidthProperty().bind(pane.widthProperty());
						percent.prefWidthProperty().bind(pane.widthProperty());
						sign.prefWidthProperty().bind(pane.widthProperty());
						bracketL.prefWidthProperty().bind(pane.widthProperty());
						bracketR.prefWidthProperty().bind(pane.widthProperty());
										
}
void styling()
{
	coma.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
	semicolon.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
	SbracketR.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
	SbracketL.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
	mat_det.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
	mat_mul.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
	mat_div.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
	mat_t.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
	
		b0.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;  ");
		b1.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		b2.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		b3.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		b4.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		b5.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		b6.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		b7.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		b8.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		b9.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		clear.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		clearAll.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		sign.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		percent.setStyle("-fx-base: black; -fx-text-fill: #3d5b99;  -fx-background-radius: 5;");
		dot.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		bracketL.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		bracketR.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		add.setStyle("-fx-base: black; -fx-text-fill: #3d5b99;  -fx-background-radius: 5;");
		sub.setStyle("-fx-base: black; -fx-text-fill: #3d5b99;  -fx-background-radius: 5;");
		mul.setStyle("-fx-base: black; -fx-text-fill: #3d5b99;  -fx-background-radius: 5;");
		div.setStyle("-fx-base: black; -fx-text-fill: #3d5b99;  -fx-background-radius: 5;");
		equal.setStyle("-fx-base: #3d5b99;  -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		
		pane.setStyle("-fx-background-color: #3d5b99");
//		mainPane.setStyle("-fx-background-color: #ccffcc");
		screen.setStyle("-fx-background-color: white");
		
		coma.setFont(new Font("elephant", 15));
		SbracketL.setFont(new Font("elephant", 15));
		SbracketR.setFont(new Font("elephant", 15));
		semicolon.setFont(new Font("elephant", 15));
		mat_det.setFont(new Font("elephant", 15));
		mat_mul.setFont(new Font("elephant", 15));
		mat_div.setFont(new Font("elephant", 15));
		mat_t.setFont(new Font("elephant", 15));
		
		b0.setFont(new Font("elephant", 15));
		b1.setFont(new Font("elephant", 15));
		b2.setFont(new Font("elephant", 15));
		b3.setFont(new Font("elephant", 15));
		b4.setFont(new Font("elephant", 15));
		b5.setFont(new Font("elephant", 15));
		b6.setFont(new Font("elephant", 15));
		b7.setFont(new Font("elephant", 15));
		b8.setFont(new Font("elephant", 15));
		b9.setFont(new Font("elephant", 15));
		clear.setFont(new Font("elephant", 12));
		clearAll.setFont(new Font("elephant", 12));
		sign.setFont(new Font("elephant", 12));
		percent.setFont(new Font("elephant", 12));
		dot.setFont(new Font("elephant", 12));
		bracketL.setFont(new Font("elephant", 12));
		bracketR.setFont(new Font("elephant", 12));
		add.setFont(new Font("elephant", 12));
		sub.setFont(new Font("elephant", 12));
		mul.setFont(new Font("elephant", 12));
		div.setFont(new Font("elephant", 12));
		equal.setFont(new Font("elephant", 12));
		
		
		screen.setStyle("-fx-base: white; -fx-text-fill: black; ");
		screen.setFont(new Font("elephant", 20));
		
	}
void handle()
{
	
	scientific_events o=new scientific_events();
	
	
		b0.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '0')); result=false;});
		b1.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '1')); result=false;});
		b2.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '2')); result=false;});
		b3.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '3')); result=false;});
		b4.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '4')); result=false;});
		b5.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '5')); result=false;});
		b6.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '6')); result=false;});
		b7.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '7')); result=false;});
		b8.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '8')); result=false;});
		b9.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '9')); result=false;});
		dot.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '.')); result=false;});
		add.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '+')); result=false;});
		sub.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '-')); result=false;});
		mul.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '*')); result=false;});
		div.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '/')); result=false;});
		percent.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '%')); result=false;});
		equal.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '=')); result=true; });
		clearAll.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), 'c')); result=false;});
		clear.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), 'd')); result=false;});
		sign.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), 's')); result=false;});
		SbracketL.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), '[')); result=false;});
		SbracketR.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), ']')); result=false; });
		mat_det.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), 'x')); result=true;});
		mat_mul.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), 'y')); result=false;});
		mat_div.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), 'z')); result=false;});
		mat_t.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), 'w')); result=true;});
		semicolon.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), ';')); result=false;});	
		coma.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.matrix_event(set_size(screen.getText()), ',')); result=false;});
					
}

public void copy() {
    String selectedText = screen.getText();
    final Clipboard clipboard = Clipboard.getSystemClipboard();
    final ClipboardContent content = new ClipboardContent();
    content.putString(selectedText);
    clipboard.setContent(content);
}

public void paste() {
    final Clipboard clipboard = Clipboard.getSystemClipboard();
    String content = (String) clipboard.getContent(DataFormat.PLAIN_TEXT);
    screen.setText(content);
}
 

private String set_size(String text) {

	screen.setFont(new Font("elephant", Math.max(15,30-3*(text.length())/5)));
	return text;
}



}
