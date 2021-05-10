package ru.otus.yeap.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "portions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Portion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    Long id;
    @ManyToOne
    Category category;
    String name;
}
