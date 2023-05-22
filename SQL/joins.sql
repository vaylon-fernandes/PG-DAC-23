Select
e.empno,e.ename,e.sal,e.mgr
'managerno',m.ename 'manager
name',m.sal 'manager sal'
From emp e, emp m
Where e.mgr=m.empno;

select * From faculty f left join course c on c.fid=f.fid left join room r on r.roomid=c.rid
union select * from course c right join room r
Where c.cid is null;

Select cname,fname,rname
From faculty f left join course c on c.fid=f.fid left join room r on c.rid=r.roomid
union Select cname,null,rnameFrom course c right join room r on c.rid=r.roomid
Where c.cname is null;

Select c.cname,f.fname
From courses c left join faculty f on c.fid=f.fid
Union
Select c.cname,f.fname
From courses c right join faculty f on c.fid=f.fid;