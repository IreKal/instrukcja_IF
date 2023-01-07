package com.example.instrukcja_if;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        int a,b,c;
        a = 2;
        b = 3;
        if(a<b)
            System.out.println("a jest mniejsze od b");
        if(a==b)
            System.out.println("a jest rowne b");
        c = a - b;
        System.out.println("c jest - 1");
        if(c>=0) System.out.println("c nie jest ujemne");
        if(c<0) System.out.println("c jest ujemne");

        c = b - a;
        System.out.println("c jest + 1");
        if(c>=0) System.out.println("c nie jest ujemne ");
        if(c<=0) System.out.println("c jest ujemne ");


    }
}