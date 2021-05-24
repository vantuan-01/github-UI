package sample.controller;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.List;

public class ListBook {
     int id;
     String Name;
     String Author;
     int Available;

    public ListBook(int id, String name, String author, int available) {
        this.id = id;
        this.Name = name;
        this.Author = author;
        this.Available = available;
    }

    public ListBook() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id =  id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getAvailable() {
        return Available;
    }

    public void setAvailable(int available) {
        Available = available;
    }
}
