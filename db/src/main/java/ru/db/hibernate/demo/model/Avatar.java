package ru.db.hibernate.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "avatar")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Avatar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne(mappedBy = "avatar", cascade = CascadeType.ALL, orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private NickName nickName;


}
