package p;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DataFormat;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class standard_design extends Application{

	protected static BorderPane mainPane = new BorderPane();;
	protected static MenuBar menuBar=new MenuBar();
	protected static Menu fileMenu =new Menu("Menu");     
	protected static MenuItem Standard=new MenuItem("Standard");
	protected static MenuItem Scientific=new MenuItem("Scientific");
	protected static MenuItem Matrix=new  MenuItem("Matrix");
	protected static MenuItem Programmer=new MenuItem("Programmer");
	protected static Scene scene = new Scene(mainPane,400,400);;
	protected static Stage thestage;
	
	protected static ComboBox<String> box =new ComboBox<String>(); 
	
	protected static RadioButton stand=new RadioButton("Stand"); 
	protected static RadioButton scien=new RadioButton("Scien"); 
	protected static RadioButton mat=new RadioButton("Matix"); 
	protected static RadioButton prog=new RadioButton("Prog"); 
	protected static ToggleGroup group =new ToggleGroup(); 
	protected static HBox boxForRadio=new HBox(20); 

	boolean pane_rotate=false;
	
	GridPane pane; 
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,dot,clear,clearAll,add,sub,mul,div,equal,sign,percent,bracketL,bracketR;
	TextArea screen;
	Clipboard systemClipboard;
	ClipboardContent content; 
	
	scientific_design sd=new scientific_design(); 
	matrix_design md=new matrix_design();
	prog_design pd=new prog_design();
	boolean result=false;

	
	@Override
	public void start(Stage stage) throws Exception {
		
		
		createButtons();
		addButtons();
		binding();
		styling();
		handle();
		
		scene.setRoot(mainPane);
		stage.setScene(scene);
		
		mainPane.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if(event.getCode() == KeyCode.ESCAPE)
					
						System.exit(0);
					
			}
		});
		stage.show();		
		thestage=stage;	
		stage.setFullScreenExitHint("");
		stage.setFullScreen(true);
}

void createButtons()
	{
	
	
	 screen = new TextArea();

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
		 bracketL =new Button("(");
		 bracketR=new Button(")");
		 systemClipboard = Clipboard.getSystemClipboard();
		 content = new ClipboardContent();
	
	}
