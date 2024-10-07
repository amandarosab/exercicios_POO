package entities;
public class Library {
    private Book book;

    // metodo para adicionar novo livro a biblioteca
    public void addBook(Book book) {
        this.book = book;
        System.out.println("Book added to the library.");
    }

    // metodo para mostrar detalhes do livo verificado
    public void displayCurrentBook() {
        if (book != null) {
            book.displayBookDetails();
        } 
        else {
            System.out.println("This book doesn't exits on the library system :(");
        }
    }

    // metodo para realização de empréstimo do livro verificado
    public void loanBook() {
        if (book != null) {
            book.loanBook();
        } 
        else {
            System.out.println("This book doesn't exits on the library system :(");
        }
    }

    // metodo para devolução de livro
    public void returnBook() {
        if (book != null) {
            book.returnBook();
        } 
        else {
            System.out.println("This book doesn't exits on the library system :(");
        }
    }
}    