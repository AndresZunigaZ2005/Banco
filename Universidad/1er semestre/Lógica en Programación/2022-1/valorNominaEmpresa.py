"""
Autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 14 de marzo de 2022
Código: 1094889063
Version 1
"""

#Función
def CalcularNominaTotal (salarioJulian):
    nominaTotal = ((salarioJulian*3)+((salarioJulian*3)/3)+(salarioJulian*2)+(((salarioJulian*3)/3)/2)+(salarioJulian*3-salarioJulian))
    return nominaTotal
    
    """
    salarioJulian*3 = salarioJhon
    (salarioJulian*3)/3 = salarioClaudia
    salarioJulian*2 = salarioJuan
    ((salarioJulian*3)/3)/2 = salarioTobi
    salarioJulian*3-salarioJulian = salarioAna
    """

def main():
    #Pedir dato al usuario
    salarioJulian = float(input("Ingrese el salario de Julian en pesos colombianos"))

    #llamar la función
    valorNomina = CalcularNominaTotal (salarioJulian)

    #mostrar al usuario
    print ("El valor de toda la nómina de la empresa es de:", valorNomina, "pesos colombianos")

main()