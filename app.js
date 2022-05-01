const express = require("express");
const bodyParser = require("body-parser");
const _ = require("lodash");

const app = express();

app.set('view engine', 'ejs');

app.use(bodyParser.urlencoded({extended:true}))
app.use(express.static("public"))

app.get("/",(req,res) =>{
    res.render("home")
})

app.get("/console", (req,res) =>{
    res.render("console")
})

app.post("/consol" ,(req,res) => {
    const soil = _.toUpper(req.body.soil);
    const crop = req.body.crop
    
    if(soil === "WHEAT"){
        res.render("result", {
            soil : soil,
            crop : crop,
            low : 500,
            high : 600,
            moist : 300,
            result : "Need more water"
        })
    }
    else if(soil === "RICE"){
        res.render("result", {
            soil : soil,
            crop : crop,
            low : 1100,
            high : 1250,
            moist : 1180,
            result : "Sufficient Water"
        })
    }
})


app.listen(3000,()=>{
    console.log("listening to port 3000")
})