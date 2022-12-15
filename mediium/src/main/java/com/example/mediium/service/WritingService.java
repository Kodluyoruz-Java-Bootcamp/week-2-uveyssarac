package com.example.mediium.service;

import com.example.mediium.dao.WritingDao;
import com.example.mediium.model.Writing;

import java.util.List;

public class WritingService {
    private WritingDao writingDao = new WritingDao();

    public void createWriting(Writing writing) {

        writingDao.createWriting(writing);
    }

    public List<Writing> getAllWritings() {
        return writingDao.findAllWritings();
    }

    public void printAll() {
        getAllWritings().forEach(writing -> System.out.println(writing.toString()));
    }
}
