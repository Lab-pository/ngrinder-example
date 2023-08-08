drop table if exists DOG;
drop table if exists CAT;

create table if not exists CAT
(
    id bigint auto_increment not null,
    name varchar(255) not null,
    age int not null,
    primary key(id)
);

create table if not exists DOG
(
    id bigint auto_increment not null,
    name varchar(255) not null,
    age int not null,
    primary key(id)
);
