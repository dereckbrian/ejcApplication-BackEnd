package com.saosebastiao.escontroEJC.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "recados")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String menssagem;
    private String emoji;
}
