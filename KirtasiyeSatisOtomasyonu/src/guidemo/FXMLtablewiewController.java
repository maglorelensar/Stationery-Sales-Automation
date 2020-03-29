/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import dom.CrudDOM;
import dom.ReadXML;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */

public class FXMLtablewiewController implements Initializable {
@FXML private TableView<Person> tblWiew;
@FXML private TableColumn<Person,String>firstNameClmn;
@FXML private TableColumn<Person,String>lastNameClmn;
@FXML private TableColumn<Person,LocalDate>birthdayClmn;
@FXML private TextField firstNametxt;
@FXML private TextField lastNametxt;
@FXML private DatePicker birthdaydtpckr;
@FXML
   public void btnUrunAraAction(ActionEvent event) throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("FXMLürünara.fxml"));
        Stage stage=new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("ÜRÜN ARA");
        stage.show();
    }
public void changeScreenButtonPushed(ActionEvent event) throws IOException{
    Parent tableWiewParent=FXMLLoader.load(getClass().getResource("Ürünler.fxml"));
    Scene tableWiewScene=new Scene(tableWiewParent);
    
    Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(tableWiewScene);
    window.setTitle("ÜRÜNLER");
    window.show();
}
 

     /*   @FXML
    private void btnPushÜrünlerAction(ActionEvent event) throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("Ürünler.fxml"));
        Stage stage=new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("ÜRÜNLER");
        stage.show();
    }*/
public void ChangeFirstNameCellEvent(CellEditEvent editedCell){
    Person personSelected=tblWiew.getSelectionModel().getSelectedItem();
    personSelected.setFirstName(editedCell.getNewValue().toString());
}
public void ChangeLastNameCellEvent(CellEditEvent editedCell){
    Person personSelected=tblWiew.getSelectionModel().getSelectedItem();
    personSelected.setFirstName(editedCell.getNewValue().toString());
}
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        firstNameClmn.setCellValueFactory(new PropertyValueFactory<Person,String>("firstName"));
        lastNameClmn.setCellValueFactory(new PropertyValueFactory<Person,String>("lastName"));
        birthdayClmn.setCellValueFactory(new PropertyValueFactory<Person,LocalDate>("birthday"));
         
 
        tblWiew.setItems(getPeople());
        
        tblWiew.setEditable(true);
        firstNameClmn.setCellFactory(TextFieldTableCell.forTableColumn());
        lastNameClmn.setCellFactory(TextFieldTableCell.forTableColumn());

        tblWiew.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                
    }    
    public void deletePersonButtonPushed(){
        CrudDOM cd=new CrudDOM();
        
        cd.Sil(firstNametxt.getText());
        ObservableList<Person> selectedRowsList,allPeople;
        allPeople=tblWiew.getItems();
        
        selectedRowsList=tblWiew.getSelectionModel().getSelectedItems();
        
        for(Person person:selectedRowsList)
        {
         allPeople.remove(person);
        }
    }
    public void newPersonButtonPushed(){
        CrudDOM cr=new CrudDOM();
        
        cr.Ekle(firstNametxt.getText(),lastNametxt.getText() ,birthdaydtpckr.getValue().toString() );
        Person newPerson=new Person(firstNametxt.getText(),
                lastNametxt.getText(),
                birthdaydtpckr.getValue());
        
        tblWiew.getItems().add(newPerson);
        
    }public void urunGüncelle(){
        CrudDOM crd=new CrudDOM();
        crd.Güncelle(firstNametxt.getText(),lastNametxt.getText() ,birthdaydtpckr.getValue().toString());
    
    }  public void urunGörüntüle(){
        
            
     }  
    
    public ObservableList<Person> getPeople(){
         // ReadXML r=new ReadXML();
        ObservableList<Person> people=FXCollections.observableArrayList();
        people.add(new Person("A7C84", "Kalem", LocalDate.of(2019, Month.JULY, 7)));
        people.add(new Person("D42TY", "Silgi", LocalDate.of(2019, Month.APRIL, 19)));
        people.add(new Person("UO77P", "Defter", LocalDate.of(2019, Month.MARCH, 22)));
        people.add(new Person("S489G", "Çanta", LocalDate.of(2019, Month.NOVEMBER, 21)));
        people.add(new Person("X56CV", "Yapıştırıcı", LocalDate.of(2019, Month.DECEMBER, 14)));
        //people.add(new Person(r.element.toString(), r.element.toString(), LocalDate.MIN));
    




        return people;
        
    }

    
}
