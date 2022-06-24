--liquibase formatted sql
--changeset weiling:02
--comment: add COLUMN users


ALTER TABLE users ADD COLUMN user_name varchar(10) AFTER user_id;
