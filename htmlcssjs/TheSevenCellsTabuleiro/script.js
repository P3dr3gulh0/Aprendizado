const tabuleiro = document.querySelector('.tabuleiro');

for (let i = 0; i < 64; i++) {
  const casa = document.createElement('div');
  const linha = Math.floor(i / 8);
  const coluna = i % 8;
  if ((linha + coluna) % 2 === 0) {
    casa.style.backgroundColor = '#fff';
  } else {
    casa.style.backgroundColor = '#000';
  }
  tabuleiro.appendChild(casa);
}