package com.tistory.workshop6349.deogjideogji.domain.post.entity;

import com.tistory.workshop6349.deogjideogji.domain.post.type.Font;
import com.tistory.workshop6349.deogjideogji.global.domain.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor @NoArgsConstructor
@Builder
@Entity
public class Post {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Author author;

    @NotNull
    private String content;

    @Column(columnDefinition = "varchar(255) default 'FFB400'") // 기본값: 노랑색
    private String color; // 16 진수로 나타낼 수 있음

    @Enumerated(EnumType.STRING)
    private Font font;

    @Column(columnDefinition = "boolean default false")
    private boolean shared;

}
