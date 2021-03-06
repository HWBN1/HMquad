package  p;
import java.util.Stack;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class calc extends Application {

	public  Button bb=new Button("Standard");
	public  Button bbb=new Button("Scintific");
	public int i=0;
  private String ss="";
  double cal = 0;
   Label screen  = new Label(); 
  
  public static void main(String[] args) { launch(args); }
  @Override public void start(Stage stage) {
	  stage.setWidth(370);
	  stage.setHeight(500);
	 
	  createScreen();
    final GridPane  buttons = createButtons(screen);
    final GridPane  buttons1 = createButtons2(screen);
    stage.setTitle("Calc");
    stage.setFullScreen(false);
    stage.initStyle(StageStyle.UTILITY);
   // stage.setResizable(false);
  bb.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%), linear-gradient(#020b02, #3a3a3a), linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%), linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%), linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%); -fx-background-insets: 0,1,4,5,6; -fx-background-radius: 9,8,5,4,3; -fx-padding: 15 30 15 30;  -fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
  bbb.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%), linear-gradient(#020b02, #3a3a3a), linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%), linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%), linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%); -fx-background-insets: 0,1,4,5,6; -fx-background-radius: 9,8,5,4,3; -fx-padding: 15 30 15 30;  -fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
  
   stage.setScene(new Scene(createLayout(screen, buttons)));
   stage.show();
   bb.setOnAction(e-> { 
	  
	  
		   stage.setScene(new Scene(createLayout(screen, buttons)));
           stage.show();
	   });
   bbb.setOnAction(e-> { 
	    
	   
	   stage.setScene(new Scene(createLayout(screen, buttons1)));
       stage.show();
   });
  
  }
  private BorderPane createLayout(Label screen, GridPane buttons) {
    final BorderPane layout = new BorderPane();
    screen.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%), linear-gradient(#020b02, #3a3a3a), linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%), linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%), linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%); -fx-background-insets: 0,1,4,5,6; -fx-background-radius: 9,8,5,4,3; -fx-padding: 15 30 15 30;  -fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
    layout.setTop(screen);
    layout.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color:rgb(10,10,10); -fx-padding: 20; -fx-font-size: 20;");
    layout.setCenter(buttons);
    screen.prefWidthProperty().bind(layout.widthProperty());
    screen.prefHeightProperty().bind(layout.heightProperty().divide(4));
    return layout;
  }
  private Label createScreen() {
	 
    screen.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color:lightgray; ");
    screen.setAlignment(Pos.CENTER_LEFT);
    return screen;
  }
private GridPane createButtons(Label screen){
	GridPane pane=new GridPane();
	pane.setAlignment(Pos.CENTER);
	pane.setPadding(new Insets(10, 10, 10, 10));
	 pane.setHgap(10);
	 pane.setVgap(10);
Button b1=new Button("1");b1.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );  -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");
Button b2=new Button("2");b2.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");
Button b3=new Button("3");b3.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");
Button b4=new Button("4");b4.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );  -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");
Button b5=new Button("5");b5.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );  -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");
Button b6=new Button("6");b6.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );  -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");
Button b7=new Button("7");b7.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );  -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");
Button b8=new Button("8");b8.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );  -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");
Button b9=new Button("9");b9.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );  -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");
Button b10=new Button("0");b10.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");

Button o1=new Button("C"); o1.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: linear-gradient(#f2f2f2, #d6d6d6), linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%), linear-gradient(#dddddd 0%, #f6f6f6 50%); -fx-background-radius: 8,7,6; -fx-background-insets: 0,1,2; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
Button o8=new Button("<"); o8.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: linear-gradient(#f2f2f2, #d6d6d6), linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%), linear-gradient(#dddddd 0%, #f6f6f6 50%); -fx-background-radius: 8,7,6; -fx-background-insets: 0,1,2; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");

Button o2=new Button("-");o2.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button o3=new Button("*");o3.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button o4=new Button("/");o4.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button o5=new Button("+/-");o5.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: rgb(169, 169, 167); -fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o10=new Button("(");o10.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button o11=new Button(")");o11.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button o12=new Button("+");o12.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button o13=new Button("^2");o13.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button o14=new Button("!");o14.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button o15=new Button("%");o15.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );  -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");

Button o6=new Button("=");o6.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );  -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");
Button o9=new Button(".");o9.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: #090a0c, linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%), linear-gradient(#20262b, #191d22), radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0)); -fx-background-radius: 5,4,3,5; -fx-background-insets: 0,1,2,0; -fx-text-fill: white; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );  -fx-text-fill: linear-gradient(white, #d0d0d0); -fx-font-size: 17px; -fx-padding: 10 20 10 20;");

