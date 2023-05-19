"""
autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 12 de marzo
Código: 1094889063
Versión 1
"""

#Función 1
from pip import main


def CalcularTiempos (hora,horaSegundos,minutos,minutosSegundos,segundos):
    tiempos= ((hora*horaSegundos)+(minutos*minutosSegundos)+segundos)
    return tiempos

#Función 2
def CalcularSumaTiempos (tiempo1,tiempo2):
    sumaTiempos= (tiempo1+tiempo2)
    return sumaTiempos

def main():
    #invocar Función
    segundosTiempo1 = CalcularTiempos (2,3600,30,60,25)

    segundosTiempo2 = CalcularTiempos (1,3600,26,60,55)

    tiempoTotal = CalcularSumaTiempos (segundosTiempo1,segundosTiempo2)

    print ("El tiempo total de los dos corredores es de", tiempoTotal, "segundos.")

main()