const mysql=require('mysql2')

const mysqlconnection=mysql.createConnection({
    "host":"127.0.0.1",
    "user":"root",
    "password":"root123",
    "port":3306,
    "database":"test"
})

mysqlconnection.connect((err)=>{
    if(err){
        console.log("Connection failed "+err)
    }
    else{
        console.log("Connected")
    }
})

module.exports=mysqlconnection