b1.setOnAction(e-> { ss=ss+'1';screen.setText(ss);});
b2.setOnAction(e-> { ss=ss+'2';screen.setText(ss);});
b3.setOnAction(e-> { ss=ss+'3';screen.setText(ss);});
b4.setOnAction(e-> { ss=ss+'4';screen.setText(ss);});
b5.setOnAction(e-> { ss=ss+'5';screen.setText(ss);});
b6.setOnAction(e-> { ss=ss+'6';screen.setText(ss);});
b7.setOnAction(e-> { ss=ss+'7';screen.setText(ss);});
b8.setOnAction(e-> { ss=ss+'8';screen.setText(ss);});
b9.setOnAction(e-> { ss=ss+'9';screen.setText(ss);});
b10.setOnAction(e-> { ss=ss+"0";screen.setText(ss);});
o1.setOnAction(e-> { ss="";screen.setText("0");});
o2.setOnAction(e-> { ss=ss+" - ";screen.setText(ss);});
o3.setOnAction(e-> { ss=ss+" * ";screen.setText(ss);});
o4.setOnAction(e-> { ss=ss+" / ";screen.setText(ss);});
o5.setOnAction(e-> { ss=ss+"-";screen.setText(ss);});
o6.setOnAction(e->
{
	 
			 calculate(ss); 
			 ss="";
	});
o8.setOnAction(e-> {
	 
	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='n'&&ss.charAt(ss.length()-4)=='i')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}

	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='s'&&ss.charAt(ss.length()-4)=='o')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}

	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='h'&&ss.charAt(ss.length()-4)=='n')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}

	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='h'&&ss.charAt(ss.length()-4)=='s')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}

	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='n'&&ss.charAt(ss.length()-4)=='a')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}
	


	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='g'&&ss.charAt(ss.length()-4)=='o')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}
	
	if(ss.length()>=5&&ss.charAt(ss.length()-1)=='2'&&ss.charAt(ss.length()-2)=='^')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}

	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='h'&&ss.charAt(ss.length()-4)=='n')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}
	
	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='t'&&ss.charAt(ss.length()-4)=='r')
	{ss=ss.substring(0,ss.length()-6);screen.setText(ss);}
	
	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='t'&&ss.charAt(ss.length()-4)=='o')
	{ss=ss.substring(0,ss.length()-6);screen.setText(ss);}
	
	else if (ss.length()>=1&&ss.length()>0)
{
	ss=ss.substring(0,ss.length()-1);
	screen.setText(ss);
	
}}
);
o9.setOnAction(e-> { ss=ss+'.';screen.setText(ss);});
o10.setOnAction( e-> { ss=ss+" ( ";screen.setText(ss);});
o11.setOnAction(e-> { ss=ss+" ) " ;screen.setText(ss);});
o12.setOnAction(e-> { ss=ss+" + ";screen.setText(ss);});
o13.setOnAction(e-> { ss=ss+" )^2";screen.setText(ss);});
o14.setOnAction(e-> { ss=ss+" )!";screen.setText(ss);});
o15.setOnAction(e-> { ss=ss+"%";screen.setText(ss);});


