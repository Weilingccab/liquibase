--liquibase formatted sql
--changeset weiling:dev1 context:dev
--comment: insert dev  user id


insert into users (id, user_id, user_name)
VALUES ('0000', 'dev','devname');

