package com.daleelak.dao;

import java.util.List;
import java.util.UUID;

import com.daleelak.model.Document;

import javax.print.Doc;

public interface DocumentDao {

    int insertDocument(UUID id, Document document);
    default int insertDocument(Document document){
            UUID id = UUID.randomUUID();
            return insertDocument(id,document);
    }
    Document getDocumentById (UUID id);
    List<Document> SelectAllDocument();
}
