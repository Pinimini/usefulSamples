package ru.db.mapstruct.domain;

import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private long id;

    private Set<Avatar> avatars;
}
