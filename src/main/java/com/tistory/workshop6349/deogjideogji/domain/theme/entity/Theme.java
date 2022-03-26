package com.tistory.workshop6349.deogjideogji.domain.theme.entity;

import com.tistory.workshop6349.deogjideogji.global.domain.Author;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import java.sql.Blob;

@Entity
public class Theme {

    @EmbeddedId
    private Author author;

    @Lob
    private Blob photo;

}
