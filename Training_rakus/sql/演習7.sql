SELECT * FROM members
WHERE deleted = false AND gender=2;

SELECT * FROM members
WHERE deleted = false AND birth_date < '999-12-31';

SELECT * FROM members
WHERE name LIKE '%信%' AND deleted = false;

SELECT max(aged), avg(aged),min(aged) FROM members
WHERE deleted = false;

SELECT period_id, avg(aged) FROM members
GROUP BY period_id
ORDER BY period_id ASC;
