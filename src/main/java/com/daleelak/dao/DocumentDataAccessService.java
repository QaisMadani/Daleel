package com.daleelak.dao;

import com.daleelak.model.Document;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("postgres")
public class DocumentDataAccessService implements DocumentDao{

    @Override
    public int insertDocument(UUID id, Document document) {
        return 0;
    }
    @Override
    public Document getDocumentById (UUID id) {
        return null;
    }
    @Override
    public List<Document> SelectAllDocument() {
        return null;
    }
}
