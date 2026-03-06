INSERT INTO member(name, email, password) VALUES('홍길동', 'GildongDong@google.com'
                            , '$2a$10$e1Fff0OjnpDWj5FHw/mbQ.xKYl9Oo8RH2zSU93iShfnxzDHrzckn.');
INSERT INTO member(name, email, password) VALUES('임꺽정', 'KkeokJeong@google.com'
                            , '$2a$10$HFSvnP1pXGT4FXCnH7IcN.yVa78dhE3/JYgYu2EW9Byyr3u/Ygknq');
INSERT INTO member(name, email, password) VALUES('전우치', 'JeonUchi@google.com'
                            , '$2a$10$HFSvnP1pXGT4FXCnH7IcN.yVa78dhE3/JYgYu2EW9Byyr3u/Ygknq');
INSERT INTO member(name, email, password) VALUES('장길산', 'GilSan@google.com'
                            , '$2a$10$HFSvnP1pXGT4FXCnH7IcN.yVa78dhE3/JYgYu2EW9Byyr3u/Ygknq');

INSERT INTO authority(authority, member_id) VALUES('ROLE_ADMIN', 1);
INSERT INTO authority(authority, member_id) VALUES('ROLE_USER', 2);
INSERT INTO authority(authority, member_id) VALUES('ROLE_USER', 3);
INSERT INTO authority(authority, member_id) VALUES('ROLE_USER', 4);

INSERT INTO article(title, description, created, updated, member_id) VALUES('첫번째 게시글 제목', '첫번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('두번째 게시글 제목', '두번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO article(title, description, created, updated, member_id) VALUES('세번째 게시글 제목', '세번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO article(title, description, created, updated, member_id) VALUES('네번째 게시글 제목', '네번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO article(title, description, created, updated, member_id) VALUES('다섯번째 게시글 제목', '다섯번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('여섯번째 게시글 제목', '여섯번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO article(title, description, created, updated, member_id) VALUES('일곱번째 게시글 제목', '일곱번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO article(title, description, created, updated, member_id) VALUES('여덟번째 게시글 제목', '여덟번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO article(title, description, created, updated, member_id) VALUES('아홉번째 게시글 제목', '아홉번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('열번째 게시글 제목', '열번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);

INSERT INTO article(title, description, created, updated, member_id) VALUES('열한번째 게시글 제목', '열한번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO article(title, description, created, updated, member_id) VALUES('열두번째 게시글 제목', '열두번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO article(title, description, created, updated, member_id) VALUES('열세번째 게시글 제목', '열세번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('열네번째 게시글 제목', '열네번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO article(title, description, created, updated, member_id) VALUES('열다섯번째 게시글 제목', '열다섯번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO article(title, description, created, updated, member_id) VALUES('열여섯번째 게시글 제목', '열여섯번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO article(title, description, created, updated, member_id) VALUES('열일곱번째 게시글 제목', '열일곱번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('열여덟째 게시글 제목', '열여덟째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO article(title, description, created, updated, member_id) VALUES('열아홉번째 게시글 제목', '열아홉번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);

INSERT INTO article(title, description, created, updated, member_id) VALUES('스무번째 게시글 제목', '스무번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO article(title, description, created, updated, member_id) VALUES('스물한번째 게시글 제목', '스물한번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('스물두번째 게시글 제목', '스물두번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO article(title, description, created, updated, member_id) VALUES('스물세번째 게시글 제목', '스물세번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO article(title, description, created, updated, member_id) VALUES('스물네번째 게시글 제목', '스물네번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO article(title, description, created, updated, member_id) VALUES('스물다섯번째 게시글 제목', '스물다섯번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('스물여섯번째 게시글 제목', '스물여섯번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO article(title, description, created, updated, member_id) VALUES('스물일곱번째 게시글 제목', '스물일곱번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO article(title, description, created, updated, member_id) VALUES('스물여덟번째 게시글 제목', '스물여덟번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO article(title, description, created, updated, member_id) VALUES('스물아홉번째 게시글 제목', '스물아홉번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('서른번째 게시글 제목', '서른번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);

INSERT INTO article(title, description, created, updated, member_id) VALUES('서른한번째 게시글 제목', '서른한번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO article(title, description, created, updated, member_id) VALUES('서른두번째 게시글 제목', '서른두번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO article(title, description, created, updated, member_id) VALUES('서른세번째 게시글 제목', '서른세번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('서른네번째 게시글 제목', '서른네번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO article(title, description, created, updated, member_id) VALUES('서른다섯번째 게시글 제목', '서른다섯번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO article(title, description, created, updated, member_id) VALUES('서른여섯번째 게시글 제목', '서른여섯번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO article(title, description, created, updated, member_id) VALUES('서른일곱번째 게시글 제목', '서른일곱번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('서른여덟번째 게시글 제목', '서른여덟번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO article(title, description, created, updated, member_id) VALUES('서른아홉번째 게시글 제목', '서른아홉번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO article(title, description, created, updated, member_id) VALUES('마흔번째 게시글 제목', '마흔번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);

INSERT INTO article(title, description, created, updated, member_id) VALUES('마흔한번째 게시글 제목', '마흔한번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('마흔두번째 게시글 제목', '마흔두번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO article(title, description, created, updated, member_id) VALUES('마흔세번째 게시글 제목', '마흔세번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO article(title, description, created, updated, member_id) VALUES('마흔네번째 게시글 제목', '마흔네번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO article(title, description, created, updated, member_id) VALUES('마흔다섯번째 게시글 제목', '마흔다섯번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('마흔여섯번째 게시글 제목', '마흔여섯번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO article(title, description, created, updated, member_id) VALUES('마흔일곱번째 게시글 제목', '마흔일곱번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO article(title, description, created, updated, member_id) VALUES('마흔여덟번째 게시글 제목', '마흔여덟번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO article(title, description, created, updated, member_id) VALUES('마흔아홉번째 게시글 제목', '마흔아홉번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO article(title, description, created, updated, member_id) VALUES('쉰번째 게시글 제목', '쉰번째 게시글 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);