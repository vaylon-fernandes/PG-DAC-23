create procedure get_sal_info(pdeptno int,out minsal double(9,2), out maxsal double(9,2), out avgsal double(9,2), out count int)
begin
select min(sal),max(sal),round(avg(sal)),count(*) into minsal,maxsal,avgsal,count
from emp
where deptno=pdeptno;
select pdeptno,minsal,maxsal,avgsal,count;
end//

delimiter //
create procedure get_info()
begin
select pid,pname,c.cid,c.cname,s.sname
from product p,category c,salesman s
where p.cid=c.cid and p.sid=s.sid;
end//

delimiter // 




7. Write a procedure that displays the following information of all emp Empno,Name,job,Salary,Status,deptno
Note: - Status will be (Greater, Lesser or Equal) respective to average salary of their own department. Display an error message Emp table is empty if there is no matching record.

delimiter //
create procedure display_info()
begin 
declare finished int default 0; # declare finished variable for loop

# declare cursor variables

declare vempno,vdeptno int; 
declare vename,vjob,status varchar(20);
declare vsal,avgsal double(9,2); 

# declare cursor 
declare empcur cursor for select empno,ename,job,sal,deptno from emp; 
# declare continue handler
declare continue handler for NOT FOUND set finished=1; 

# open cursor 
open empcur;

# fetch cursor row by row 
l1:loop 
fetch empcur into vempno,vename,vjob,vsal,vdeptno; 
if finished=1 then 
	leave l1; 
end if; 

# process data 

select avg(sal) into avgsal
from emp
where deptno=vdeptno; 

if vsal>avgsal then 
	set status='greater';
elseif vsal<avgsal then 
	set status='lesser';

else
	set status='equal';
end if;

select vempno,vename,vjob,vsal,vdeptno,status;
end loop;

# close cursor
close empcur;

end// 
delimiter ;

