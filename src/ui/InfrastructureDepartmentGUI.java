package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import model.InfrastructureDepartment;

public class InfrastructureDepartmentGUI {

	@FXML
    private Pane principalPane;
	
	private InfrastructureDepartment infrastructureDepartment;
	
	public InfrastructureDepartmentGUI(InfrastructureDepartment infrastructureDepartment) {
		this.infrastructureDepartment = infrastructureDepartment;
	}
	
	@FXML
    void LoadAddBillboardW(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addBillboardW.fxml"));
		fxmlLoader.setController(this); 	
			
		Parent showAddBPane = fxmlLoader.load();
		principalPane.getChildren().clear();
		principalPane.getChildren().setAll(showAddBPane);
    }

}
