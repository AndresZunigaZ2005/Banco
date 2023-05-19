"""
Autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 18 de marzo de 2022
Código: 1094889063
Version 1
"""

#Procesos
def CalcularNumMenor100 (num1,num2):
    
    if ((num1+num2)<100):
        resultado = ("Menor que 100")
        return resultado 
    else:
        resultado = ("Mayor que 100")
        return resultado

def main():
    #entradas del usuario
    num1 = float(input("Ingrese un primer número"))
    num2 = float(input("Ingrese un segundo número"))

    #Invocar Procesos
    numMenor100 = CalcularNumMenor100 (num1,num2)

    #Mostrar al usuario
    print ("La suma de los dos número es: ",numMenor100)
main()