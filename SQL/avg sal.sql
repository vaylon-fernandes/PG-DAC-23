DELIMITER //

CREATE PROCEDURE sp_DisplayEmpInfo()
BEGIN
DECLARE avg_salary INT;

SELECT AVG(sal) INTO avg_salary
FROM emp;

IF avg_salary IS NULL THEN
  SELECT 'Emp table is empty' AS error_message;
ELSE
  SELECT empno, ename, job, sal, 
  CASE
    WHEN sal > avg_salary THEN 'Greater' 
    WHEN sal < avg_salary THEN 'Lesser' 
    ELSE 'Equal' 
  END AS status, deptno
  FROM emp;
END IF;
END//

DELIMITER ;

call sp_displayempinfo();

drop procedure sp_displayempinfo;
