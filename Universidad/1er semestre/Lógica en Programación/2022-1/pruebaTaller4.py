from Biblioteca import*
n = leerInt ("Ingrese la cantidad de personas: ")
s = leerString ("Ingrese si es hombre M y si es mujer F: ")
cantM=0
cantF=0
for i in range(1,n):
    if(s=="M"):
        cantM+=1
    else:
        cantF+=1
    imprimir (cantM)
    print()
    imprimir (cantF)