b1.setMinSize(40, 40);
b2.setMinSize(40, 40);
b3.setMinSize(40, 40);
b4.setMinSize(40, 40);
b5.setMinSize(40, 40);
b6.setMinSize(40, 40);
b7.setMinSize(40, 40);
b8.setMinSize(40, 40);
b9.setMinSize(40, 40);
b10.setMinSize(40, 40);
o1.setMinSize(40, 40);
o2.setMinSize(40, 40);
o3.setMinSize(40, 40);
o4.setMinSize(40, 40);
o5.setMinSize(40, 40);
o6.setMinSize(40, 40);
o8.setMinSize(40, 40);
o9.setMinSize(40, 40);
o10.setMinSize(40, 40);
o11.setMinSize(40, 40);
o12.setMinSize(40, 40);
o13.setMinSize(40, 40);
o14.setMinSize(40, 40);
o15.setMinSize(40, 40);
b1.prefWidthProperty().bind(pane.widthProperty().divide(4));
b2.prefWidthProperty().bind(pane.widthProperty().divide(4));
b3.prefWidthProperty().bind(pane.widthProperty().divide(4));
b4.prefWidthProperty().bind(pane.widthProperty().divide(4));
b5.prefWidthProperty().bind(pane.widthProperty().divide(4));
b6.prefWidthProperty().bind(pane.widthProperty().divide(4));
b7.prefWidthProperty().bind(pane.widthProperty().divide(4));
b8.prefWidthProperty().bind(pane.widthProperty().divide(4));
b9.prefWidthProperty().bind(pane.widthProperty().divide(4));
b10.prefWidthProperty().bind(pane.widthProperty().divide(4));


