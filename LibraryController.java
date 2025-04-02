package Library;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/library")
public class LibraryController {
    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }
    

    @PostMapping("/issue/{bookId}")
    public String issueBook(@PathVariable String bookId) {
        return libraryService.issueBook(bookId);
    }

    @PostMapping("/return/{bookId}")
    public String returnBook(@PathVariable String bookId) {
        return libraryService.returnBook(bookId);
    }
}