void addButtons()
{
	menuBar.getMenus().clear();
	 fileMenu.getItems().clear();
	fileMenu.getItems().addAll(Standard, Scientific, Matrix,Programmer);
    menuBar.getMenus().addAll(fileMenu);
    /////
    box.getItems().addAll("Standard" , "Scientific" , "Matrix" , "Programmer");
    /////
    boxForRadio.getChildren().clear();
    boxForRadio.getChildren().addAll(stand, scien , mat , prog);
    stand.setToggleGroup(group);
    scien.setToggleGroup(group);
    mat.setToggleGroup(group);
    prog.setToggleGroup(group);
  //  boxForRadio.setStyle ("-fx-border-width: 2px; -fx-border-color: 3d5b99");
    boxForRadio.setPadding(new Insets(5, 5, 5, 5));
    
    /*
    stand.setGraphic(new ImageView("image/S.jpg"));
    scien.setGraphic(new ImageView("image/SN.jpg"));
    mat.setGraphic(new ImageView("image/M.jpg"));
    prog.setGraphic(new ImageView("image/PP.jpg"));
    stand.setStyle("-fx-border-color: black");
    scien.setStyle("-fx-border-color: black");
    mat.setStyle("-fx-border-color: black");
    prog.setStyle("-fx-border-color: black");
    */
    
    ////
	pane = new GridPane();
	// First Row
	       pane.add(clearAll, 0, 0);
	       pane.add(bracketL, 1, 0);
	       pane.add(bracketR, 2, 0);
	       pane.add(sign, 3, 0);
	// Second Row
	       pane.add(clear, 0, 1);
	       pane.add(div, 1, 1);
	       pane.add(mul, 2, 1);
	       pane.add(percent, 3, 1);
	// Third Row
	       pane.add(b7, 0, 2);
	       pane.add(b8, 1, 2);
	       pane.add(b9, 2, 2);
	       pane.add(sub, 3, 2);
	// Fourth Row
			pane.add(b4, 0, 3);
			pane.add(b5, 1, 3);
			pane.add(b6, 2, 3);
			pane.add(add, 3, 3);
	// Fifth Row
			pane.add(b1, 0, 4 );
			pane.add(b2, 1, 4);
			pane.add(b3, 2, 4);
			pane.add(equal, 3, 4, 1, 2);
	// Sixth Row
			pane.add(b0, 0, 5, 2, 1);
			pane.add(dot, 2, 5);
				
			
			
			mainPane.setTop(boxForRadio);
			mainPane.setBottom(pane);
			mainPane.setCenter(screen);
			screen.setEditable(false);
			
}
void binding()
{
	                
	
	 menuBar.setLayoutX(0);
	 menuBar.setLayoutY(0);
	
	 box.setLayoutX(0);
	 box.setLayoutY(0);
	 
		 pane.prefWidthProperty().bind(mainPane.widthProperty().divide(0.8));
		 pane.prefHeightProperty().bind(mainPane.heightProperty().divide(1.3));
		 screen.prefWidthProperty().bind(mainPane.widthProperty());
		 screen.prefHeightProperty().bind(mainPane.heightProperty().divide(5));
		 
		 
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
		percent.setStyle("-fx-base: black; -fx-text-fill: #3d5b99; -fx-background-radius: 5;");
		dot.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		bracketL.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		bracketR.setStyle("-fx-base:black; -fx-text-fill: #f7f7f7; -fx-background-radius: 5;");
		add.setStyle("-fx-base: black; -fx-text-fill: #3d5b99; -fx-background-radius: 5;");
		sub.setStyle("-fx-base: black; -fx-text-fill:#3d5b99;; -fx-background-radius: 5;");
		mul.setStyle("-fx-base: black; -fx-text-fill:#3d5b99; -fx-background-radius: 5;");
		div.setStyle("-fx-base: black; -fx-text-fill:#3d5b99; -fx-background-radius: 5;");
		equal.setStyle("-fx-base:#3d5b99; -fx-text-fill:white; -fx-background-radius: 5;");
		
		pane.setStyle("-fx-background-color:#3d5b99");
		mainPane.setStyle("-fx-background-color: #3d5b99");
		screen.setStyle("-fx-background-color:#3d5b99");
		b0.setFont(new Font("elephant", 25));
		b1.setFont(new Font("elephant", 25));
		b2.setFont(new Font("elephant", 25));
		b3.setFont(new Font("elephant", 25));
		b4.setFont(new Font("elephant", 25));
		b5.setFont(new Font("elephant", 25));
		b6.setFont(new Font("elephant", 25));
		b7.setFont(new Font("elephant", 25));
		b8.setFont(new Font("elephant", 25));
		b9.setFont(new Font("elephant", 25));
		clear.setFont(new Font("elephant", 20));
		clearAll.setFont(new Font("elephant", 20));
		sign.setFont(new Font("elephant", 20));
		percent.setFont(new Font("elephant", 20));
		dot.setFont(new Font("elephant", 20));
		bracketL.setFont(new Font("elephant", 20));
		bracketR.setFont(new Font("elephant", 20));
		add.setFont(new Font("elephant", 20));
		sub.setFont(new Font("elephant", 20));
		mul.setFont(new Font("elephant", 20));
		div.setFont(new Font("elephant", 20));
		equal.setFont(new Font("elephant", 20));
		
		
		
	}