o1.prefWidthProperty().bind(pane.widthProperty().divide(4));
o2.prefWidthProperty().bind(pane.widthProperty().divide(4));
o3.prefWidthProperty().bind(pane.widthProperty().divide(4));
o4.prefWidthProperty().bind(pane.widthProperty().divide(4));
o5.prefWidthProperty().bind(pane.widthProperty().divide(4));
o6.prefWidthProperty().bind(pane.widthProperty().divide(4));
o8.prefWidthProperty().bind(pane.widthProperty().divide(4));
o9.prefWidthProperty().bind(pane.widthProperty().divide(4));
o10.prefWidthProperty().bind(pane.widthProperty().divide(4));
o11.prefWidthProperty().bind(pane.widthProperty().divide(4));
o12.prefWidthProperty().bind(pane.widthProperty().divide(4));
o13.prefWidthProperty().bind(pane.widthProperty().divide(4));
o14.prefWidthProperty().bind(pane.widthProperty().divide(4));
o15.prefWidthProperty().bind(pane.widthProperty().divide(4));
b1.prefHeightProperty().bind(pane.heightProperty().divide(9));
b2.prefHeightProperty().bind(pane.heightProperty().divide(9));
b3.prefHeightProperty().bind(pane.heightProperty().divide(9));
b4.prefHeightProperty().bind(pane.heightProperty().divide(9));
b5.prefHeightProperty().bind(pane.heightProperty().divide(9));
b6.prefHeightProperty().bind(pane.heightProperty().divide(9));
b7.prefHeightProperty().bind(pane.heightProperty().divide(9));
b8.prefHeightProperty().bind(pane.heightProperty().divide(9));
b9.prefHeightProperty().bind(pane.heightProperty().divide(9));
b10.prefHeightProperty().bind(pane.heightProperty().divide(9));
o1.prefHeightProperty().bind(pane.heightProperty().divide(9));
o2.prefHeightProperty().bind(pane.heightProperty().divide(9));
o3.prefHeightProperty().bind(pane.heightProperty().divide(9));
o4.prefHeightProperty().bind(pane.heightProperty().divide(9));
o5.prefHeightProperty().bind(pane.heightProperty().divide(9));
o6.prefHeightProperty().bind(pane.heightProperty().divide(9));
o8.prefHeightProperty().bind(pane.heightProperty().divide(9));
o9.prefHeightProperty().bind(pane.heightProperty().divide(9));
o10.prefHeightProperty().bind(pane.heightProperty().divide(9));
o11.prefHeightProperty().bind(pane.heightProperty().divide(9));
o12.prefHeightProperty().bind(pane.heightProperty().divide(9));
o13.prefHeightProperty().bind(pane.heightProperty().divide(9));
o14.prefHeightProperty().bind(pane.heightProperty().divide(9));
o15.prefHeightProperty().bind(pane.heightProperty().divide(9));
bbb.prefWidthProperty().bind(pane.widthProperty().divide(1));
pane.add(o1, 0, 0);pane.add(o8, 1, 0);pane.add(o10, 2, 0);pane.add(o11, 3, 0);
pane.add(b1, 0, 1);pane.add(b2, 1, 1);pane.add(b3, 2, 1);pane.add(o4, 3, 1);
pane.add(b4, 0, 2);pane.add(b5, 1, 2);pane.add(b6, 2, 2);pane.add(o3, 3, 2);
pane.add(b7, 0, 3);pane.add(b8, 1, 3);pane.add(b9, 2, 3);pane.add(o2, 3, 3);
pane.add(o9, 0, 4);pane.add(b10, 1, 4);pane.add(o6, 2, 4);pane.add(o12, 3, 4,1,1);
pane.add(bbb, 0, 5,4,1);
//pane.addRow(0, o5);pane.addRow(1, o7);pane.addRow(2, o13);pane.addRow(3, o12);pane.addColumn(4, o6,2,1);
return pane;
}
private GridPane createButtons2(Label screen){
	GridPane pane=new GridPane();
	pane.setAlignment(Pos.CENTER);
	pane.setPadding(new Insets(10, 10, 10, 10));
	 pane.setHgap(10);
	 pane.setVgap(10);
Button d1=new Button("C");d1.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: linear-gradient(#f2f2f2, #d6d6d6), linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%), linear-gradient(#dddddd 0%, #f6f6f6 50%); -fx-background-radius: 8,7,6; -fx-background-insets: 0,1,2; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
Button d2=new Button("<");d2.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-background-color: linear-gradient(#f2f2f2, #d6d6d6), linear-gradient(#fcfcfc 0%, #d9d9d9 20%, #d6d6d6 100%), linear-gradient(#dddddd 0%, #f6f6f6 50%); -fx-background-radius: 8,7,6; -fx-background-insets: 0,1,2; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
Button d3=new Button("sin");d3.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d4=new Button("cos");d4.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d5=new Button("tan");d5.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d6=new Button("sih");d6.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d7=new Button("coh");d7.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d8=new Button("tah");d8.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d9=new Button("x\u207F");d9.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d10=new Button("X!");d10.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d11=new Button("x"); d11.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d12=new Button("pi"); d12.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d13=new Button("rootx");d13.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d14=new Button("e");d14.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d15=new Button("ran");d15.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d16=new Button("x");d16.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d17=new Button("Ln");d17.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d18=new Button("(");d18.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d19=new Button(")");d19.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d20=new Button("log");d20.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d21=new Button("x\u00B2");d21.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d22=new Button("e^x");d22.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d23=new Button("%");d23.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d24=new Button("Ans");d24.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
Button d25=new Button(".");d25.setStyle("-fx-font-family: Times New Roman;-fx-font-weight: bold;-fx-base: #c3c4c4, linear-gradient(#d6d6d6 50%, white 100%), radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%); -fx-background-radius: 30; -fx-background-insets: 0,1,1; -fx-text-fill: black; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
d1.setMinSize(40, 40);
d2.setMinSize(40, 40);
d3.setMinSize(40, 40);
d4.setMinSize(40, 40);
d5.setMinSize(40, 40);
d6.setMinSize(40, 40);
d7.setMinSize(40, 40);
d8.setMinSize(40, 40);
d9.setMinSize(40, 40);
d10.setMinSize(40, 40);
d11.setMinSize(40, 40);
d12.setMinSize(40, 40);
d13.setMinSize(40, 40);
d14.setMinSize(40, 40);
d15.setMinSize(40, 40);
d16.setMinSize(40, 40);
d17.setMinSize(40, 40);
d18.setMinSize(40, 40);
d19.setMinSize(40, 40);
d20.setMinSize(40, 40);
d21.setMinSize(40, 40);
d22.setMinSize(40, 40);
d23.setMinSize(40, 40);
d24.setMinSize(40, 40);
d5.setMinSize(40, 40);
d1.setOnAction(e->{ ss="";screen.setText("0");});
d2.setOnAction(e-> {
	 
	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='n'&&ss.charAt(ss.length()-4)=='i')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}

	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='s'&&ss.charAt(ss.length()-4)=='o')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}

	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='h'&&ss.charAt(ss.length()-4)=='n')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}

	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='h'&&ss.charAt(ss.length()-4)=='s')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}

	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='n'&&ss.charAt(ss.length()-4)=='a')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}
	


	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='g'&&ss.charAt(ss.length()-4)=='o')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}
	
	if(ss.length()>=5&&ss.charAt(ss.length()-1)=='2'&&ss.charAt(ss.length()-2)=='^')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}

	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='h'&&ss.charAt(ss.length()-4)=='n')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}
	
	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='t'&&ss.charAt(ss.length()-4)=='r')
	{ss=ss.substring(0,ss.length()-6);screen.setText(ss);}
	
	if(ss.length()>=5&&ss.charAt(ss.length()-3)=='t'&&ss.charAt(ss.length()-4)=='o')
	{ss=ss.substring(0,ss.length()-6);screen.setText(ss);}
	
	else if (ss.length()>=1&&ss.length()>0)
{
	ss=ss.substring(0,ss.length()-1);
	screen.setText(ss);
	
}});
d3.setOnAction(e-> { ss=ss+"sin( ";screen.setText(ss);});
d4.setOnAction(e-> { ss=ss+"cos( ";screen.setText(ss);});
d5.setOnAction(e-> { ss=ss+"tan( ";screen.setText(ss);});
d6.setOnAction(e-> { ss=ss+"sinh( ";screen.setText(ss);});
d7.setOnAction(e-> { ss=ss+"cosh( ";screen.setText(ss);});
d8.setOnAction(e-> { ss=ss+"tanh( ";screen.setText(ss);});
d9.setOnAction(e-> { ss=ss+" )^";screen.setText(ss);});
d10.setOnAction(e-> { ss=ss+" )!";screen.setText(ss);});
d11.setOnAction(e-> { ss=ss+"root( ";screen.setText(ss);});
d12.setOnAction(e-> { ss=ss+"3.14";screen.setText(ss);});
//d13.setOnAction(e-> {ss=ss+"root( ";screen.setText(ss);});
d14.setOnAction(e-> { ss=ss+"2.718";screen.setText(ss);});
d15.setOnAction(e-> {});
d24.setOnAction(e-> 
{
	 
	int r=(int)cal;
	if(cal>r)
	{
		ss=ss+cal;
		screen.setText(ss);
	}
	else if(cal==r)
	{
		ss=ss+r;
		screen.setText(ss);
	}
});
d16.setOnAction(e->{  ss=ss+"sqrt( ";screen.setText(ss);});
d17.setOnAction(e->{  ss=ss+"ln( ";screen.setText(ss);});
d18.setOnAction(e->{  ss=ss+" ( ";screen.setText(ss);});
d19.setOnAction(e-> { ss=ss+" ) ";screen.setText(ss);});
d20.setOnAction(e-> { ss=ss+"log( ";screen.setText(ss);});
d21.setOnAction(e-> { ss=ss+" )^2" ;screen.setText(ss);});
d22.setOnAction(e-> { ss=ss+"(2.718)^";screen.setText(ss);});
d23.setOnAction(e-> { ss=ss+" % ";screen.setText(ss);});
d25.setOnAction(e-> { ss=ss+".";screen.setText(ss);});

