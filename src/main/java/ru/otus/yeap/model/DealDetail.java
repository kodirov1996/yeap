package ru.otus.yeap.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "deal_details")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DealDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    Long id;
    @ToString.Exclude
    @ManyToOne
    Deal deal;
}
