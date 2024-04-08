package com.application.restfull.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Collation("Document")
public class Document extends AuditoriaDocument{
    @Field
    private String name;

    @Field
    private String category;

    @Field
    private Byte document;
}
