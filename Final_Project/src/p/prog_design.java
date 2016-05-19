package p;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class prog_design extends Application{

	GridPane numbersPane , toolsPane;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bA,bB,bC,bD,bE,bF,bAnd , bOr , bNot , bXor , bClear , bBack , bEqual;
	TextArea screen;
	ComboBox<String> box1;
	
	HBox hbox;
	String operator = "";
	String N1="" , N2="";
	String base = "";
	String R="";
	String lastBase="" , currentBase="";
	String temp1="" , temp2="";
	prog_events E = new prog_events();

	
	public void start(Stage stage) throws Exception {
		
	//
		Create_numbers_buttons();
		Add_numbers_buttons();
		Create_tools();
		Add_tools();

		
		
		 hbox.getChildren().add(toolsPane);
		 hbox.getChildren().add(numbersPane);
		 
		 standard_design.mainPane.setBottom(hbox);
		 standard_design.mainPane.setCenter(screen);
	 
		binding();
		handle();
		setStyle();
		stage.setFullScreen(true);
		standard_design.scene.setRoot(standard_design.mainPane);
				
		
	}
	
	void Create_numbers_buttons()
	{
		screen = new TextArea();
	     hbox = new HBox();
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
		bA = new Button("A");
		bB = new Button("B");
		bC = new Button("C");
		bD = new Button("D");
		bE = new Button("E");
		bF = new Button("F");	 
		bAnd = new Button("AND");
		bOr = new Button("OR");
		bNot = new Button("NOT");
		bXor = new Button("XOR");
		bBack = new Button("DEL");
		bEqual = new Button("=");
		bClear = new Button("C");
		
	}

	void Add_numbers_buttons()
	{

		
		numbersPane  =new GridPane();
	
		
		numbersPane.setAlignment(Pos.CENTER);

		// First Row
		        numbersPane.add(b0, 0, 0);
		        numbersPane.add(b1, 1, 0);
		        numbersPane.add(b2, 2, 0);
		        numbersPane.add(b3, 3, 0);
		       
		       
		// Second Row
		        numbersPane.add(b4, 0, 1);
		        numbersPane.add(b5, 1, 1);
		        numbersPane.add(b6, 2, 1);
		        numbersPane.add(b7, 3, 1);
		     
		       
		// Third Row
		        numbersPane.add(b8, 0, 2);
		        numbersPane.add(b9, 1, 2);
		        numbersPane.add(bA, 2, 2);
		        numbersPane.add(bB, 3, 2);
		      
		       
		// Fourth Row
		        numbersPane.add(bC, 0, 3);
		        numbersPane.add(bD, 1, 3);
		        numbersPane.add(bE, 2, 3);
		        numbersPane.add(bF, 3, 3);
		    // Fifth Row
		        numbersPane.add(bAnd, 0, 4);
		        numbersPane.add(bOr, 1, 4);
		        numbersPane.add(bXor, 2, 4);
		        numbersPane.add(bNot, 3, 4);
		        
		        //Sixth Row
		        numbersPane.add(bBack, 0, 5);
		        numbersPane.add(bClear, 1, 5);
		        numbersPane.add(bEqual, 2, 5 , 2 ,1);
	
	//----------------------------------------------------------------
		        
		        
		      
	}

	void Create_tools()

	{
		
		box1 = new ComboBox<String>();
		
		box1.getItems().addAll("Decimal" , "Binary" , "Octal" , "Hexadecimal");
		
		
	}

	void Add_tools()
	{
		toolsPane = new GridPane();
		toolsPane.setHgap(2);
	    toolsPane.setAlignment(Pos.CENTER);
	    toolsPane.setPadding(new Insets(5, 5, 5, 5));
	    box1.setStyle("-fx-color: red");
	    box1.setValue("Decimal");
		toolsPane.add(box1, 0, 0);
		
		b0.setDisable(false);
		b1.setDisable(false);
		b2.setDisable(false);
		b3.setDisable(false);
		b4.setDisable(false);
		b5.setDisable(false);
		b6.setDisable(false);
		b7.setDisable(false);
		b8.setDisable(false);
		b9.setDisable(false);
		bA.setDisable(true);
		bB.setDisable(true);
		bC.setDisable(true);
		bD.setDisable(true);
		bE.setDisable(true);
		bF.setDisable(true);
		bNot.setDisable(true);
	//------------------------------------------------------
		
		 toolsPane.setStyle("-fx-border-color: white");
		 toolsPane.setStyle
		 ("-fx-border-width: 2px; -fx-border-color: white");
		 
		 screen.setEditable(false);

	}
	void binding()
	{
	         
		 toolsPane.prefWidthProperty().bind(standard_design.mainPane.widthProperty().divide(2.8));
		 toolsPane.prefHeightProperty().bind(standard_design.mainPane.heightProperty());
		 numbersPane.prefWidthProperty().bind(standard_design.mainPane.widthProperty().divide(1.3));
		 numbersPane.prefHeightProperty().bind(standard_design.mainPane.heightProperty());
		 
		 


	 //       b0.prefWidthProperty().bind(standard_design.mainPane.widthProperty());
		    b0.prefWidthProperty().bind(numbersPane.widthProperty());
		  //  b0.prefWidthProperty().bind(standard_design.mainPane.widthProperty().divide(20));
			b1.prefWidthProperty().bind(numbersPane.widthProperty());
			b2.prefWidthProperty().bind(numbersPane.widthProperty());
			b3.prefWidthProperty().bind(numbersPane.widthProperty());
			b4.prefWidthProperty().bind(numbersPane.widthProperty());
			b5.prefWidthProperty().bind(numbersPane.widthProperty());
			b6.prefWidthProperty().bind(numbersPane.widthProperty());
			b7.prefWidthProperty().bind(numbersPane.widthProperty());
			b8.prefWidthProperty().bind(numbersPane.widthProperty());
			b9.prefWidthProperty().bind(numbersPane.widthProperty());
			bA.prefWidthProperty().bind(numbersPane.widthProperty());
			bB.prefWidthProperty().bind(numbersPane.widthProperty());
			bC.prefWidthProperty().bind(numbersPane.widthProperty());
			bD.prefWidthProperty().bind(numbersPane.widthProperty());
			bE.prefWidthProperty().bind(numbersPane.widthProperty());
			bF.prefWidthProperty().bind(numbersPane.widthProperty());
			bAnd.prefWidthProperty().bind(numbersPane.widthProperty());
			bOr.prefWidthProperty().bind(numbersPane.widthProperty());
			bXor.prefWidthProperty().bind(numbersPane.widthProperty());
			bNot.prefWidthProperty().bind(numbersPane.widthProperty());
			bClear.prefWidthProperty().bind(numbersPane.widthProperty());
			bBack.prefWidthProperty().bind(numbersPane.widthProperty());
			bEqual.prefWidthProperty().bind(numbersPane.widthProperty());
							
			b0.prefHeightProperty().bind(numbersPane.heightProperty());
			b1.prefHeightProperty().bind(numbersPane.heightProperty());
			b2.prefHeightProperty().bind(numbersPane.heightProperty());
			b3.prefHeightProperty().bind(numbersPane.heightProperty());
			b4.prefHeightProperty().bind(numbersPane.heightProperty());
			b5.prefHeightProperty().bind(numbersPane.heightProperty());
			b6.prefHeightProperty().bind(numbersPane.heightProperty());
			b7.prefHeightProperty().bind(numbersPane.heightProperty());
			b8.prefHeightProperty().bind(numbersPane.heightProperty());
			b9.prefHeightProperty().bind(numbersPane.heightProperty());
			bA.prefHeightProperty().bind(numbersPane.heightProperty());
			bB.prefHeightProperty().bind(numbersPane.heightProperty());
			bC.prefHeightProperty().bind(numbersPane.heightProperty());
			bD.prefHeightProperty().bind(numbersPane.heightProperty());
			bE.prefHeightProperty().bind(numbersPane.heightProperty());
			bF.prefHeightProperty().bind(numbersPane.heightProperty());
			bAnd.prefHeightProperty().bind(numbersPane.heightProperty());
			bOr.prefHeightProperty().bind(numbersPane.heightProperty());
			bNot.prefHeightProperty().bind(numbersPane.heightProperty());
			bXor.prefHeightProperty().bind(numbersPane.heightProperty());
			bEqual.prefHeightProperty().bind(numbersPane.heightProperty());
			bBack.prefHeightProperty().bind(numbersPane.heightProperty());
			bClear.prefHeightProperty().bind(numbersPane.heightProperty());
			
			
			screen.prefHeightProperty().bind(standard_design.mainPane.heightProperty());

			
			
	     	
	}

	void handle()
	{
		b0.setOnMouseClicked(e -> { screen.appendText("0");});
		b1.setOnMouseClicked(e -> { screen.appendText("1");});
		b2.setOnMouseClicked(e -> { screen.appendText("2");});
		b3.setOnMouseClicked(e -> { screen.appendText("3");});
		b4.setOnMouseClicked(e -> { screen.appendText("4");});
		b5.setOnMouseClicked(e -> { screen.appendText("5");});
		b6.setOnMouseClicked(e -> { screen.appendText("6");});
		b7.setOnMouseClicked(e -> { screen.appendText("7");});
		b8.setOnMouseClicked(e -> { screen.appendText("8");});
		b9.setOnMouseClicked(e -> { screen.appendText("9");});
		bA.setOnMouseClicked(e -> { screen.appendText("A");});
		bB.setOnMouseClicked(e -> { screen.appendText("B");});
		bC.setOnMouseClicked(e -> { screen.appendText("C");});
		bD.setOnMouseClicked(e -> { screen.appendText("D");});
		bE.setOnMouseClicked(e -> { screen.appendText("E");});
		bF.setOnMouseClicked(e -> { screen.appendText("F");});

		bBack.setOnAction( e-> 
		{
			temp2="";
			temp1 = screen.getText();
			for(int i=0 ; i<temp1.length()-1 ; i++)
				temp2 += temp1.charAt(i);
		    screen.setText(temp2);

		});
		bClear.setOnAction(e-> {
			screen.setText("");
		});
		
		bAnd.setOnMouseClicked( e -> { operator = "AND"; N1 = screen.getText(); screen.setText("");});
		bOr.setOnMouseClicked( e -> { operator = "OR"; N1 = screen.getText(); screen.setText("");});
		bNot.setOnMouseClicked( e -> { operator = "NOT"; N1 = screen.getText(); screen.setText("");});
		bXor.setOnMouseClicked( e -> { operator = "XOR"; N1 = screen.getText(); screen.setText("");});
		bNot.setOnMouseClicked( e -> { N1 = screen.getText(); screen.setText(E.NOT(N1));});
		 
		
		
		bEqual.setOnAction( e -> { N2 = screen.getText(); 
		if(operator == "AND")
		{
			R = E.AND(N1, N2, base);
		}
		
		else if(operator == "OR")
		{
			R = E.OR(N1, N2, base);
		}
		else if(operator == "XOR")
		{
			R = E.XOR(N1, N2, base);
		}
		
		screen.setText(R);
		} );
		
		
		box1.setOnAction( e -> 
		{
			if(box1.getSelectionModel().getSelectedIndex()==0)
			{
				base = "decimal";
				b0.setDisable(false);
				b1.setDisable(false);
				b2.setDisable(false);
				b3.setDisable(false);
				b4.setDisable(false);
				b5.setDisable(false);
				b6.setDisable(false);
				b7.setDisable(false);
				b8.setDisable(false);
				b9.setDisable(false);
				bA.setDisable(true);
				bB.setDisable(true);
				bC.setDisable(true);
				bD.setDisable(true);
				bE.setDisable(true);
				bF.setDisable(true);
				bNot.setDisable(true);
				
				
			    if(lastBase == "bin")
				{
					screen.setText(E.bin_to_dec(screen.getText()));
				}
				else if(lastBase == "oct")
				{
					screen.setText(E.oct_to_dec(screen.getText()));
				}
		        else if(lastBase == "hex")
				{
					screen.setText(E.hex_to_dec(screen.getText()));
				}
		        else 
				{
					screen.setText(screen.getText());
				}
				
			    lastBase = "dec";
			}
			
			else  if(box1.getSelectionModel().getSelectedIndex()==1)
			{
				base = "binary";
				b0.setDisable(false);
				b1.setDisable(false);
				b2.setDisable(true);
				b3.setDisable(true);
				b4.setDisable(true);
				b5.setDisable(true);
				b6.setDisable(true);
				b7.setDisable(true);
				b8.setDisable(true);
				b9.setDisable(true);
				bA.setDisable(true);
				bB.setDisable(true);
				bC.setDisable(true);
				bD.setDisable(true);
				bE.setDisable(true);
				bF.setDisable(true);
				bNot.setDisable(false);

				 if(lastBase == "dec")
					{
						screen.setText(E.dec_to_bin(screen.getText()));
					}
					else if(lastBase == "oct")
					{
						screen.setText(E.oct_to_bin(screen.getText()));
					}
			        else if(lastBase == "hex")
					{
						screen.setText(E.hex_to_bin(screen.getText()));
					}
			        else 
					{
						screen.setText(screen.getText());
					}
				 lastBase = "bin";
				 
			}
			
			else  if(box1.getSelectionModel().getSelectedIndex()==2)
			{
				base = "octal";
				b0.setDisable(false);
				b1.setDisable(false);
				b2.setDisable(false);
				b3.setDisable(false);
				b4.setDisable(false);
				b5.setDisable(false);
				b6.setDisable(false);
				b7.setDisable(false);
				b8.setDisable(true);
				b9.setDisable(true);
				bA.setDisable(true);
				bB.setDisable(true);
				bC.setDisable(true);
				bD.setDisable(true);
				bE.setDisable(true);
				bF.setDisable(true);
				bNot.setDisable(true);
				
				if(lastBase == "dec")
				{
					screen.setText(E.dec_to_oct(screen.getText()));
				}
				else if(lastBase == "bin")
				{
					screen.setText(E.bin_to_oct(screen.getText()));
				}
		        else if(lastBase == "hex")
				{
					screen.setText(E.hex_to_oct(screen.getText()));
				}
		        else 
				{
					screen.setText(screen.getText());
				}
				
				lastBase = "oct";
			}
			else 
			{
				base = "hex";
				b0.setDisable(false);
				b1.setDisable(false);
				b2.setDisable(false);
				b3.setDisable(false);
				b4.setDisable(false);
				b5.setDisable(false);
				b6.setDisable(false);
				b7.setDisable(false);
				b8.setDisable(false);
				b9.setDisable(false);
				bA.setDisable(false);
				bB.setDisable(false);
				bC.setDisable(false);
				bD.setDisable(false);
				bE.setDisable(false);
				bF.setDisable(false);
				bNot.setDisable(true);
				
				if(lastBase == "dec")
				{
					screen.setText(E.dec_to_hex(screen.getText()));
				}
				else if(lastBase == "bin")
				{
					screen.setText(E.bin_to_hex(screen.getText()));
				}
		        else if(lastBase == "oct")
				{
					screen.setText(E.oct_to_hex(screen.getText()));
				}
		        else 
				{
					screen.setText(screen.getText());
				}
				
				lastBase = "hex";
			}
			
		});
		
		
	}

	void setStyle()
	{
		b0.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;  ");
		b1.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b2.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b3.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b4.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b5.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b6.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b7.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b8.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		b9.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bA.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bB.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bC.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bD.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bE.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bF.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bClear.setStyle("-fx-base: #3d5b99;  -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bBack.setStyle("-fx-base: #3d5b99;  -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bNot.setStyle("-fx-base: #3d5b99;  -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bOr.setStyle("-fx-base: #3d5b99;  -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bAnd.setStyle("-fx-base: #3d5b99;  -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bEqual.setStyle("-fx-base: #3d5b99;  -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		bXor.setStyle("-fx-base: #3d5b99;  -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		
		/////////////////////
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
		bA.setFont(new Font("elephant", 22));
		bB.setFont(new Font("elephant", 22));
		bC.setFont(new Font("elephant", 22));
		bD.setFont(new Font("elephant", 22));
		bE.setFont(new Font("elephant", 22));
		bF.setFont(new Font("elephant", 22));
		bEqual.setFont(new Font("elephant", 25));
		bClear.setFont(new Font("elephant", 25));
		bBack.setFont(new Font("elephant", 14));
		bNot.setFont(new Font("elephant", 14));
		bOr.setFont(new Font("elephant", 14));
		bAnd.setFont(new Font("elephant", 14));
		bXor.setFont(new Font("elephant", 14));
	
		screen.setStyle("-fx-base: white; -fx-text-fill: black; ");
		screen.setFont(new Font("elephant", 20));
		
		////////////////////
		//standard_design.mainPane.setStyle("-fx-background-color: #ccffcc");
		box1.setStyle("-fx-base: black; -fx-text-fill: #f7f7f7; -fx-background-radius: 10;");
		//box1.setFont(new Font("elephant", 25));
	//	mainPane.setStyle("-fx-background-color: #ccffcc");
	}
	
}
