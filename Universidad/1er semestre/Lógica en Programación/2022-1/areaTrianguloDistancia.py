"""
autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 12 de marzo
Código: 1094889063
Versión 1
"""
#función
from pip import main


def CalcularDistancias (coordX2,coordX1,coordY2,coordY1):
    distancias= ((coordX2-coordX1)**2+(coordY2-coordY1)**2)(1/2)
    return distancias

#Llamar las distancias
def main ():
    distanciaA= CalcularDistancias (7,3,6,4)

    #Mostrar resultados
    print ("distancia A equivale a", distanciaA)

main()