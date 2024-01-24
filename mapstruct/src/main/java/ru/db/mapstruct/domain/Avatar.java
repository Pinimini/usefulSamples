package ru.db.mapstruct.domain;

import lombok.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Avatar {
    private long id;

    private Client client;

    private NickName nickName;


}
