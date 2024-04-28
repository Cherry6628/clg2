class Media {
    String title;
    double price;

    Media(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class Book extends Media {
    int pages;

    Book(String title, double price, int pages) {
        super(title, price);
        this.pages = pages;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Pages: " + pages);
    }
}

class Tape extends Media {
    float time;

    Tape(String title, double price, float time) {
        super(title, price);
        this.time = time;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Time: " + time);
    }
}

public class Farm {
    public static void main(String[] args) {
        Media media = new Media("Media Title", 9.99);
        media.display();

        Book book = new Book("Book Title", 19.99, 200);
        book.display();

        Tape tape = new Tape("Tape Title", 29.99, 120.5f);
        tape.display();
    }
}
