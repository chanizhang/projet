create table users
(
    id bigint auto_increment,
    constraint users_pk
        primary key (id),
    animal TEXT not null,
    amount int null,
    food TEXT not null,
    stock int null,
    source TEXT not null,

);
