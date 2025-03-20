cont = 0
par = 2

while cont < 100:
    cont+=1
    contImpar = cont%par
    if contImpar == 1:
        print(cont)