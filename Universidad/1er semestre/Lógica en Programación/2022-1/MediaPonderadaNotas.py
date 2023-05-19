"""
autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 12 de marzo
Código: 1094889063
Versión 1
"""

#Función 
from pip import main


def CalcularMediaPond (nota1,pesoNota1,nota2,pesoNota2,nota3,pesoNota3,nota4,pesoNota4,nota5,pesoNota5):
    mediaPond = (nota1*pesoNota1+nota2*pesoNota2+nota3*pesoNota3+nota4*pesoNota4+nota5*pesoNota5)/(pesoNota1+pesoNota2+pesoNota3+pesoNota4+pesoNota5)
    return mediaPond

def main():
    #Ingrese Valores
    nota1 = float(input("El valor de la nota 1 es de:"))
    nota2 = float(input("El valor de la nota 2 es de:"))
    nota3 = float(input("El valor de la nota 3 es de:"))
    nota4 = float(input("El valor de la nota 4 es de:"))
    nota5 = float(input("El valor de la nota 5 es de:"))

    #Llamar a la función
    mediaNotas= CalcularMediaPond (nota1,0.1,nota2,0.2,nota3,0.4,nota4,0.15,nota5,0.15)

    #Mostrar al usuario
    print("La nota del estudiante es de:", mediaNotas)

main()