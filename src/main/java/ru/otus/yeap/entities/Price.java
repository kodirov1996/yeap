package ru.otus.yeap.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "products")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    Long id;
    @ManyToOne
    Product product;
    @ManyToOne
    Portion portion;
    Double price;
}
