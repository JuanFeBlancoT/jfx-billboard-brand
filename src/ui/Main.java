package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.InfrastructureDepartment;

public class Main extends Application{

		private InfrastructureDepartmentGUI infrastructrueDepartmentGUI;
		private InfrastructureDepartment infrastructureDepartment;
		
		public Main() {
			infrastructureDepartment = new InfrastructureDepartment();
			infrastructrueDepartmentGUI = new InfrastructureDepartmentGUI(infrastructureDepartment);
		}
		
		public static void main(String[] args) {
			launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainPaine.fxml"));
			
			fxmlLoader.setController(infrastructrueDepartmentGUI);
			
			Parent root = fxmlLoader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
		 	primaryStage.setTitle("Billboard");
		 	primaryStage.show();
			
		 	//classroomgui.loadLoginW(null);
			
		}

	}
