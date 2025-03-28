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
@PrimaryKeyJoinColumn(name="customer_Id")
public class Customer extends User {
    private String address;
    private String phoneNumber;

}
