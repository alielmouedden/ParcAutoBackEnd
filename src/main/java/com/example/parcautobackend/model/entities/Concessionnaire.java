package com.example.parcautobackend.model.entities;

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
public class Concessionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConcessionnaire;
    private String nomConcessionnaire;
    private String adresseConcessionnaire;
    private String telConcessionnaire;
    private String gsmConcessionnaire;
    private String faxConcessionnaire;
    private String email;

}
