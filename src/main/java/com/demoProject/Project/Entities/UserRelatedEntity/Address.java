package com.demoProject.Project.Entities.UserRelatedEntity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long address_Id;
    private String city;
    private String state;
    private String address_Line;
    private Long zip_code;
//    @ManyToOne
//    @JoinColumn(name="user_id")
//    private User user;
}
