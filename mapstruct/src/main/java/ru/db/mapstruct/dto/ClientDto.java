package ru.db.mapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.db.mapstruct.domain.Avatar;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    private long id;

    private Set<Avatar> avatars;
}
