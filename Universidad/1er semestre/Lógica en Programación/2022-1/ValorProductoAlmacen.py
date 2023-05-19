"""
Autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 17 de marzo de 2022
Código: 1094889063
Version 1
"""

#Proceso 1: cuanto dinero hay en descuento
def CalcularValorTotalDescuento (valorCompra, DESCUENTO):

    valorDescuento = 0

    #decisión
    if (valorCompra>100000):
        valorDescuento = valorCompra*DESCUENTO
    return valorDescuento

#Proceso 2: valor a pagar del comprador
def CalcularValorTotalPagar (valorCompra, valorDescuento):
    valorTotalPagar = valorCompra-valorDescuento
    return valorTotalPagar

def main():
    #Constante
    DESCUENTO =  0.1
    #pedir al usuario
    valorCompra = float(input("Ingrese el valor de la compra en pesos colombianos: "))

    #Llamar proceso 1
    valorTotalDescuento = CalcularValorTotalDescuento (valorCompra, DESCUENTO)

    #Llamar proceso 2
    valorTotalPagar = CalcularValorTotalPagar (valorCompra,valorTotalDescuento)

    #mostrar al usuario
    print ("El valor que tiene el descuento es de: ", valorTotalDescuento, "COP")
    print ("El valor total a pagar es de: ", valorTotalPagar, "COP")
main()