d1.prefWidthProperty().bind(pane.widthProperty().divide(4));
d2.prefWidthProperty().bind(pane.widthProperty().divide(4));
d3.prefWidthProperty().bind(pane.widthProperty().divide(4));
d4.prefWidthProperty().bind(pane.widthProperty().divide(4));
d5.prefWidthProperty().bind(pane.widthProperty().divide(4));
d6.prefWidthProperty().bind(pane.widthProperty().divide(4));
d7.prefWidthProperty().bind(pane.widthProperty().divide(4));
d8.prefWidthProperty().bind(pane.widthProperty().divide(4));
d9.prefWidthProperty().bind(pane.widthProperty().divide(4));
d10.prefWidthProperty().bind(pane.widthProperty().divide(4));

d11.prefWidthProperty().bind(pane.widthProperty().divide(4));
d12.prefWidthProperty().bind(pane.widthProperty().divide(4));
d13.prefWidthProperty().bind(pane.widthProperty().divide(4));
d14.prefWidthProperty().bind(pane.widthProperty().divide(4));
d15.prefWidthProperty().bind(pane.widthProperty().divide(4));
d16.prefWidthProperty().bind(pane.widthProperty().divide(4));
d17.prefWidthProperty().bind(pane.widthProperty().divide(4));
d18.prefWidthProperty().bind(pane.widthProperty().divide(4));
d19.prefWidthProperty().bind(pane.widthProperty().divide(4));
d20.prefWidthProperty().bind(pane.widthProperty().divide(4));
d21.prefWidthProperty().bind(pane.widthProperty().divide(4));
d22.prefWidthProperty().bind(pane.widthProperty().divide(4));
d23.prefWidthProperty().bind(pane.widthProperty().divide(4));
d24.prefWidthProperty().bind(pane.widthProperty().divide(4));
d25.prefWidthProperty().bind(pane.widthProperty().divide(4));
d1.prefHeightProperty().bind(pane.heightProperty().divide(9));
d2.prefHeightProperty().bind(pane.heightProperty().divide(9));
d3.prefHeightProperty().bind(pane.heightProperty().divide(9));
d4.prefHeightProperty().bind(pane.heightProperty().divide(9));
d5.prefHeightProperty().bind(pane.heightProperty().divide(9));
d6.prefHeightProperty().bind(pane.heightProperty().divide(9));
d7.prefHeightProperty().bind(pane.heightProperty().divide(9));
d8.prefHeightProperty().bind(pane.heightProperty().divide(9));
d9.prefHeightProperty().bind(pane.heightProperty().divide(9));
d10.prefHeightProperty().bind(pane.heightProperty().divide(9));


