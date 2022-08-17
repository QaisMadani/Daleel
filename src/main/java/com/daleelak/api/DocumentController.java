package com.daleelak.api;

import com.daleelak.model.Document;
import com.daleelak.service.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/document")
@RestController
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }
@PostMapping
    public void addDocument(@RequestBody Document document){
        documentService.addDocument(document);
    }
@GetMapping
    public List<Document> getAllDocuments(){
        return documentService.getAllDocuments();
    }
@GetMapping (path= "{id}")
    public Document getDocumentById (UUID id){ return documentService.getDocumentById(id);
    }

}
