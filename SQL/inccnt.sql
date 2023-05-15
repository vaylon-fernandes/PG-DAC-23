delimiter //
create procedure inccnt(inout cnt int)
begin
set cnt =cnt+10;
end//
delimiter ;
set @c=5;
call inccnt(@c);
select @c;