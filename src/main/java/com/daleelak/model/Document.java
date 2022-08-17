package com.daleelak.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.print.attribute.standard.DocumentName;
import java.util.UUID;
public class Document {

    public final String name;
    public final UUID id; // uu universal unique

    public Document(@JsonProperty("id") UUID id,
                    @JsonProperty("name") String name){
        this.id =  id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getID() {
        return id;
    }
}
