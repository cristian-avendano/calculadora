var concatenar = ""

var s = document.getElementById("entrada")

var botones = document.getElementsByClassName('boton')

var igual = document.getElementById("server1")


botones[0].addEventListener("click",function(e){
    conca(1)
})

botones[1].addEventListener("click",function(e){
    conca(2)
})

botones[2].addEventListener("click",function(e){
    conca(3)
})

botones[3].addEventListener("click",function(e){
    conca("+")
})

botones[4].addEventListener("click",function(e){
    conca(4)
})

botones[5].addEventListener("click",function(e){
    conca(5)
})

botones[6].addEventListener("click",function(e){
    conca(6)
})

botones[7].addEventListener("click",function(e){
    conca("-")
})

botones[8].addEventListener("click",function(e){
    conca(7)
})

botones[9].addEventListener("click",function(e){
    conca(8)
})

botones[10].addEventListener("click",function(e){
    conca(9)
})

botones[11].addEventListener("click",function(e){
    conca("*")
})

botones[12].addEventListener("click",function(e){
    conca(0)
})

botones[13].addEventListener("click",function(e){
    borrar()
})

botones[14].addEventListener("click",function(e){
    conca("/")
})
function conca(numero){
    concatenar = concatenar + numero;
    s.value = concatenar
    igual.value=concatenar;
}


function borrar(){
    if (concatenar == "") {
        
    }else{
        concatenar = concatenar.substring(0,concatenar.length-1);
        s.value  = concatenar;  
        igual.value=concatenar;
    }
}