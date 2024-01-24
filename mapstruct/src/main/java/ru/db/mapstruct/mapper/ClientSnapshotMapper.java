package ru.db.mapstruct.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.db.mapstruct.domain.Avatar;
import ru.db.mapstruct.domain.ClientSnapshotDto;

@Mapper
@DecoratedWith(ClientSnapshotMapperDecorator.class)
public abstract class ClientSnapshotMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "avatarId", source = "avatar.id")
    public abstract ClientSnapshotDto toClientSnapshotDto(Avatar avatar);

}
