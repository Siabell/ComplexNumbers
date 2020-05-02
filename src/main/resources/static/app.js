app = (function () {
    var num1a = 0;
    var num1b= 0;
    var num2a= 0;
    var num2b= 0;
    var url= '';


    return {
        setNumbers: function () {
            num1a = parseInt(document.getElementById("num1a").value);
            num1b = parseInt(document.getElementById("num1b").value);
            num2a = parseInt(document.getElementById("num2a").value);
            num2b = parseInt(document.getElementById("num2b").value);
        },
        showResult: function (dataR) {
            $("#result").empty();
            var res = "Resultado -> Parte Real: " + dataR.data.real + " Parte Imaginaria: " + dataR.data.img;
            $("#result").append(res);
            
        },

        suma: function () {    
            app.setNumbers()
            axios.get(url+'/suma/'+num1a+'/'+num1b+'/'+num2a+'/'+num2b)
                .then(response => {
                    // Respuesta del servidor
                    console.log(response)
                    app.showResult(response);
                })
                .catch(e => {
                    // Capturamos los errores
                    console.log(e);
                })
            
        },
        resta: function () {    
            //document.getElementById("funcionesTxt").innerHTML = "function app";
            app.setNumbers()
            axios.get(url+'/resta/'+num1a+'/'+num1b+'/'+num2a+'/'+num2b)
                .then(response => {
                    // Respuesta del servidor
                    console.log(response)
                    app.showResult(response);
                })
                .catch(e => {
                    // Capturamos los errores
                    console.log(e);
                })
            
        },
        mult: function () {    
            app.setNumbers()
            axios.get(url+'/mult/'+num1a+'/'+num1b+'/'+num2a+'/'+num2b)
                .then(response => {
                    // Respuesta del servidor
                    console.log(response)
                    app.showResult(response);
                })
                .catch(e => {
                    // Capturamos los errores
                    console.log(e);
                })
            
        },
        division: function () {    
            app.setNumbers()
            axios.get(url+'/div/'+num1a+'/'+num1b+'/'+num2a+'/'+num2b)
                .then(response => {
                    // Respuesta del servidor
                    console.log(num1a)
                    console.log(response)
                    app.showResult(response);
                })
                .catch(e => {
                    // Capturamos los errores
                    console.log(e);
                    console.log(num1a)
                })
            
        }
        
    };
})();