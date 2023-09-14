package com.ebooklibrary.ebooklibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebooklibrary.ebooklibrary.model.EBook;
import com.ebooklibrary.ebooklibrary.service.EBookService;

@RestController
@RequestMapping("/api/ebooks")
public class EBookController {
    @Autowired
    private EBookService eBookService;

    @GetMapping
    public List<EBook> getAllEBooks() {
        return eBookService.index();
    }

    @GetMapping("/{id}")
    public EBook getUserById(@PathVariable Long id) {
        return eBookService.getById(id);
    }

    @PostMapping
    public EBook createEBook(@RequestBody EBook eBook) {
        return eBookService.create(eBook);
    }

    @DeleteMapping("/{id}")
    public String deleteEBook(@PathVariable Long id) {
        try {
            eBookService.delete(id);
            return "User deleted successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
