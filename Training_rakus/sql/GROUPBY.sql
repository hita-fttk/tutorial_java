SELECT
count(*),count(age),sum(age),avg(age),max(age),min(age),count(gender),count(department_name)
,department_name
FROM employees
GROUP BY department_name;