package com.company.example.Library.Controller;

import com.company.example.Library.Model.Book;
import com.company.example.Library.Db.Db;

import java.util.Scanner;


public class BookController {

    public BookController(){
        int opt=0;
        do {
            opt = showBook();
            switch (opt){
                case 1:
                    listBook();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    removeBook();
                    break;
            }

        }while (opt!=4);

    }

    public int showBook() {

            System.out.println("1-Kitaplari Listele = " );
            System.out.println("2-Kitap ekle = " );
            System.out.println("3-Kitap sil = ");
            //System.out.println("4-Kitap guncelle = ");

        System.out.println("Seciniz...");
        Scanner input = new Scanner(System.in);
        int opt = input.nextInt();
        return opt;
    }

    public void listBook() {
        Db.books.forEach(book -> {
            System.out.println("Yazar ID = " + book.getAuthorId());
            System.out.println("Kitap ID = " + book.getId());
            System.out.println("Kitap Adi = " + book.getName());
        });


    }
    public void addBook() {

        Scanner input = new Scanner(System.in);
        System.out.println("Kitap adi : ");
        String bookname = input.nextLine();

        Book book1 = new Book(bookname);

        Db.books.add(book1);

    }



    public  void removeBook( ){
        Scanner input = new Scanner(System.in);
        System.out.println("Silmek istediginiz kitabin adini giriniz : ");
        String bookname = input.nextLine();
        boolean flag = false;
        int tmp = 0;
        for(int i=0;i<Db.books.size();i++){
            if(bookname.equals(Db.books.get(i).getName())){
                flag = true;
                break;
            }
        }
        if(flag){
            Db.books.remove(tmp);

        }

    }

   /* public void updatebook(){


        }*/


}
