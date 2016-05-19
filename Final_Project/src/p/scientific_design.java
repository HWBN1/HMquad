package p;
import javafx.application.Application;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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

public class scientific_design  extends Application{


	GridPane pane;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9 ,dot,clear,clearAll ,add,sub,mul,div,equal, sign,percent,bracketL,bracketR,
	eq, mat,ceil,ans,pi,floor,ncr,npr, sin,sin_inv,x_sq,mod,cos,cos_inv,sqr,pow,tan,tan_inv,e,x_fact,log,ln,abs,x_inv;
	TextArea screen;
	boolean result=false;
	
	@Override
	public void start(Stage stage) throws Exception {
	

		createButtons();
		addButtons();
		binding();
		styling();
		handle();
	
		stage.setFullScreen(true);

		standard_design.scene.setRoot(standard_design.mainPane);
					
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
		 ////////////////////////////////////////////////////
		 eq=new Button("eq");
		 mat=new Button("mat");
		 ceil=new Button("ceil");
		 ans=new Button("ans");
		 npr=new Button("nPr");
		 ncr=new Button("nCr");
		 floor=new Button("floor");
		 pi=new Button("Pi");
		 sin=new Button("sin");
		 sin_inv=new Button("sin-1");
		 x_sq=new Button("^2");
		 mod=new Button("mod");
		 cos=new Button("cos");
		 cos_inv=new Button("cos-1");
		 sqr=new Button("sqrt");
		 pow=new Button("pow");
		 tan=new Button("tan");
		 tan_inv=new Button("tan-1");
		 e=new Button("e");
		 x_fact=new Button("x!");
		 log=new Button("log");
		 ln=new Button("ln");
		 abs=new Button("abs");
		 x_inv=new Button("1/x");
		 
	}
void addButtons()
{
	   
	pane = new GridPane();
	// First Row
	    pane.add(ans, 0, 0);
	    pane.add(clearAll, 1, 0);
	    pane.add(bracketL, 2, 0);
	    pane.add(bracketR, 3, 0);
	    pane.add(sign, 4, 0);
	    pane.add(ceil, 0, 1);
	    pane.add(clear, 1, 1);
	    pane.add(div, 2, 1);
	    pane.add(mul, 3, 1);
	    pane.add(percent, 4, 1);
	    pane.add(floor, 0, 2);
	    pane.add(b7, 1, 2);
	    pane.add(b8, 2, 2);
	    pane.add(b9, 3, 2);
	    pane.add(sub, 4, 2);
	    pane.add(x_sq, 0, 3);
	    pane.add(b4, 1, 3);
	    pane.add(b5, 2, 3);
	    pane.add(b6, 3, 3);
	    pane.add(add, 4, 3);
	    pane.add(sqr, 0, 4);
	    pane.add(b1, 1, 4);
	    pane.add(b2, 2, 4);
	    pane.add(b3, 3, 4);
	    pane.add(equal, 4, 4,1,2);
	    pane.add(x_fact, 0, 5);
	    pane.add(b0, 1, 5,2,1);
	    pane.add(dot, 3, 5);
	    pane.add(x_inv, 0,6 );
	    pane.add(log, 1, 6);
	    pane.add(sin, 2, 6);
	    pane.add(cos, 3, 6);
	    pane.add(tan, 4, 6);
	    pane.add(abs, 0, 7);
	    pane.add(ln, 1, 7);
	    pane.add(sin_inv, 2, 7);
	    pane.add(cos_inv, 3, 7);
	    pane.add(tan_inv, 4, 7);		
			
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
					
					eq.prefHeightProperty().bind(pane.heightProperty());
					mat.prefHeightProperty().bind(pane.heightProperty());
					ceil.prefHeightProperty().bind(pane.heightProperty());
					npr.prefHeightProperty().bind(pane.heightProperty());
					ncr.prefHeightProperty().bind(pane.heightProperty());
					floor.prefHeightProperty().bind(pane.heightProperty());
					pi.prefHeightProperty().bind(pane.heightProperty());
					sin.prefHeightProperty().bind(pane.heightProperty());
					sin_inv.prefHeightProperty().bind(pane.heightProperty());
					cos.prefHeightProperty().bind(pane.heightProperty());
					cos_inv.prefHeightProperty().bind(pane.heightProperty());
					tan.prefHeightProperty().bind(pane.heightProperty());
					tan_inv.prefHeightProperty().bind(pane.heightProperty());
					x_sq.prefHeightProperty().bind(pane.heightProperty());
					mod.prefHeightProperty().bind(pane.heightProperty());
					pow.prefHeightProperty().bind(pane.heightProperty());
					sqr.prefHeightProperty().bind(pane.heightProperty());
					e.prefHeightProperty().bind(pane.heightProperty());
					x_fact.prefHeightProperty().bind(pane.heightProperty());
					log.prefHeightProperty().bind(pane.heightProperty());
					ln.prefHeightProperty().bind(pane.heightProperty());
					abs.prefHeightProperty().bind(pane.heightProperty());
					x_inv.prefHeightProperty().bind(pane.heightProperty());
					ans.prefHeightProperty().bind(pane.heightProperty());
					
					
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
						
						eq.prefWidthProperty().bind(pane.widthProperty());
						mat.prefWidthProperty().bind(pane.widthProperty());
						ceil.prefWidthProperty().bind(pane.widthProperty());
						ans.prefWidthProperty().bind(pane.widthProperty());
						npr.prefWidthProperty().bind(pane.widthProperty());
						ncr.prefWidthProperty().bind(pane.widthProperty());
						floor.prefWidthProperty().bind(pane.widthProperty());
						pi.prefWidthProperty().bind(pane.widthProperty());
						sin.prefWidthProperty().bind(pane.widthProperty());
						sin_inv.prefWidthProperty().bind(pane.widthProperty());
						cos.prefWidthProperty().bind(pane.widthProperty());
						cos_inv.prefWidthProperty().bind(pane.widthProperty());
						x_sq.prefWidthProperty().bind(pane.widthProperty());
						pow.prefWidthProperty().bind(pane.widthProperty());
						mod.prefWidthProperty().bind(pane.widthProperty());
						sqr.prefWidthProperty().bind(pane.widthProperty());
						tan.prefWidthProperty().bind(pane.widthProperty());
						tan_inv.prefWidthProperty().bind(pane.widthProperty());
						e.prefWidthProperty().bind(pane.widthProperty());
						x_fact.prefWidthProperty().bind(pane.widthProperty());
						log.prefWidthProperty().bind(pane.widthProperty());
						ln.prefWidthProperty().bind(pane.widthProperty());
						abs.prefWidthProperty().bind(pane.widthProperty());
						x_inv.prefWidthProperty().bind(pane.widthProperty());
										
}
void styling()
{
		b0.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		b1.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		b2.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		b3.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		b4.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		b5.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		b6.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		b7.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		b8.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		b9.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		clear.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		clearAll.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		sign.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		percent.setStyle("-fx-base: black; -fx-text-fill: #3d5b99;  -fx-background-radius: 0;");
		dot.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		bracketL.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		bracketR.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		add.setStyle("-fx-base: black; -fx-text-fill: #3d5b99;  -fx-background-radius: 0;");
		sub.setStyle("-fx-base: black; -fx-text-fill: #3d5b99;  -fx-background-radius: 0;");
		mul.setStyle("-fx-base: black; -fx-text-fill: #3d5b99;  -fx-background-radius: 0;");
		div.setStyle("-fx-base: black; -fx-text-fill: #3d5b99;  -fx-background-radius: 0;");
		equal.setStyle("-fx-base: #3d5b99;  -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		///////////////////////////////////////
		eq.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		mat.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		ceil.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		ans.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		npr.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		ncr.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		floor.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		pi.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		sin.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		sin_inv.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		x_sq.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		pow.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		tan.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		tan_inv.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		e.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		x_fact.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		log.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		ln.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		abs.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		x_inv.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		mod.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		cos.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		cos_inv.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		sqr.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 0;");
		//////////////////////////////////////
		
		pane.setStyle("-fx-background-color: #3d5b99");
		standard_design.mainPane.setStyle("-fx-background-color: #3d5b99");
		screen.setStyle("-fx-background-color: #3d5b99");
		b0.setFont(new Font("elephant", 20));
		b1.setFont(new Font("elephant", 20));
		b2.setFont(new Font("elephant", 20));
		b3.setFont(new Font("elephant", 20));
		b4.setFont(new Font("elephant", 20));
		b5.setFont(new Font("elephant", 20));
		b6.setFont(new Font("elephant", 20));
		b7.setFont(new Font("elephant", 20));
		b8.setFont(new Font("elephant", 20));
		b9.setFont(new Font("elephant", 20));
		clear.setFont(new Font("elephant", 15));
		clearAll.setFont(new Font("elephant", 15));
		sign.setFont(new Font("elephant", 15));
		percent.setFont(new Font("elephant", 15));
		dot.setFont(new Font("elephant", 15));
		bracketL.setFont(new Font("elephant", 15));
		bracketR.setFont(new Font("elephant", 15));
		add.setFont(new Font("elephant", 15));
		sub.setFont(new Font("elephant", 15));
		mul.setFont(new Font("elephant", 15));
		div.setFont(new Font("elephant", 15));
		equal.setFont(new Font("elephant", 15));
		///////////////
		eq.setFont(new Font("elephant", 15));
		mat.setFont(new Font("elephant", 15));
		ceil.setFont(new Font("elephant", 15));
		ans.setFont(new Font("elephant", 15));
		npr.setFont(new Font("elephant", 15));
		ncr.setFont(new Font("elephant", 15));
		floor.setFont(new Font("elephant", 15));
		pi.setFont(new Font("elephant", 15));
		sin.setFont(new Font("elephant", 15));
		sin_inv.setFont(new Font("elephant", 15));
		x_sq.setFont(new Font("elephant", 15));
		mod.setFont(new Font("elephant", 15));
		cos.setFont(new Font("elephant", 15));
		cos_inv.setFont(new Font("elephant", 15));
		sqr.setFont(new Font("elephant", 15));
		pow.setFont(new Font("elephant", 15));
		tan.setFont(new Font("elephant", 15));
		tan_inv.setFont(new Font("elephant", 15));
		e.setFont(new Font("elephant", 15));
		log.setFont(new Font("elephant", 15));
		ln.setFont(new Font("elephant", 15));
		abs.setFont(new Font("elephant", 15));
		x_inv.setFont(new Font("elephant", 15));
		x_fact.setFont(new Font("elephant", 15));
		
		screen.setStyle("-fx-base: white; -fx-text-fill: black; ");
		screen.setFont(new Font("elephant", 15));
		
	}
void handle()
{
	
	
	
	scientific_events o=new scientific_events();
	
	
		b0.setOnAction(e -> {
			
			if(result)screen.setText(""); 
			String s=o.event(set_size(screen.getText()), '0');
			screen.setText(o.event(set_size(screen.getText()), '0'));
			result=false;});
		b1.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '1')); result=false;});
		b2.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '2')); result=false;});
		b3.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '3')); result=false;});
		b4.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '4')); result=false;});
		b5.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '5')); result=false;});
		b6.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '6')); result=false;});
		b7.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '7')); result=false;});
		b8.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '8')); result=false;});
		b9.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '9')); result=false;});
		dot.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '.')); result=false;});
		add.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '+')); result=false;});
		sub.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '-')); result=false;});
		mul.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '*')); result=false;});
		div.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '/')); result=false;});
		percent.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '%')); result=false;});
		equal.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '=')); result=true; });
		clearAll.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'c')); result=false;});
		clear.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'd')); result=false;});
		sign.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 's')); result=false;});
		bracketL.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '(')); result=false;});
		bracketR.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), ')')); result=false;});	
		ln.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'n')); result=false;});
		log.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'l')); result=false;});
		sqr.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'r')); result=false;});
		pi.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'p')); result=false;});
		sin.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'g')); result=false;});
		sin_inv.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'G')); result=false;});
		cos.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'F')); result=false;});
		cos_inv.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'C')); result=false;});
		floor.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'f')); result=false;});
		ceil.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'i')); result=false;});
		tan.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 't')); result=false;});
		tan_inv.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'T')); result=false;});
		mod.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'm')); result=false;});
		x_sq.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'q')); result=false;});
		x_inv.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'v')); result=false;});
		pow.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'w')); result=false;});
		x_fact.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), '!')); result=false;});
		e.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'e')); result=false;});
		abs.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'A')); result=false;});
		ans.setOnAction(e -> {if(result)screen.setText(""); screen.setText(o.event(set_size(screen.getText()), 'Z')); result=false;});

}

private String set_size(String text) {

	screen.setFont(new Font("elephant", Math.max(15,30-3*(text.length())/5)));
	return text;
}

}
