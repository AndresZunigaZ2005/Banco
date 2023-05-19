"""
Autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 22 de marzo de 2022
Código: 1094889063
Version 1
"""
#proceso 1: encontrar aumento con la categoría
def CalcularAumentoEmpleado (salarioEmpleado,categoria):
    if (categoria==4):
        aumentoEmpleado = salarioEmpleado+(salarioEmpleado*0.05)
        return aumentoEmpleado
    else: 
        if (categoria==3):
            aumentoEmpleado = salarioEmpleado+(salarioEmpleado*0.08)
            return aumentoEmpleado
        else:
            if(categoria==2):
                aumentoEmpleado = salarioEmpleado+(salarioEmpleado*0.1)
                return aumentoEmpleado
            else:
                if (categoria==1):
                    aumentoEmpleado = salarioEmpleado+(salarioEmpleado*0.12)
                    return aumentoEmpleado                    
            
def main():    
    #pedir entradas al usuario
    categoria = int(input("La categoría del empleado es de:"))
    salarioEmpleado = float(input("El salario del empleado en pesos colombianos es de:"))
    
    #invocar procesos
    aumentoEmpleado = CalcularAumentoEmpleado (salarioEmpleado,categoria)

    #Mostrar al ususario
    print ("El empleado de categoría",categoria, "con un aumento de",aumentoEmpleado-salarioEmpleado,
    "COP tiene un salario de",aumentoEmpleado,"COP")
main()