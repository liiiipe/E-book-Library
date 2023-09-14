package com.ebooklibrary.ebooklibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebooklibrary.ebooklibrary.model.EBook;
import com.ebooklibrary.ebooklibrary.repository.EBookRepository;

@Service
public class EBookService {
    @Autowired
    private EBookRepository eBookRepository;

    public List<EBook> index() {
        return eBookRepository.findAll();
    }

    public EBook getById(Long id) {
        return eBookRepository.findById(id).get();
    }

    public EBook create(EBook eBook) {
        return eBookRepository.save(eBook);
    }

    public void delete(Long id) throws Exception {
        if (eBookRepository.findById(id).isEmpty()) {
            throw new Exception("EBook not found");
        }
        eBookRepository.deleteById(id);
    }
}
