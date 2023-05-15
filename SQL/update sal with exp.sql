delimiter // 
create procedure update_sal_on_exp() 
begin 
declare finished int default 0; 
declare vempno,vmgr,vdeptno,vexp int; 
declare vename,vjob varchar(20);
declare vhiredate date;
declare vsal,vcomm,vupd_sal double(9,2);
declare emp_cur cursor for select * from emp; 
declare continue handler for NOT found set finished=1;
open emp_cur;

l1: loop 
	fetch emp_cur into vempno,vename,vjob,vmgr,vhiredate,vsal,vcomm,vdeptno;
	
    if finished=1 then 
		leave l1;
	end if;
    
    set vexp=floor(datediff(curdate(),vhiredate)/365);
    if vexp<35 and vexp<=38 then 
		set vupd_sal=1.2*vsal;
        update emp 
        set sal=vupd_sal 
        where empno=vempno;
	elseif vexp>38 then 
		set vupd_sal=1.25*vsal; 
        update emp 
        set sal=vupd_sal
        where empno=vempno;
    end if;
    select vempno,vename,vjob,vmgr,vhiredate,vsal,vcomm,vdeptno;

end loop;
close emp_cur;
	
end// 

delimiter ;

call update_sal_on_exp();
drop procedure update_sal_on_exp;
