package com.demoProject.Project.Entities.CategoryRelatedEntity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String categoryName;
    private Long parentId;
//    @OneToMany(mappedBy = "category")
//    List<CategoryMetaDataFieldValues> categoryMetaDataFieldValues;
}