void handle()
{
	/// ComboBox
/*	
	box.setOnAction( e -> 
	{
		if(box.getSelectionModel().getSelectedIndex()==0)
		{
			try {
				start(thestage);
			} catch (Exception e1) {
				
			}
			if(pane_rotate)
			{
				mainPane.setRotate(0);
				pane_rotate=!pane_rotate;
			}
			
			thestage.setScene(scene); 
		
		}
		
		
		else if(box.getSelectionModel().getSelectedIndex()==1)
		{
			try {
				sd.start(thestage);
			} catch (Exception e1) {
			
				e1.printStackTrace();
			}
			if(pane_rotate)
			{
				mainPane.setRotate(0);
				pane_rotate=!pane_rotate;
			}
			
			thestage.setScene(scene); 
		}
		
		else if(box.getSelectionModel().getSelectedIndex()==2)
		{
			try {
				md.start(thestage);
			} catch (Exception e1) {
			
				e1.printStackTrace();
			}
			if(pane_rotate)
			{
				mainPane.setRotate(0);
				pane_rotate=!pane_rotate;
			}
			
			thestage.setScene(scene); 
		}
		
		else if(box.getSelectionModel().getSelectedIndex()==3)
		{
			try {
				pd.start(thestage);
			} catch (Exception e1) {
			
				e1.printStackTrace();
			}
			if(pane_rotate==false)
			{
				mainPane.setRotate(-90);
				pane_rotate=!pane_rotate;
			}
			
			thestage.setScene(scene); 
		}
	});
	
	*/
	////////////////////////
	
	// RadioButtons
	
	stand.setOnAction( e-> 
	{
		if(stand.isSelected())
		{
			try {
				start(thestage);
			} catch (Exception e1) {
				
			}
			///if(pane_rotate)
			{
			//	mainPane.setRotate(0);
				pane_rotate=!pane_rotate;
			}
			
			thestage.setScene(scene); 
		}
	});
	
	scien.setOnAction( e-> 
	{
		if(scien.isSelected())
		{
			try {
				sd.start(thestage);
			} catch (Exception e1) {
			
				e1.printStackTrace();
			}
		//	if(pane_rotate)
			{
		//		mainPane.setRotate(0);
				pane_rotate=!pane_rotate;
			}
			
			thestage.setScene(scene); 
		}
	});
	
	mat.setOnAction( e-> 
	{
		if(mat.isSelected())
		{
			try {
				md.start(thestage);
			} catch (Exception e1) {
				
			}
			//if(pane_rotate)
			{
		//		mainPane.setRotate(0);
				pane_rotate=!pane_rotate;
			}
			
			thestage.setScene(scene); 
		}
	});
	
	prog.setOnAction( e-> 
	{
		if(prog.isSelected())
		{
			try {
				pd.start(thestage);
			} catch (Exception e1) {
				
			}
			//if(pane_rotate)
			{
			//	mainPane.setRotate(0);
				pane_rotate=!pane_rotate;
			}
			
			thestage.setScene(scene); 
		}
	});
	
	//////////////////////////
	/*
	
	Standard.setOnAction(e->{             
		try {
			start(thestage);
		} catch (Exception e1) {
			
		}
		if(pane_rotate)
		{
			mainPane.setRotate(0);
			pane_rotate=!pane_rotate;
		}
		
		thestage.setScene(scene); 
		
	});
	Scientific.setOnAction(e->{              
		try {
			sd.start(thestage);
		} catch (Exception e1) {
		
			e1.printStackTrace();
		}
		if(pane_rotate==false)
		{
			mainPane.setRotate(-90);
			pane_rotate=!pane_rotate;
		}
		
		thestage.setScene(scene); 
	});
	Matrix.setOnAction(e->{              
		try {
			md.start(thestage);
		} catch (Exception e1) {
		
			e1.printStackTrace();
		}
		if(pane_rotate)
		{
			mainPane.setRotate(0);
			pane_rotate=!pane_rotate;
		}
		
		thestage.setScene(scene); 
	});
	Programmer.setOnAction(e->{              
		try {
			pd.start(thestage);
		} catch (Exception e1) {
		
			e1.printStackTrace();
		}
		if(pane_rotate)
		{
			mainPane.setRotate(0);
			pane_rotate=!pane_rotate;
		}
		
		thestage.setScene(scene); 
	});
	
	*/
	
	
	
	
	scientific_events o=new scientific_events();
	
	
		b0.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '0'))); result=false;});
		b1.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '1'))); result=false;});
		b2.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '2'))); result=false;});
		b3.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '3'))); result=false;});
		b4.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '4'))); result=false;});
		b5.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '5'))); result=false;});
		b6.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '6'))); result=false;});
		b7.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '7'))); result=false;});
		b8.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '8'))); result=false;});
		b9.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '9'))); result=false;});
		dot.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '.'))); result=false;});
		add.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '+'))); result=false;});
		sub.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '-'))); result=false;});
		mul.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '*'))); result=false;});
		div.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '/'))); result=false;});
		percent.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '%'))); result=false;});
		equal.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '='))); result=true; });
		clearAll.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), 'c'))); result=false;});
		clear.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), 'd'))); result=false;});
		sign.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), 's'))); result=false;});
		bracketL.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), '('))); result=false;});
		bracketR.setOnAction(e -> {if(result)screen.setText(""); screen.setText(set_size(o.event((screen.getText()), ')'))); result=false;});	
			
		screen.setOnTouchMoved(

				e->{
					if(screen.getText().contains("")==false)copy();
					else paste();
				}
				);
		
		
		
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


public static void main(String[] args) {	
	launch(args);
		
	
	}
}
