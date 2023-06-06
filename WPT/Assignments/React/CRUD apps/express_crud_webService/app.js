// import library 
const express=require('express')
app=express()
const bodyparser=require('body-parser')
const router=require('./router/routers')

// middleware
app.use(bodyparser.urlencoded({extended:true}))
app.use(bodyparser.json())

// configure application 

// url handler 
app.use('/',router)

app.listen(3200,()=>{
    console.log('Server listening on port 3200')
})

module.exports = app;
