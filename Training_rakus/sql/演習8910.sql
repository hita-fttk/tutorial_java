-- 演習８
UPDATE members
SET name='山田一葉'
WHERE name='樋口一葉';

SELECT * FROM members;
-- 演習９
CREATE TABLE periods (
    id integer PRIMARY KEY,
	name varchar(10) NOT NULL
);

INSERT INTO periods VALUES(1,'古代');
INSERT INTO periods VALUES(2,'飛鳥時代');
INSERT INTO periods VALUES(3,'奈良時代');
INSERT INTO periods VALUES(4,'平安時代');
INSERT INTO periods VALUES(5,'鎌倉時代');
INSERT INTO periods VALUES(6,'室町時代');
INSERT INTO periods VALUES(7,'安土桃山時代');
INSERT INTO periods VALUES(8,'江戸時代');
INSERT INTO periods VALUES(9,'明治時代');
INSERT INTO periods VALUES(10,'大正時代');
INSERT INTO periods VALUES(11,'昭和時代');
INSERT INTO periods VALUES(12,'平成時代');

SELECT * FROM periods;
-- 演習10
SELECT
    m.name,
	p.name
FROM
    members AS m
JOIN
    periods AS p
ON
	m.period_id = p.id
ORDER BY p.id ASC;