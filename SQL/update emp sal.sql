use iacsd_march23;

delimiter //
create procedure update_emp_sal(out pmcnt int,out pacnt int,out pccnt int,out pocnt int)
begin
declare finished int default 0;
declare vempno,vmgr,vdeptno int;
declare vename,vjob varchar(20);
declare vhiredate date;
declare vsal,vcomm,vupd_sal double(9,2);
declare emp_cur cursor for select * from emp;
declare continue handler for NOT FOUND set finished=1;
set pmcnt=0;set pacnt=0;
set pccnt=0;
set pocnt=0;
open emp_cur;
l1:loop
fetch emp_cur into vempno,vename,vjob,vmgr,vhiredate,vsal,vcomm,vdeptno;
if finished=1 then
leave l1;
end if;
if vjob='manager' then
set vupd_sal=1.1*vsal;
update emp
set sal=vupd_sal
where empno=vempno;
set pmcnt=pmcnt+1;
elseif vjob='analyst' then
set vupd_sal=1.2*vsal;
update emp
set sal=vupd_sal
where empno=vempno;
set pacnt=pacnt+1;
elseif vjob='clerk' then
set vupd_sal=1.25*vsal;
update emp
set sal=vupd_sal
where empno=vempno;
set pccnt=pccnt+1;
else
set vupd_sal=1.08*vsal;
update emp
set sal=vupd_sal
where empno=vempno;
set pocnt=pocnt+1;
end if;
select vempno,vename,vjob,vsal,vcomm,vupd_sal;
end loop;
select pmcnt,pacnt,pccnt,pocnt;
close emp_cur;
end//
delimiter ;

drop procedure update_emp_sal;