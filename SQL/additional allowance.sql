delimiter //
# before creating function SET GLOBAL log_bin_trust_function_creators=1;
create function get_Experience(hiredate DATE) returns int
begin 
	declare exp int; 
    set exp=floor(datediff(curdate(),hiredate)/365);
    return exp;
end//

delimiter //
create procedure calculate_allowance()
begin 
	# dec finishe init 0 
	declare finished int default 0; 
    # declare variables
    declare vempno,vexp int; 
    declare vhiredate date; 
    declare vename varchar(20);
    declare vallowance double(9,2);
    
    /*declare finished int default 0;
	declare vempno,vexp int;
	declare vename varchar(20);
	declare vhiredate date;
	declare allowance double(9,2);*/

    # declare cursor 
    declare emp_cur cursor for select EMPNO,ENAME,HIREDATE from emp;
    # declare continue handler 
    declare continue handler for NOT FOUND set finished=1;
    
    # open cursor 
    open emp_cur;
    l1: loop 
		# fetch cursor into variables
		fetch emp_cur into vempno,vename,vhiredate ;
		if finished=1 then 
			leave l1; 
		end if;
        
        set vexp=get_experience(vhiredate); # get exp
        set vallowance=vexp*3000;  # calc allowance 
        # store values in emp_allowance 
        insert into emp_allowance(EMPNO,ENAME,HIREDATE,EXPERIENCE,ALLOWANCE) 
        values(vempno,vename,vhiredate,vexp,vallowance);
    end loop;
    # close cursor after leaving loop 
    close emp_cur;
end//

delimiter ;
call calculate_allowance();
drop procedure calculate_allowance;