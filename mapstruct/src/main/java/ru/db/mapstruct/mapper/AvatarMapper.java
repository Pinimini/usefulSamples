package ru.db.mapstruct.mapper;

import org.mapstruct.*;
import ru.db.mapstruct.domain.Avatar;
import ru.db.mapstruct.domain.ClientSnapshotDto;
import ru.db.mapstruct.dto.AvatarDto;

@Mapper(uses = ClientSnapshotMapper.class)

public abstract class AvatarMapper {

    @BeforeMapping
    protected void enrichDTOWithFuelType(Avatar avatar, @MappingTarget AvatarDto avatarDto) {
        if (avatar.getId() > 10) {
            avatarDto.setType("Длинный");
        } else {
            avatarDto.setType("Короткий");
        }
    }

    @Mapping(target = "clientSnapshotDto", source = "avatar")
    @Mapping(target = "type", ignore = true)
    @Mapping(target = "type2", ignore = true)
    public abstract AvatarDto toAvatarDto(Avatar avatar);

}
