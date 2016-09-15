/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Main.TelaLogin;
import Main.TelaPrincipal;
import static com.sun.media.jfxmediaimpl.MediaUtils.error;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import static sun.management.Agent.error;

/**
 *
 * @author Aluno
 */
public class TelaLoginController implements Initializable {
    
   
   // private Label label;
    @FXML
    private Button btsair;
    @FXML private Button btentrar;
    @FXML private TextField testeusuario;
    @FXML private PasswordField testesenha;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btsair.setOnMouseClicked(new EventHandler<MouseEvent>(){
            public void handle (MouseEvent e) {
            TelaLogin.getStage().close();
            }
        });
               
      btentrar.setOnMouseClicked((MouseEvent e)->{
        if (testeusuario.getText().equals("user")&& testesenha.getText().equals("user123")){
            TelaPrincipal telaprincipal = new TelaPrincipal();           
            try {
                telaprincipal.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         else {
            Alert erro = new Alert(AlertType.ERROR);
            erro.setHeaderText("Usuario ou Senha INVALIDA.");
            erro.show();
        }
        
               
      });
                
            
    }
        
}
   
