--liquibase formatted sql
--changeset weiling:local1 context:local
--comment: insert local  user id

insert into users (id, user_id, user_name)
VALUES ('0001', 'local','localname');
