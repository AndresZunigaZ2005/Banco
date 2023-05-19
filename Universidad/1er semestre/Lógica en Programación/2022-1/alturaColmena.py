"""
Autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 14 de marzo de 2022
Código: 1094889063
Version 1
"""

#Función
def CalcularAlturaColmena (alturaRoca, raizArbol, alturaOso):
    alturaColmena = ((alturaRoca*10)+(raizArbol/10)+(alturaOso*100))
    return alturaColmena

def main():
    #Pedir al usuario
    alturaRoca = float(input("Altura de la roca en decímetros(dm):"))
    raizArbol = float(input("Ingrese la altura de la raíz en milímetros (mm): "))
    alturaOso = float(input("Altura del oso cuando se estira con sus garras hacia arriba, colocar su valor en metros (m):"))
    
    #Llamar función
    alturaColmena = CalcularAlturaColmena (alturaRoca, raizArbol, alturaOso)

    #Enseñar la respuesta al usuario
    print ("La altura total a la que estaba la colmena fue de:", alturaColmena, "centímetros (cm)")

main()