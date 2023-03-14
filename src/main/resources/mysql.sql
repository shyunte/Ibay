use study;


drop table board;

create table board(
                      board_id int NOT NULL AUTO_INCREMENT  primary key,
                      board_name varchar(20),
                      board_title varchar(100),
                      board_content varchar(300),
                      board_date DATETIME DEFAULT CURRENT_TIMESTAMP,
                      board_hit int(10) default 0
);


insert into board (board_name, board_title, board_content, board_date) values('신현태', '첫글', '짜증', now());
insert into board (board_name, board_title, board_content, board_date) values('권용수', '야호글', '게짜증짜증', now());
insert into board (board_name, board_title, board_content, board_date) values('김금빛', '짜증글', '왕짜증왕짜증', now());

select * from board;


create table reply(
                      reply_id int NOT NULL AUTO_INCREMENT  primary key,
                      reply_name varchar(20),
                      reply_content varchar(300),
                      reply_date DATETIME DEFAULT CURRENT_TIMESTAMP,
                      reply_board_id int(10),
                      foreign key (reply_board_id) references board(board_id)
);

insert into reply (reply_name, reply_content, reply_date, reply_board_id) values('김금빛', '짜증나네', now(), 1);
insert into reply (reply_name, reply_content, reply_date, reply_board_id) values('권용수', '너도 짜증나네', now(), 2);
insert into reply (reply_name, reply_content, reply_date, reply_board_id) values('신현태', '둘다 짜증나네', now(), 3);


select * from reply;



commit;
