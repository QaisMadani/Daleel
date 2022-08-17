package com.daleel.service;
import com.daleel.model.Document;
import com.daleel.dao.DocumentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DocumentService {
    private final DocumentDao documentDao;
    @Autowired
    public DocumentService(@Qualifier("postgres") DocumentDao documentDao){
        this.documentDao = documentDao;
    }
    public int addDocument(Document document){
        return documentDao.insertDocument(document);
    }
    public Document getDocumentById (UUID id){
        return documentDao.getDocumentById(id);
    }
    public List<Document> getAllDocuments(){
        return documentDao.SelectAllDocument();
    }
}