d11.prefHeightProperty().bind(pane.heightProperty().divide(9));
d12.prefHeightProperty().bind(pane.heightProperty().divide(9));
d13.prefHeightProperty().bind(pane.heightProperty().divide(9));
d14.prefHeightProperty().bind(pane.heightProperty().divide(9));
d15.prefHeightProperty().bind(pane.heightProperty().divide(9));
d16.prefHeightProperty().bind(pane.heightProperty().divide(9));
d17.prefHeightProperty().bind(pane.heightProperty().divide(9));
d18.prefHeightProperty().bind(pane.heightProperty().divide(9));
d19.prefHeightProperty().bind(pane.heightProperty().divide(9));
d20.prefHeightProperty().bind(pane.heightProperty().divide(9));
d21.prefHeightProperty().bind(pane.heightProperty().divide(9));
d22.prefHeightProperty().bind(pane.heightProperty().divide(9));
d23.prefHeightProperty().bind(pane.heightProperty().divide(9));
d24.prefHeightProperty().bind(pane.heightProperty().divide(9));
d25.prefHeightProperty().bind(pane.heightProperty().divide(9));
bb.prefWidthProperty().bind(pane.widthProperty().divide(1));
pane.add(d1, 0, 0);pane.add(d2, 1, 0);pane.add(d3, 2, 0);pane.add(d4, 3, 0);
pane.add(d6, 0, 1);pane.add(d7, 1, 1);pane.add(d8, 2, 1);pane.add(d9, 3, 1);
pane.add(d10, 0, 2);pane.add(d12, 1, 2);pane.add(d5, 2, 2);pane.add(d14, 3, 2);
pane.add(d16, 0, 3);pane.add(d11, 1, 3);pane.add(d18, 2, 3);pane.add(d19, 3, 3);
pane.add(d21, 0, 4);pane.add(d20, 1, 4);pane.add(d23, 2, 4);pane.add(d24, 3, 4,1,1);
pane.add(bb, 0, 5,4,1);
//pane.addRow(0, o5);pane.addRow(1, o7);pane.addRow(2, o13);pane.addRow(3, o12);pane.addColumn(4, o6,2,1);
return pane;
}
private void calculate(String exp)
{
	Stack<Comparable> st = new Stack<Comparable>();
	st.push('(');
	st.push(' ');
	try
	{
		for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)==')') 
			{
				String s = ")";
				while(!st.peek().equals('('))
				{	
					s = st.pop() + s;
				}
				//System.out.println("error:"+s);
				s = st.pop() + s;
				//System.out.println("error:"+s);
				if(st.peek().equals('t')) 			//sqrt()
				{
					st.pop();
					if(st.peek().equals('r'))
					{
						while(!st.peek().equals('s')) 
							st.pop();
						st.pop();
						st.push(Math.sqrt(evaluateExp(s)));	
					}
					else if(st.peek().equals('o'))
					{
						while(!st.peek().equals('r')) 
							st.pop();
						st.pop();
						String ss="";
						while(!st.empty())
						{
							ss+=st.pop();
						}
						String k="";
						for(int is=ss.length()-1;is>=0;is--)
						{
							k+=ss.charAt(is);
						}
						double x=evaluateExp(k);
						st.push(Math.pow(evaluateExp(s), 1/x));
					}
				}
		
			
				else if(st.peek().equals('s')) 	  //cos()
				{
					while(!st.peek().equals('c')) 
						st.pop();
					st.pop();
					if(evaluateExp(s)==180)
						st.push(-1);
					else if(evaluateExp(s)==90||evaluateExp(s)==270)
						st.push(0);
					else if(evaluateExp(s)==0||evaluateExp(s)==360)
						st.push(1);
					else if(evaluateExp(s)==60)
						st.push(0.5);
					else
					   st.push(Math.cos(Math.toRadians(evaluateExp(s))));	
				}
				else if(st.peek().equals('n')) 	  
				{
					st.pop();
					if(st.peek().equals('i')) //sin()
					{
						while(!st.peek().equals('s')) 
							st.pop();
						st.pop();
						if(evaluateExp(s)==180||evaluateExp(s)==360||evaluateExp(s)==0)
							st.push(0);
						else if(evaluateExp(s)==90)
							st.push(1);
						else if(evaluateExp(s)==270)
							st.push(-1);
						else if(evaluateExp(s)==30)
							st.push(0.5);
						else
						 st.push(Math.sin(Math.toRadians(evaluateExp(s))));
					}
					else if(st.peek().equals('a')) //tan()
					{
						while(!st.peek().equals('t')) 
							st.pop();
						st.pop();
						st.push(Math.tan(Math.toRadians(evaluateExp(s))));
					}
				}
				else if(st.peek().equals('3')) 	  //CR3()
				{
					st.pop();
					if(st.peek().equals('R'))
					{
						while(!st.peek().equals('C')) 
							st.pop();
						st.pop();
						st.push(Math.cbrt(evaluateExp(s)));
					}					
				}
				else if(st.peek().equals('h')) 	  
				{
					st.pop();
					if(st.peek().equals('s'))    //cosh
					{
						while(!st.peek().equals('c')) 
							st.pop();
						st.pop();
						st.push(Math.cosh(Math.toRadians(evaluateExp(s))));
					}
					else if(st.peek().equals('n')) //sinh
					{
						st.pop();
						if(st.peek().equals('i')) //sin()
						{
							while(!st.peek().equals('s')) 
								st.pop();
							st.pop();
							st.push(Math.sinh(Math.toRadians(evaluateExp(s))));
						}
						else if(st.peek().equals('a')) //tan()
						{
							while(!st.peek().equals('t')) 
								st.pop();
							st.pop();
							st.push(Math.tanh(Math.toRadians(evaluateExp(s))));
						}
					}
				}
				else if(st.peek().equals('g'))    //log() or lg()
				{
					st.pop();
					if(st.peek().equals('o'))    // log()
					{
						st.pop();st.pop();
						st.push(Math.log10(evaluateExp(s)));	
					}
					else    					//lg()
					{
						st.pop();
						st.push(Math.log10(evaluateExp(s))/Math.log10(2));
					}
				}
				else if(exp.charAt(i+1)=='^')    // ()^2
				{
					if(exp.charAt(i+2)=='2')
					{
						st.push(Math.pow(evaluateExp(s),2));
						i+=2;
					}
					else if(exp.charAt(i+2)=='3')    // ()^3
					{
						st.push(Math.pow(evaluateExp(s),3));
						i+=2;
					}
					else if(exp.charAt(i-2)=='8')  // e^x
					{
						int a = Integer.parseInt(String.valueOf(exp.charAt(i+2)));
						st.push(Math.pow(2.718,a));
						i+=2;
					}
					else                           //()^x
					{
						int a = Integer.parseInt(String.valueOf(exp.charAt(i+2)));
						st.push(Math.pow(evaluateExp(s),a));
						i+=2;
					}
				}
				else if(exp.charAt(i+1)=='!')    // ()!
				{
					int a=(int)evaluateExp(s);
					if(evaluateExp(s)==a)
						st.push(fact(a));
					i+=2;
				}
				else
					st.push(evaluateExp(s)); //( + * - / )
			}
			else
				st.push(exp.charAt(i));
		}
	String s = " ) ";
	while(!st.isEmpty())
		s = st.pop() + s;
	//System.out.println(s);
    cal = evaluateExp(s);
	}
	catch(Exception e)
	{
		screen.setText(" Error ");return ;
	}
	if(new Double(cal).isInfinite())
		{screen.setText(" Infinity ");}
	else
		{
		int r=(int)cal;
		if(cal>r)
		{
			screen.setText(""+cal);
		}
		else if(cal==r)
		{
			screen.setText(""+r);
		}
		}
}

