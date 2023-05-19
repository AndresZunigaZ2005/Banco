from Biblioteca import*
lista = []
cantidad = leerfloat ("Cantidad: ")
mayor=0
menor=0
i=1
while (cantidad>0):
    numero= leerfloat ("Número #"+str (i)+": ")
    lista.append (numero)
    i+=1
    cantidad+=-1

mayor = max(lista)
menor = min(lista)

imprimir (mayor)
imprimir (menor)
        