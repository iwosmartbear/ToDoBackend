package com.iwo.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoListApplication {

    public static void main(String[] args) {

        SpringApplication.run(ToDoListApplication.class, args);
    }

}
//CONTROLLER
// to endpointy - ma być prosty, co najwyżej autoryzacja i pchamy to do service
//------------------------------------------------------------------------
// SERVICE
// Tutaj jest logika odpowiadająca temu, co mamy w zadaniu konkretne funkcje, tutaj możemy łączyć się z innymi serwisami, do wykonania zadań
//W servisie mapujemy sobie mapę na obiekt z modelu
//obsługa błędów w try catch
//Jackson databind do obsługi jsona w javie
//------------------------------------------------------------------------
// REPOSITORY
//To służy do kontaktowania się z bazą danych
//------------------------------------------------------------------------
//MODEL
//definiujemy sobie tutaj modele (DTO)