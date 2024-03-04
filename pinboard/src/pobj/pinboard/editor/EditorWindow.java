package pobj.pinboard.editor;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import pobj.pinboard.document.Clip;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;




public class EditorWindow extends Application  {
    private final MenuBar menu1= new MenuBar();
	Stage stage;
	
	
	public EditorWindow(Stage board) {
		this.stage=board;
		
		 
	}

	@Override
	public void start(javafx.stage.Stage primaryStage) throws Exception {
		
		
		
		Stage stage = null;
		stage.setTitle("Board");

        // On aura plusieurs conteneur nous pouvons par contre cter 
		// 1. Barre de menu qui contient un menu plus precise;ent 
		// um menu nar contenant des menu
		// 2. Un toolBar qui contient des bouttons 
		// 3 une zone de dessin plus nommer par canvas
		// 4. Un label er un Separator
		//  5. TOus cela stocker dans une grande HBox



        // Une boxe vertical pour nos Elements

        
		// UN menu principale
		Menu maim= new Menu();
		MenuBar menu= new MenuBar(maim);
		
		MenuItem file= new MenuItem(" FILE");
	
		Separator men= new Separator();
		
		MenuItem edit= new MenuItem(" EDit");
        MenuItem tools= new MenuItem(" Tools");
		maim.getItems().addAll(file, edit, tools);


		

		// La decleration des diferents composangt dans notre menu1

		GridPane init = new GridPane();
		Label l=new Label("Filed rectangle tool");
		init.add(l, 0, 0);

		
		HBox hbox = new HBox();
		Button ajouterboutton1= new Button("Box");
		
		ajouterboutton1.setOnAction (new EventHandler <ActionEvent>() {
			
			public void handle(ActionEvent e) { 
				System.out.println("New"); }
			});
		Button ajouterboutton2= new Button("Ellipse");
		Button ajouterboutton3= new Button("Img...");
		hbox.getChildren().add(ajouterboutton1);
		hbox.getChildren().add(ajouterboutton2);
		hbox.getChildren().add(ajouterboutton3);
		
        Canvas screem = new Canvas(15,20);
        
        ToolBar sep= new ToolBar();
		Separator trai = new Separator(); 
		//sep.add(trai);

		


		//Element Boot
		VBox vbox=new VBox();
		//vbox.setTop(maim);
		vbox.getChildren().addAll(trai, hbox, menu,trai, screem);
        Scene scene = new Scene(vbox);
        
        
		// Affichage de notre screen origine 

		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public void handle(ActionEvent v) {
		
	}
	

}
