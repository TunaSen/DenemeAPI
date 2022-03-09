package com.example.FishingAPI_SQLite.Entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Person")
@EqualsAndHashCode(of = {"id"})
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mail")
    private String mail;

    @Column(name = "password")
    private String password;

    @Column(name = "tel_no")
    private String tel_no;


    @Column(name = "catagories")
    private String catagories;

    @Column(name = "ip")
    private String ip;

    @Column(name = "location")
    private String location;
}
