INSERT INTO `user` (idx, id, password)
VALUES(1, '시라소니', '123'),
    (2, '김두한', '123');


INSERT INTO post (idx, title, content, user_idx)
VALUES(1, '첫번째', '이야 김두한이 사무실이 삐까뻔쩍하구만 기래', 1),
    (2, '두번째', '시라소니 형님..', 1),
    (3, '세번째', '아우가 이렇게 무릎을 꿇었습니다', 2);
