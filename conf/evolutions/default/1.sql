# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ambiente (
  id                        bigint auto_increment not null,
  time_id                   bigint,
  label                     varchar(255),
  constraint pk_ambiente primary key (id))
;

create table log (
  id                        bigint auto_increment not null,
  time_id                   bigint,
  ambiente_id               bigint,
  log_date                  datetime,
  acao                      varchar(255),
  constraint pk_log primary key (id))
;

create table time (
  id                        bigint auto_increment not null,
  nome                      varchar(255),
  constraint pk_time primary key (id))
;

alter table ambiente add constraint fk_ambiente_time_1 foreign key (time_id) references time (id) on delete restrict on update restrict;
create index ix_ambiente_time_1 on ambiente (time_id);
alter table log add constraint fk_log_time_2 foreign key (time_id) references time (id) on delete restrict on update restrict;
create index ix_log_time_2 on log (time_id);
alter table log add constraint fk_log_ambiente_3 foreign key (ambiente_id) references ambiente (id) on delete restrict on update restrict;
create index ix_log_ambiente_3 on log (ambiente_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table ambiente;

drop table log;

drop table time;

SET FOREIGN_KEY_CHECKS=1;

