
package view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;/**
 *
 * @author User
 */
public class ViewReserva {
    private GridPane rootPane;
    private Label DNILabel;
    private Label IDpistaLabel;
    private Label HiniciLabel;
    private Label HfinalLabel;
    private Label DiaLabel;
    private TextField DNITextField;
    private TextField IDpistaTextField;
    private TextField HiniciTextField;
    private TextField HfinalTextField;
    private TextField DiaTextField;
    private HBox buttonPane;
    private Button reservarButton;
    private Button cancelarButton;
    private ChoiceBox espaisChoice;

    public ViewReserva() {
        rootPane = new GridPane();
        rootPane.setAlignment(Pos.CENTER);
        rootPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        rootPane.setHgap(5.5);
        rootPane.setVgap(5.5);

        DNILabel = new Label("DNI responsable:");
        IDpistaLabel = new Label("ID pista");
        HiniciLabel = new Label("Hora inici:");
        HfinalLabel = new Label("Hora final:");
        DiaLabel = new Label("Dia:");
        DNITextField = new TextField();
        IDpistaTextField = new TextField();
        HiniciTextField = new TextField();
        HfinalTextField = new TextField();
        DiaTextField = new TextField();
        buttonPane = new HBox();
        buttonPane.setSpacing(5);
        reservarButton = new Button("Reservar");
        cancelarButton = new Button("Cancel·lar");

        rootPane.add(DNILabel, 0, 0);
        rootPane.add(IDpistaLabel, 0, 1);
        rootPane.add(HiniciLabel, 0, 2);
        rootPane.add(HfinalLabel, 0, 3);
        rootPane.add(DiaLabel, 0, 4);
        rootPane.add(DNITextField, 1, 0);
        rootPane.add(IDpistaTextField, 1, 1);
        rootPane.add(HiniciTextField, 1, 2);
        rootPane.add(HfinalTextField, 1, 3);
        rootPane.add(DiaTextField, 1, 4);
        

        buttonPane.getChildren().addAll(reservarButton, cancelarButton);
        rootPane.add(buttonPane, 0, 5);
        buttonPane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(buttonPane, HPos.RIGHT);
    }

    public GridPane getRootPane() {
        return rootPane;
    }

    public Label getDNILabel() {
        return DNILabel;
    }

    public Label getIDpistaLabel() {
        return IDpistaLabel;
    }

    public Label getHiniciLabel() {
        return HiniciLabel;
    }

    public Label getHfinalLabel() {
        return HfinalLabel;
    }

    public Label getDiaLabel() {
        return DiaLabel;
    }

    public TextField getDNITextField() {
        return DNITextField;
    }

    public TextField getIDpistaTextField() {
        return IDpistaTextField;
    }

    public TextField getHiniciTextField() {
        return HiniciTextField;
    }

    public TextField getHfinalTextField() {
        return HfinalTextField;
    }

    public TextField getDiaTextField() {
        return DiaTextField;
    }

    public HBox getButtonPane() {
        return buttonPane;
    }

    public Button getReservarButton() {
        return reservarButton;
    }

    public Button getCancelarButton() {
        return cancelarButton;
    }

    public ChoiceBox getEspaisChoice() {
        return espaisChoice;
    }

    
}

