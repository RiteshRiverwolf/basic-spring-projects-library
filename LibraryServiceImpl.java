package Library;

import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;

@Service
public class LibraryServiceImpl implements LibraryService {
    private final Set<String> issuedBooks = new HashSet<>();
    
    @Override
    public void issueBook(String bookId) { 
        if (issuedBooks.contains(bookId)) {
            System.out.println("Book " + bookId + " is already issued.");
        } else {
            issuedBooks.add(bookId);
            System.out.println("Book " + bookId + " issued successfully.");
        }
    }
    @Override
    public void returnBook(String bookId) {
        if (issuedBooks.contains(bookId)) {
            issuedBooks.remove(bookId);
            System.out.println("Book " + bookId + " returned successfully.");
        } else {
            System.out.println("Book " + bookId + " was not issued.");
        }
    }
}
