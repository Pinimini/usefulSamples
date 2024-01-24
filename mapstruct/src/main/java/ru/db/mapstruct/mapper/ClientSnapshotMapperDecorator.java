package ru.db.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.db.mapstruct.domain.Avatar;
import ru.db.mapstruct.domain.ClientSnapshotDto;

public abstract class ClientSnapshotMapperDecorator extends ClientSnapshotMapper {


    private final ClientSnapshotMapper delegate;

    public ClientSnapshotMapperDecorator(ClientSnapshotMapper delegate) {
        this.delegate = delegate;
    }

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "avatarId", source = "avatar.id")
    @Override
    public ClientSnapshotDto toClientSnapshotDto(Avatar avatar) {
        ClientSnapshotDto clientSnapshotDto = delegate.toClientSnapshotDto(avatar);
        clientSnapshotDto.setId(14444);
        return clientSnapshotDto;
    }

}
