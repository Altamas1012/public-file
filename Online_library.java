
import java.util.Scanner;

class library {

    String books[] = new String[100];

    int countBook = 0;

    public void menu() {
        System.out.println("--online lybrary Enter your choice:--");
        System.out.println("1. Added the book ");
        System.out.println("2. Take the book");
        System.out.println("3. Return the book");
        System.out.println("4. show avalbale book ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            addedBook();

        } else if (opt == 2) {
            TakeBook();

        } else if (opt == 3) {
            ReturnBook();

        } else if (opt == 4) {
            ShowBook();
        } else {
            System.out.println("a valid choice");
            menu();
        }

    }

    public void addedBook() {

        System.out.println("Enter your book name just added:");
        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();

        books[countBook] = book;
        countBook++;

        System.out.println("your book added succesfull: " + book);
        menu();
    }

    public void TakeBook() {
        System.out.println("Enter your choice take book:");
        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();
        for (int i = 0; i < countBook; i++) {
            if (books[i].equalsIgnoreCase(book)) 
            {
                System.out.println("book taken succes fully");
               books[i]= books[countBook -1] ;
               books[countBook-1]=null;
               countBook--;
                menu();
                return;
            }

        }

        System.out.println("book is not avalabal");
    }

    public void ReturnBook() {
        System.out.println("Enter your book Return:");
        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();

        books[countBook] = book;
        countBook++;

        System.out.println("Return book succesfull");
        menu();
    }

    public void ShowBook() {

        if (countBook == 0) {
            System.out.println("Library Empty");
          } 
          else {
            System.out.println("Available books in library:");
            for (int i = 0; i < countBook; i++) {
                if (books[i] != null) {
                    System.out.println("-> " + books[i]);
                }
                
            }
        }

        menu();

    }

}

public class Online_library {

    public static void main(String[] args) {
        library obj = new library();
        obj.menu();

    }

}
