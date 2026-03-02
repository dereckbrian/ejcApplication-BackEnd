package com.saosebastiao.escontroEJC.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "OqueAchouVideo")
public class OqueAchouVideo {

    @Id
    private Long id = 1L;

    private int ameiCount = 0;
    private int rachoCount = 0;
    private int abencoadoCount = 0;
    private int topCount = 0;
}
