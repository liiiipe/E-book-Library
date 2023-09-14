package com.ebooklibrary.ebooklibrary.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user")
    Set<EBookSaved> savedEBooks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<EBookSaved> getSavedEBooks() {
        return savedEBooks;
    }

    public void setSavedEBooks(Set<EBookSaved> savedEBooks) {
        this.savedEBooks = savedEBooks;
    }

    public void saveEBook(EBookSaved eBook) {
        this.savedEBooks.add(eBook);
    }
  
    public void removeSavedEBook(EBookSaved eBook) {
        this.savedEBooks.remove(eBook);
    }
}
