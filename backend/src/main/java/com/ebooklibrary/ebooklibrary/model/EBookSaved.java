package com.ebooklibrary.ebooklibrary.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ebooks_saved")
public class EBookSaved {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "ebook_id")
    EBook ebook;

    @Column
    private int progress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public EBook getEbook() {
        return ebook;
    }

    public void setEbook(EBook ebook) {
        this.ebook = ebook;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
