package com.dalgona.demo.domain.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
    @Getter
    @Setter
    @Entity
    @Table(name = "board")
    public class DemoEntity extends TimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Builder
    public DemoEntity(Long id, String title, String content, String writer) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
    }


    public static DemoEntity builder() {
        return builder();
    }




}

