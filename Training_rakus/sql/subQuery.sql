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
LEFT JOIN
  departments AS d
ON
  e.department_id =d.id 
WHERE
  department_id IN (
  SELECT
	  id
  FROM
	  departments
  WHERE
	  name IN '管理部','開発部',
  );