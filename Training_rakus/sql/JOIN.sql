SELECT
e.id,
 e.name,
  e.age,
  e.gender,
  e.department_id,
  d.id,
  d.name
FROM
  employees AS e
FULL JOIN
  departments AS d
ON
  e.department_id = d.id