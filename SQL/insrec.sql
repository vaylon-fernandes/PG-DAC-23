 use iacsd_march23;
 delimiter //
 
 create procedure insrec(pid int,pname varchar(20),qty int,price double(9,2),catid int,sid int)
    begin
    insert into product values(pid,pname,qty,price,catid,sid);
end//

drop procedure insrec;
call insrec(101,'jam',1,100.00,1,11);

select * from product