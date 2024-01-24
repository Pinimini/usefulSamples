package ru.db.mapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.db.mapstruct.domain.ClientSnapshotDto;
import ru.db.mapstruct.domain.NickName;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvatarDto {
    private long id;

    private String type;
    private String type2;

    private ClientSnapshotDto clientSnapshotDto;

    private NickName nickName;

}
