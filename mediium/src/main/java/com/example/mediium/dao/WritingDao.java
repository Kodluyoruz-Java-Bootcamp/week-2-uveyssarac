package com.example.mediium.dao;

import com.example.mediium.model.Writing;

import java.util.ArrayList;
import java.util.List;

public class WritingDao {
    private static List<Writing> writingList=new ArrayList<Writing>();

    public void createWriting(Writing writing){
        writingList.add(writing);
    }
    public List<Writing> findAllWritings(){
        return writingList;
    }
}
