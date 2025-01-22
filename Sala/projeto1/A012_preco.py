quantidade = int(input(print("Quantas maças você deseja comprar?")))

promo1 = 0.25
promo2 = 0.30

if quantidade > 12:
  print("O preço por essa quantidade vai ser de: R$",quantidade*promo2,".")
else:
  print("O preco por essa quantidade vai ser de: R$", quantidade*promo1,".")
