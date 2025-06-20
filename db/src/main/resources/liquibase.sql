create table avatar (
                        client_id bigint,
                        id bigserial not null,
                        primary key (id)
);
create table client (
                        id bigserial not null,
                        primary key (id),
                        name int
);
create table nickname (
                          avatar_id bigint unique,
                          client_id bigint unique,
                          id bigserial not null,
                          primary key (id)
);
alter table if exists avatar
    add constraint FK6k7asp6kriv0109vq20os5f01
        foreign key (client_id)
            references client;
alter table if exists nickname
    add constraint FKd3gwgerp4x1axp58r8ms4a41b
        foreign key (avatar_id)
            references avatar;
alter table if exists nickname
    add constraint FKa8mbtx1knj1wy1uemhrey0aju
        foreign key (client_id)
            references client;
