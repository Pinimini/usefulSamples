package ru.db.mapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.db.mapstruct.domain.Avatar;
import ru.db.mapstruct.domain.Client;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NickNameDto {
    private long id;

    private Client client;

    private Avatar avatar;

}
