"""
Autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 18 de marzo de 2022
Código: 1094889063
Version 1
"""
#Proceso
from ctypes import c_char


def CalcularCharIguales (char1,char2):
    if (char1==char2):
        charIguales = ("Son iguales")
        return charIguales
    else:
        charIguales = ("Son diferentes")
        return charIguales

def main():
    #entradas del ususario
    char1 = c_char(input("Ingrese el primer caracter: "))
    char2 = c_char(input("Ingrese el segundo caracter: "))
    
    #Invocar proceso
    igualdadChar = CalcularCharIguales (char1,char2)
    
    #Mostrar al usuario
    print ("Los dos caracteres son: ",igualdadChar)
main()