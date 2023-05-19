"""
Autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 14 de marzo de 2022
Código: 1094889063
Version 1
"""

#Función
def CalcularDestellosFaro (horas, minutos, destellosMinuto):
    destellosFaro = (((horas*60)+minutos)*destellosMinuto)
    return destellosFaro
    
def main():
    #Datos del usuario
    horasDia = int(input("Las horas de funcionamiento del faro en total son:"))
    minutosDia = int(input("Los minutos de funcionamiento del faro son:"))
    cantidadDestellosMin = int(input("Los destellos por minuto del faro son:", ))

    #Llamar función
    totalDestellos = CalcularDestellosFaro (horasDia, minutosDia, cantidadDestellosMin)

    #resultado al usuario
    print ("El faro ha dado en todo el día una cantidad total de:", totalDestellos,"destellos")

main()