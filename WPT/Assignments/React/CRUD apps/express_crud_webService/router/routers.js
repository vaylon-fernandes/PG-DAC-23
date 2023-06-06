const express=require('express')
const router=express.Router()
const connection=require('../db/dbconnect')

router.get("/employees",(req,resp)=>{
    connection.query("select * from employee",(err,data)=>{
        if(err){
            resp.status(500).send("data not found"+JSON.stringify(err))
        }else{
            console.log(data)
            resp.send(data)
        }
    })
})

router.get("/employees/get/:empid",(req,resp)=>{
    connection.query("select * from employee where empid=?",[req.params.empid],(err,data)=>{
        if(err){
            resp.status(500).send("data not found"+JSON.stringify(err))
        }else{
            console.log(data)
            resp.send(data[0])
        }
    })
})

router.post("/employees/post/:empid",(req,resp)=>{
    var empid=req.params.empid
    var ename=req.body.ename
    var sal=req.body.sal
    connection.query("insert into employee values(?,?,?)",[empid,ename,sal],(err)=>{
        if(err){
            console.log(JSON.stringify(err))
            resp.status(500).send("Data not inserted")
        }
        else{
            resp.send("{'msg':'inserted successfully'}")
            console.log("Insert success")
        }
    })
})

router.put("/employees/put/:empid",(req,resp)=>{
    var empid=req.params.empid
    var ename=req.body.ename
    var sal=req.body.sal
    connection.query("update employee set ename=?,sal=? where empid=?",[ename,sal,empid],(err)=>{
        if(err){
            console.log(JSON.stringify(err))
            resp.status(500).send("Data not inserted")
        }
        else{
            resp.send("{'msg':'updated successfully'}")
            console.log("Insert success")
        }
    })
})

router.delete("/employees/delete/:empid",(req,resp)=>{
    var empid=req.params.empid
    connection.query("delete from employee where empid=?",[empid],(err)=>{
        if(err){
            console.log(JSON.stringify(err))
            resp.status(500).send("Data not deleted")
        }
        else{
            resp.send("{'msg':'deleted successfully'}")
            console.log("delete success")
        }
    })
})

module.exports=router