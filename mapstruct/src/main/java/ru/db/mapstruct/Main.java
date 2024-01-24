package ru.db.mapstruct;

import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import ru.db.mapstruct.domain.Avatar;
import ru.db.mapstruct.domain.NickName;
import ru.db.mapstruct.dto.AvatarDto;
import ru.db.mapstruct.mapper.AvatarMapper;


@Slf4j
public class Main {
    public static void main(String[] args) {
        AvatarMapper avatarMapper = Mappers.getMapper(AvatarMapper.class);
        NickName nickName = NickName.builder()
                .id(444)
                .build();
        Avatar avatar = Avatar.builder()
                .id(2)
                .nickName(nickName)
                .build();
        AvatarDto avatarDto = avatarMapper.toAvatarDto(avatar);

        log.info("дтошка: {}", avatarDto);

    }
}