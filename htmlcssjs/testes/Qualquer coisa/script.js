const seguidor = document.getElementById("seguidor");
let x = 0, y = 0;
let mouseX = 0, mouseY = 0;

document.addEventListener("mousemove", (e) => {
  mouseX = e.clientX;
  mouseY = e.clientY;
});

function animar() {
  // Suaviza o movimento (0.1 define a velocidade de aproximação)
  x += (mouseX - x) * 0.1;
  y += (mouseY - y) * 0.1;
  
  seguidor.style.transform = `translate(${x - 15}px, ${y - 15}px)`;
  requestAnimationFrame(animar);
}

animar();