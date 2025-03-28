package com.demoProject.Project.Entities.UserRelatedEntity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long roleId;
    @NotBlank
    private String authority;
    @ManyToMany
    @JoinTable(name = "User_Role",joinColumns=@JoinColumn(name="role_Id"),
    inverseJoinColumns = @JoinColumn(name="user_Id"))
    private List<User> user;
}
