package com.company.example.Library;

import com.company.example.Library.Controller.BookController;
import com.company.example.Library.Controller.UserController;
import com.company.example.Library.Model.User;



public class LibraryMain {

    private UserController userController;
    public LibraryMain() {
        userController = new UserController();
        run();
        new BookController();

    }

    public void run() {
        User user1 = new User();

        userController.addUser(user1);
        userController.showUsers();
/* ---------------------------------------Add Book-------------------------------------------*/

       // bookController.addBook();


        /*
        Db.books.forEach(book -> {

            System.out.println("Yazar id : " + book.getAuthorId());
            System.out.println("Kitap id : " + book.getId());
            System.out.println("Name : " + book.getName());
        });
        */


       // bookController.showBook();

      // new BookController();



    }
}
