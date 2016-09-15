/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Main.CadastroEmpresa;
import Main.CadastroPessoa;
import Main.TelaLogin;
import Main.TelaPrincipal;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class TelaPrincipalController implements Initializable {
    
    @FXML private Button Cp; 
    @FXML private Button Ce;
    @FXML private Button Lp;
    @FXML private Button Le;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Cp.setOnMouseClicked((MouseEvent e)->{
            CadastroPessoa cadastroPessoa = new CadastroPessoa();
            try {
                CadastroPessoa emp1= new CadastroPessoa ();
                    emp1.setNome(nome.getText());
                    emp1.setSobrenome(sobrenome.getText());
                    emp1.sentNome(cpf.getText());
                    emp1.sentNome(endereco.getText());
                    emp1.sentNome(n.getText());
                    emp1.sentNome(cidade.getText());
                    emp1.sentNome(estado.getText());
                    
                    
                cadastroPessoa.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
 
        Ce.setOnMouseClicked((MouseEvent e)->{
            CadastroEmpresa cadastroEmpresa = new CadastroEmpresa();
            try {
                cadastroEmpresa.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        
                
        } 
                
}
