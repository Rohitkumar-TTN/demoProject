package com.demoProject.Project.Entities.CategoryRelatedEntity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CategoryMetaDataFieldValues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="category_Id")
    private Category category;
    @ManyToOne
    @JoinColumn(name="categoryMeta_Id")
    private CategoryMetaDataField categoryMetaDataField;
    private String values;
}
