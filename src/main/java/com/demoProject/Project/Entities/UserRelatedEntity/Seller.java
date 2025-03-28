package com.demoProject.Project.Entities.UserRelatedEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@PrimaryKeyJoinColumn(name="seller_Id")
public class Seller extends User {
    private String gst;
    private String companyName;
    private String contactNumber;
}
