class BookNode {
    String title;
    String author;
    String genre;
    int bookID;
    boolean isAvailable;
    BookNode next, prev;

    BookNode(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
    }
}

class Library {
    BookNode head, tail;

    // Add book at beginning
    void addAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
        BookNode node = new BookNode(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // Add book at end
    void addAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
        BookNode node = new BookNode(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    // Add at specific position
    void addAtPosition(String title, String author, String genre, int bookID, boolean isAvailable, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(title, author, genre, bookID, isAvailable);
            return;
        }
        BookNode node = new BookNode(title, author, genre, bookID, isAvailable);
        BookNode current = head;
        for (int i = 1; i < pos - 1 && current.next != null; i++) {
            current = current.next;
        }
        node.next = current.next;
        if (current.next != null) {
            current.next.prev = node;
        } else {
            tail = node;
        }
        node.prev = current;
        current.next = node;
    }

    // Remove book by ID
    void removeByID(int bookID) {
        if (head == null) return;

        BookNode current = head;

        while (current != null && current.bookID != bookID) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Book ID " + bookID + " not found.");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Search by Title
    void searchByTitle(String title) {
        BookNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                printBook(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }

    // Search by Author
    void searchByAuthor(String author) {
        BookNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.author.equalsIgnoreCase(author)) {
                printBook(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No book found by author: " + author);
        }
    }

    // Update Availability
    void updateAvailability(int bookID, boolean isAvailable) {
        BookNode current = head;
        while (current != null) {
            if (current.bookID == bookID) {
                current.isAvailable = isAvailable;
                return;
            }
            current = current.next;
        }
        System.out.println("Book ID " + bookID + " not found.");
    }

    // Display forward
    void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        BookNode current = head;
        while (current != null) {
            printBook(current);
            current = current.next;
        }
    }

    // Display reverse
    void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }
        BookNode current = tail;
        while (current != null) {
            printBook(current);
            current = current.prev;
        }
    }

    // Count books
    int countBooks() {
        int count = 0;
        BookNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Utility to print book details
    void printBook(BookNode book) {
        System.out.println(book.bookID + " -> " + book.title + " by " + book.author + " | Genre: " + book.genre +
                " | Available: " + (book.isAvailable ? "Yes" : "No"));
    }
}