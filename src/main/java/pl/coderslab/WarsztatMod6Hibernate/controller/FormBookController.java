package pl.coderslab.WarsztatMod6Hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.WarsztatMod6Hibernate.model.Book;
import pl.coderslab.WarsztatMod6Hibernate.model.BookService;

@Controller
@RequestMapping("/formBooks")
public class FormBookController {

    private final BookService bookService;

    public FormBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path = "/showAllBooks")
    public String showAllBooks(Model model){
        model.addAttribute("allBooks", bookService.getAllBooks());
        return "/allBooks";
    }

    //add block
    @GetMapping(path = "/addBook")
    public String initiateAddBook(Model model){
        model.addAttribute("headerMessage", "Dodaj nową książkę");
        model.addAttribute("disabledParam", "false");
        model.addAttribute("buttonClass", "btn-success");
        model.addAttribute("book", new Book());
        return "/formBook";
    }
    @PostMapping(path = "/addBook")
    public String processAddBook(Book book){
        bookService.addBook(book);
        return "redirect:/formBooks/showAllBooks";
    }

    //edit block
    @GetMapping(path = "/editBook/{id}")
    public String initiateEditBook(Model model, @PathVariable long id){
        model.addAttribute("headerMessage", "Edytuj książkę");
        model.addAttribute("disabledParam", "false");
        model.addAttribute("buttonClass", "btn-warning");
        model.addAttribute("book", bookService.getBook(id));
        return "/formBook";
    }
    @PostMapping(path = "/editBook/{id}")
    public String processEditBook(Book book){
        bookService.updateBook(book);
        return "redirect:/formBooks/showAllBooks";
    }

    //delete block
    @GetMapping(path = "/deleteBook/{id}")
    public String initiateDeleteBook(Model model, @PathVariable long id){
        model.addAttribute("headerMessage", "Potwierdź usunięcie książki");
        model.addAttribute("disabledParam", "true");
        model.addAttribute("buttonClass", "btn-danger");
        model.addAttribute("book", bookService.getBook(id));
        return "/formBook";
    }
    @PostMapping(path = "/deleteBook/{id}")
    public String processDeleteBook(Book book){
        bookService.removeBook(book);
        return "redirect:/formBooks/showAllBooks";
    }
}
