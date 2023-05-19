"""
Autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 22 de marzo de 2022
Código: 1094889063
Version 1
"""
#proceso 1: Calcular aumento dependiendo del salario actual
def CalcularAumentoSalario (sueldoEmpleado):
    if (sueldoEmpleado<300000):
        aumentoSalario = sueldoEmpleado+(sueldoEmpleado*0.12)
        return aumentoSalario
    else:
        if (sueldoEmpleado>300000 and sueldoEmpleado<500000):
            aumentoSalario = sueldoEmpleado+(sueldoEmpleado*0.1)
            return aumentoSalario
        else:
            sueldoEmpleado+(sueldoEmpleado*0.05)

def main():
    #pedir datos al ususario
    salarioEmpleado = float(input("Ingrese el salario del empleado en pesos colombianos: "))
    
    #invocar proceso
    aumentoSalario = CalcularAumentoSalario (salarioEmpleado)
    
    #mostrar al usuario
    print ("El nuevo salario del empleado es de",aumentoSalario,"COP")
main()