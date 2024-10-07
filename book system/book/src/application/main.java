package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Book;
import entities.Library;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // SISTEMA DE VERIFICAÇÃO PARA ADIÇÃO E EMPRÉSTIMO DE LIVROS 
        Library library = new Library();

        //// criação de scanner para encontrar livro da biblioteca
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while(option != 5) {
            System.out.println("\nSelect the opition based on your MENU:\n1. Add book\n2. Display the book informations for search\n3. Loan a book\n4. Return a book\n5. Exit the system\n");
            option = sc.nextInt();
            switch (option) {
                case 1: 
                    int id;
                    String title;
                    // buffer para continuação de Scanner
                    sc = new Scanner(System.in);
                    System.out.println("Add the TITLE of the book: ");
                    title = sc.nextLine();

                    String author;
                    System.out.println("\nAdd the AUTHOR of the book: ");
                    author = sc.nextLine();

                    System.out.println("\nCreate a ID with 4 numbers for the book: ");
                    id = sc.nextInt();
                    
                    Book book = new Book(id,title,author);
                    library.addBook(book);
                break;

                case 2:
                    library.displayCurrentBook(); 
                break;

                case 3: 
                    library.loanBook();
                break;

                case 4:
                    library.returnBook();
                break;

                case 5: 
                    System.out.println("\nThanks to acess our Libary :)");
                break;

            }
        }
        sc.close();
    }

}
