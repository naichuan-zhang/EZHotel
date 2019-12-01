-- Insert Statements ...
--
INSERT INTO USER VALUES
(null , 1000.0, 'John', 'Long', '123456', 'jlong'),
(null, 1000.0, 'Naichuan', 'Zhang', '123456', 'naichuan');

INSERT INTO GUEST VALUES
('znc@gmail.com', null, '123456', '2');

INSERT INTO ROOM VALUES
(null, '0', 'EXECUTIVE', null),
(null, '0', 'EXECUTIVE', null),
(null, '0', 'SINGLE', null),
(null, '0', 'SINGLE', null),
(null, '0', 'DOUBLE', null),
(null, '0', 'DOUBLE', null),
(null, '0', 'JUNIORSUITE', null);
(null, '0', 'JUNIORSUITE', null);

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
('This is a Junior Suite Room', 200.0, '8');
