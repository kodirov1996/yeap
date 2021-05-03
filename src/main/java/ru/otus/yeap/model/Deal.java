package ru.otus.yeap.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "deals")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    Long id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<DealDetail> dealDetailList;
}
