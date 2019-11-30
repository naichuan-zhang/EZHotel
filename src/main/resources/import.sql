-- Insert Statements ...

INSERT INTO USER VALUES
(null , 'John', 'Long', '123456', 'jlong'),
(null, 'Naichuan', 'Zhang', '123456', 'naichuan');

INSERT INTO GUEST VALUES
('znc@gmail.com', null, '123456', '2');

INSERT INTO ROOM VALUES
(null, '0', null),
(null, '0', null),
(null, '0', null),
(null, '0', null),
(null, '0', null),
(null, '0', null),
(null, '0', null);

INSERT INTO EXECUTIVE_ROOM VALUES
('This is an Executive Room', 500.0, '1'),
('This is an Executive Room', 500.0, '2');

INSERT INTO SINGLE_ROOM VALUES
('This is a Single Room', 150.0, '3'),
('This is a Single Room', 150.0, '4');

INSERT INTO DOUBLE_ROOM VALUES
('This is a Double Room', 200.0, '5'),
('This is a Double Room', 200.0, '6');

INSERT INTO JUNIOR_SUITE_ROOM VALUES
('This is a Junior Suite Room', 200.0, '7');
