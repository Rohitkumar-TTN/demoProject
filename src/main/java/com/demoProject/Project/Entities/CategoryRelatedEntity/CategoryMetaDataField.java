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
public class CategoryMetaDataField {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long metaDataId;
    private String name;
//    @OneToMany(mappedBy = "categoryMetaDataField")
//    List<CategoryMetaDataFieldValues> categoryMetaDataFieldValues;
}
