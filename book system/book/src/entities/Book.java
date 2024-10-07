package entities;

public class Book {
    // definição de variáveis
    public int id;
    public String title;
    public String author;
    public boolean isAvailable = true;

    // definição do construtor da classe
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.printf("\nIs this the book you want?\nid: %d\nTitle: %s\nAuthor: %s\n", id, title, author);
    } 

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        // criação de condição que verifica se o livro está disponível ou não
       return isAvailable;
    }

    public void loanBook() {
        if (isAvailable == true) {
           System.out.println("You will have the book on loan for 10 days :)");
            isAvailable = false;
        }
        else {
           System.out.println("LOANED, the book isn't available :( Please try again in a few days");
        }
    }

    // criação de método responsável por gerar data de devolução do livro
    public void returnBook() {
        if (isAvailable == false) {
            System.out.println("Thanks for returning the book, now you can borrow another one :)");
            isAvailable = true;
        }
        else {
            System.out.println("THE BOOK IS ALREADY AVAILABLE, Please check if you type the right credentials");
        }
    }

}
