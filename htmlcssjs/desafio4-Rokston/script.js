function adicionarTarefa(){
    const input = document.getElementById("novaTarefa");
    const texto = input.value.trim();
    if(texto === ""){
        const aviso = alert("Tarefa vazia")
        return aviso;
    }

    const lista = document.getElementById("listaTarefas");
    const novoItem = document.createElement("li");

    novoItem.innerHTML = `<span onclick="riscarTarefa(this)">${texto}</span><span class="remover" onclick ="removerTarefa(this)">[x]</span>`;
    lista.appendChild(novoItem);
    input.value = "";
}

function riscarTarefa(elemento){
    elemento.classList.toggle("riscar");
}
function removerTarefa(elemento){
    elemento.parentElement.remove();
}