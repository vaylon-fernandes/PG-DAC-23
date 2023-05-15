/* 10. Write a function to compute the following. Function should take sal and hiredate
as i/p and return the cost to company.
DA = 15% Salary, HRA= 20% of Salary, TA= 8% of Salary.
Special Allowance will be decided based on the service in the company. < 1 Year Nil
>=1 Year< 2 Year 10% of Salary >=2 Year< 4 Year 20% of Salary >4 Year 30% of Salary */
delimiter //
create function compute_ctc_emp(salary double(9,2), hiredate date) returns double
begin 
	declare allowance int default 0;
    declare ctc double(9,2);
    declare vexp int;
    set vexp=floor(datediff(curdate(),hiredate)/365);
    
    if vexp<1 then 
		set allowance=0;
    elseif vexp>=1 and vexp<2 then
		set allowance=0.1*salary;
	elseif vexp>=2 and vexp<4 then 
		set allowance=0.2*salary;
	else
		set allowance=0.3*salary;
	end if;
    
    set ctc=salary+0.15*salary+0.2*salary+0.08*salary+allowance;
    
    return ctc;
end// 

delimiter ;

drop function compute_ctc_emp;