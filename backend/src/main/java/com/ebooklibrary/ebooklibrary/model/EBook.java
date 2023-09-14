package com.ebooklibrary.ebooklibrary.model;

import java.util.OptionalDouble;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "ebooks")
public class EBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "ebook")
    Set<EBookRating> ratings;

    @OneToMany(mappedBy = "ebook")
    Set<EBookSaved> savedEBooks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<EBookRating> getRatings() {
        return ratings;
    }

    public void setRatings(Set<EBookRating> ratings) {
        this.ratings = ratings;
    }

    public Set<EBookSaved> getSavedEBooks() {
        return savedEBooks;
    }

    public void setSavedEBooks(Set<EBookSaved> savedEBooks) {
        this.savedEBooks = savedEBooks;
    }

    public double getAverageRating() {
        OptionalDouble average = this.ratings
            .stream()
            .mapToDouble(a -> a.getRating())
            .average();
        return average.isPresent() ? average.getAsDouble() : 0; 
    }
}
