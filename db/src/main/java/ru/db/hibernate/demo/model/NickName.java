package ru.db.hibernate.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
@Table(name = "nickname")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class NickName implements JpaRepository<NickName, Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne
    @JoinColumn(name = "avatar_id")
    private Avatar avatar;

}
