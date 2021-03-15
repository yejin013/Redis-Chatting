package com.example.redischatting.entity;

import lombok.*;
import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
    private Long id;

    @Column(unique = true)
    private String userID;
    private String username;
    private String password;
}
