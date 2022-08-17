package com.daleel.dao;

import com.daleel.model.Document;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("FakeDao")
public class DocumentFakeDataAccess implements DocumentDao{
    private static List<Document> DB = new ArrayList<>();
    @Override
    public int insertDocument(UUID id, Document document) {
        System.out.println(document.getID());
        DB.add(new Document(id,document.getName()));
        return 1;
    }
    @Override
    public Document getDocumentById (UUID id){
        return DB.stream().filter(x -> x.id ==  id).findAny().orElse(null);
    }
    @Override
    public List<Document> SelectAllDocument(){
        return DB;
    }
}