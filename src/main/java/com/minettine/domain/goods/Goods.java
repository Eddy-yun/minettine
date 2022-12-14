package com.minettine.domain.goods;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Goods {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

}
