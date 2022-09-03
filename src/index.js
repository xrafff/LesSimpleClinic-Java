const express = require('express');
const{response} = require('express');

const app = express();
app.use(express.json());
app.get("/",(request,response) => {
    console.log("executou");
    return response.send("Inicio");
} );

app.get("/listar",(request,response) => {
    console.log("executou");
    return response.send("Inicio 34");
} );

app.get("/exibir",(request,response) => {
    console.log("executou teste");
    return response.json({"nome":"Fabio Codo"});
} );

app.post("/incluir",(request,response) => {
    const body=request.body;
    console.log(body);
    const{name,image,categoria,descricao,status}= request.body;
   
    const id=140;
    const objeto={
        id,
        name,
        image,
        categoria,
        descricao,
        status
    }
    return response.json(objeto);
} );

app.listen(3000);


