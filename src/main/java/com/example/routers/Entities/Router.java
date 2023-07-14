package com.example.routers.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Router implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idRouter ;
    private String description ;
    @Enumerated(EnumType.STRING)
    private  Model model ;
    @Enumerated(EnumType.STRING)
    private  Status status ;
    @OneToMany(mappedBy="router", cascade=CascadeType.ALL)
    private Set<Rental> rentals ;

}
