package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;


public class Editbook implements Initializable {

    @FXML
    private VBox pnItem = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Node[] nodes = new Node[10];
        for(int i = 0; i < nodes.length; i++){
            try{
                nodes[i] = (Node)FXMLLoader.load(getClass().getResource("/sample/view/Item.fxml"));
                pnItem.getChildren().add(nodes[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


















/*public class Editbook implements Initializable {
    @FXML
    private TableView<ListBook> table;

    @FXML
    private TableColumn<ListBook, Integer> id;

    @FXML
    private TableColumn<ListBook, String> name;

    @FXML
    private TableColumn<ListBook, String> author;

    @FXML
    private TableColumn<ListBook, Integer> available;


    ObservableList<ListBook> book = book = FXCollections.observableArrayList(
            new ListBook(1,"MachineGun", "Anh tăng", 1)
    );
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        id.setCellValueFactory(new PropertyValueFactory<ListBook, Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<ListBook, String>("name"));
        author.setCellValueFactory(new PropertyValueFactory<ListBook, String>("author"));
        available.setCellValueFactory(new PropertyValueFactory<ListBook, Integer>("available"));
        table.setItems(book);
    }
    @FXML
    private TextField idText;
    @FXML
    private TextField nameText;
    @FXML
    private TextField authorText;
    @FXML
    private TextField availableText;
    @FXML
    public void add (ActionEvent event){
        ListBook newBook = new ListBook();
        newBook.setId(Integer.parseInt(idText.getText()));
        newBook.setName(nameText.getText());
        newBook.setAuthor(authorText.getText());
        newBook.setAvailable(Integer.parseInt(availableText.getText()));
        book.add(newBook);
    }

    public void del(ActionEvent event){
        ListBook selected = table.getSelectionModel().getSelectedItem();
        book.remove(selected);
    }
    private int index;
    @FXML
    void getSelected (MouseEvent event){
        index = table.getSelectionModel().getSelectedIndex();
        if (index <= -1){
            return;
        }
        idText.setText(id.getCellData(index).toString());
        nameText.setText(name.getCellData(index).toString());
        authorText.setText(author.getCellData(index).toString());
        availableText.setText(available.getCellData(index).toString());
    }
    @FXML
    public void update(ActionEvent event){
       ListBook upda = table.getSelectionModel().getSelectedItem();
       ListBook updabook = new ListBook();
        updabook.setId(Integer.parseInt(idText.getText()));
        updabook.setName(nameText.getText());
        updabook.setAuthor(authorText.getText());
        updabook.setAvailable(Integer.parseInt(availableText.getText()));
        book.remove(upda);
        book.add(updabook);
    }
}*/

