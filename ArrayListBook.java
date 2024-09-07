/**
 * Java Program to store & display User-defined Objects in Collections
 */

package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBook {
    public static void main(String[] args) {
        //Creating Books  object & initialized using Book Constructor
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        //Create List of Books
        List<Book> bookList = new ArrayList<>();

        //Add book objects to list
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);

        System.out.println("*********************** Book List **************************");
        for (Book i : bookList){
            System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
        }

        System.out.println("The Total no. of books is : "+bookList.size());

        String pub = "Wiley";
        for(Book i: bookList){
            if(i.getPublisher().equalsIgnoreCase(pub))
                System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
        }
    }
}

