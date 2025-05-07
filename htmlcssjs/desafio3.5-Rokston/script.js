function calculoMedia(n1,n2,n3){
    var media = (n1+n2+n3)/3
    return media;
}

function resultado(form){
    var result = calculoMedia(
        parseFloat(form.nota1.value),
        parseFloat(form.nota2.value),
        parseFloat(form.nota3.value)
    );

    if(result >= 7){
        alert("Aprovado")
    }
    else{
        alert("Recuperação")
    }
}