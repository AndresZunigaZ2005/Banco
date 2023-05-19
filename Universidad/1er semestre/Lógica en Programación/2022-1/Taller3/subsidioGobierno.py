"""
Autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 24 de marzo de 2022
Código: 1094889063
Version 1
"""
#Proceso 1: Calcular el precio de las semillas
"""
c:cebolla
p:papa
t:tomate
"""
def CalcularPrecioSemillas (cLarga,cDeHuevo,pCriolla,pPastusa,pSalentuna,tChonto):
    precioSemillas = (cLarga*1500+cDeHuevo*1300+pCriolla*8000+pPastusa*9000+pSalentuna*1100+tChonto*1500)
    return precioSemillas

#Proceso 2: Calcular subsidio del gobierno
def CalcularSubsidio (precioSemillas):
    if (precioSemillas<30000):
        valorTotalSubsidio = 0
        return valorTotalSubsidio
    else:
        if (precioSemillas>=30000 and precioSemillas<50000):
            valorTotalSubsidio = (precioSemillas*0.32)
            return valorTotalSubsidio
        else: 
            if (precioSemillas>=50000):
                valorTotalSubsidio = (precioSemillas*0.68)
                return valorTotalSubsidio

def main():
    #pedir datos al usuario
    cLarga = int(input("Ingrese la cantidad de semillas de cebolla larga: "))
    cDeHuevo = int(input("Ingrese la cantidad de semillas de cebolla de huevo: "))
    pCriolla = int(input("Ingrese la cantidad de semillas de papa criolla: "))
    pPastusa = int(input("Ingrese la cantidad de semillas de papa pastusa: "))
    pSalentuna = int(input("Ingrese la cantidad de semillas de papa salentuna: "))
    tChonto = int(input("Ingrese la cantidad de semillas de tomate chonto: "))

    #Llamar las funciones
    #Proceso 1
    precioSemillas = CalcularPrecioSemillas (cLarga,cDeHuevo,pCriolla,pPastusa,pSalentuna,tChonto)

    #Proceso 2
    subsidio = CalcularSubsidio (precioSemillas)

    #Mostrar al usuario
    print ("El valor de las semillas sin el descuento es de:",precioSemillas,"COP")
    print ("El subsidio del gobierno es de:",subsidio,"COP")
    print ("El valor de las semillas con el descuento",precioSemillas-subsidio,"COP")
main()
