"""
Autor: Andrés Felipe Zúñiga Zuluaga
Fecha: 23 de marzo
Código: 1094889063
Versión 1
"""
#Proceso 1: calcular definitiva
def CalcularDefinitiva (nota1,nota2,nota3):
    definitiva = (nota1*0.3+nota2*0.3+nota3*0.4)
    return definitiva

#Porceso 2: calcular MultaDescuento del valor del curso
def CalcularValorCurso (valorCurso, definitiva):
    if (definitiva>=0.0 and definitiva<=0.9):
        multaDescuento = valorCurso+(valorCurso*0.4)
        return multaDescuento
    else:
        if (definitiva>=1.0 and definitiva<=1.9):
            multaDescuento = valorCurso+(valorCurso*0.2)
            return multaDescuento
        else:
            if (definitiva>=2.0 and definitiva<=2.9):
                multaDescuento = valorCurso+(valorCurso*0.1)
                return multaDescuento
            else:
                if (definitiva>=3.0 and definitiva<=3.9):
                    multaDescuento = valorCurso-(valorCurso*0.2)
                    return multaDescuento
                else:
                    if (definitiva>=4.0 and definitiva<=4.4):
                        multaDescuento = valorCurso-(valorCurso*0.3)
                        return multaDescuento
                    else:
                        if (definitiva>=4.5 and definitiva<=5.0):
                            multaDescuento = valorCurso-(valorCurso*0.4)
                            return multaDescuento
                            
def main ():
    #Pedir datos al usuario
    nota1 = float(input("Ingrese la nota 1:"))
    nota2 = float(input("Ingrese la nota 2:"))
    nota3 = float(input("Ingrese la nota 3:"))
    valorCurso = float(input("Ingrese el valor del curso:"))

    #Llamar proceso 1
    definitiva = CalcularDefinitiva (nota1,nota2,nota3)

    #Llamar proceso 2:
    multaDescuento = CalcularValorCurso (valorCurso,definitiva)

    #Mostrar al ususario
    print ("El valor del curso de:",multaDescuento,"COP, con una definitiva de",definitiva)
main ()