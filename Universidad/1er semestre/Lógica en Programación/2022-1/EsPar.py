"""
Autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 18 de marzo de 2022
Código: 1094889063
Version 1
"""

#Proceso1: ¿Es numero par?
def CalcularNumeroPar (numero):
        
    if (numero%2==0):
        numeroPar = ("Par")
        return numeroPar
    else: 
        numeroPar =("Impar")
        return numeroPar

def main():
    #entradas del ususario
    numero = int(input("Ingrese un número entero"))

    #Invocar procesos
    esNumeroPar = CalcularNumeroPar (numero)

    #Mostrar al usuario
    print ("El número ",numero , "es ",esNumeroPar)
main()