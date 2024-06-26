package com.example.parcautobackend.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Compagnie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompagnie;
    private String nomCompagnie;
    private String adresseCompagnie;
    private String telCompagnie;
    private String emailCompagnie;
    private String faxCompagnie;
    private String nomResponsableC;
    private String gsmResponsableC;

}
