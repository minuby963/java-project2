
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
	
public class Squares extends Application{

	public static void main(String[] args){
		launch(args);
		
		
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Individual specimen = new Individual(new PointPosition(10, 10));
		
		
		primaryStage.setTitle("Squares");
		
        Button btnStart = new Button();
        btnStart.setText("Show individuals");
        btnStart.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
            	System.out.println(specimen);
            }
        });
        Button btnStop = new Button();
        btnStop.setText("update age");
        btnStop.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
            	specimen.updateAge();
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btnStart);
        btnStart.setPrefSize(140, 20);
        btnStart.setTranslateX(-220);
        btnStart.setTranslateY(280);
        
        root.getChildren().add(btnStop);
        btnStop.setPrefSize(140, 20);
        btnStop.setTranslateX(220);
        btnStop.setTranslateY(280);
        Group root2 = new Group();
        Scene scene = new Scene(root2, 800, 600, Color.BLACK);
        primaryStage.setScene(scene);
        
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }

}