private double evaluateExp(String exp)
{
	//System.out.println(exp);
	boolean contain_operand = true;
	exp = exp.replace("(  - ", "( 0 - ");
	
	exp = exp.replace("(", "");
   	exp = exp.replace(")", "");
	while(contain_operand)
	{
	 	char last;
	   	double op1=0,op2=0;
	   	
	   	exp = exp.replaceAll("  ", " ");
	   	contain_operand = exp.contains(" + ") || exp.contains(" - ") ||
			exp.contains(" * ") || exp.contains(" / ")|| exp.contains(" % ") ;
	   	if(contain_operand)
	   	{
		   	String[] op = exp.split(" ");
		   	//handle the first operation
		   	op1 = new Double(op[1]);
		   	last = op[2].charAt(0);
		   	op2 = new Double(op[3]);
		   	//handle and calculate the next operation
		   	for(int i = 4;i<op.length;i++)
		   	{
		   		if(op[i].charAt(0)=='+' || op[i].charAt(0)=='-')
		   		{
		 			switch(last)
		   			{
		   				case'+':op1 += op2; break;
		   				case'-':op1 -= op2; break;
		   				case'*':op1 *= op2; break;
		   				case'/':op1 /= op2; break;
		   				case'%':op1 %= op2; break;
		   			}
		   			op2 = new Double(op[i+1]);
		   			last = op[i].charAt(0);
		   		}
		   		else if(op[i].charAt(0)=='*' || op[i].charAt(0)=='/'|| op[i].charAt(0)=='%')
		   		{
		   			if(op[i].charAt(0) == '*')
		   				op2 *= new Double(op[i+1]);
		   			else if(op[i].charAt(0) == '/')
		   				op2 /= new Double(op[i+1]);
		   			else
		   				op2 %= new Double(op[i+1]);
		   		}
		   	}		    	
		   	//calculate the last operation in priority
		   	switch(last)
			{
				case'+':op1 += op2; break;
				case'-':op1 -= op2; break;
				case'*':op1 *= op2; break;
				case'/':op1 /= op2; break;
				case'%':op1 %= op2; break;
			}		    	
		   	exp = ""+op1;	
		   	}
	     }
		return new Double(exp);
	}
private int fact(int x)
{
	int result=1;
	for(int i=x;i>0;i--)
	{
		result*=i;
	}
	return result;
}

	

}
