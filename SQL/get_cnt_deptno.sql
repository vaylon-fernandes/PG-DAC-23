Delimiter //
Create procedure getcnt_by_dept(pdno int,out cnt int)
Begin
Select count(*) into cnt from emp where deptno= pdno;
End//
Delimiter ;

Call getcnt_by_dept(10,@c);

Delimiter //
create procedure getcnt_by_dep(pdno int,out cnt int)
begin 
select count(*) into cnt from emp where deptno=pdno;
end //
Delimiter ;
Call getcnt_by_dep(10,@c);