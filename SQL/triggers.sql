delimiter //
Create trigger emp_update before update on emp
For each row
Begin
Insert into empsecurity values(OLD.empno,OLD.ename,'update',OLD.sal,NEW.sal,user(),curdate());
End//
delimiter ;

delimiter // 
create trigger update_salary_trigger after update on emp
for each row 
begin
insert into empback values(OLD.empno,OLD.ename,'update',OLD.sal,NEW.sal,user(),curdate());
end //
delimiter ;

delimiter // 
create trigger insert_monitor before insert on emp
for each row 
begin
insert into empaudit values(New.empno,New.ename,'insert',OLD.sal,NEW.sal,user(),curdate());
end //
delimiter ;

create trigger delete_monitor before delete on emp 
for each row
begin 
insert into empaudit 
end // 
delimiter ;

delimiter // 
create trigger price_monitor before update on vehicle 
for each row 
begin 
insert into vehicle_history values(OLD.vno,OLD.vname,OLD.price,NEW.price,curdate(),user());
end//