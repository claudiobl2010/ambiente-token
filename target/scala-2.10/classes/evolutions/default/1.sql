# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ambiente (
  id                        bigint auto_increment not null,
  label                     varchar(255),
  constraint pk_ambiente primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table ambiente;

SET FOREIGN_KEY_CHECKS=1;

