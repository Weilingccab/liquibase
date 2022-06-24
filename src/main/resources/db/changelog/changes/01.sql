--liquibase formatted sql
--changeset weiling:01
--comment: create table users


CREATE TABLE `users`
(
    `id`         varchar(45)   NOT NULL,
    `user_id`    varchar(45)   DEFAULT NULL,
    PRIMARY KEY (`id`)
  );