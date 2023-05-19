from re import A
from Biblioteca import *
"""
Nombre:Andrés Felipe Zúñiga Zuluaga 
Código:1094889063
Descripción: Taller de ciclos y cadenas
"""
#Procedimiento 1
def desarrollarPunto1 (texto):
    min=0
    max=len[texto]
    contVocales=0
    while (min<max):
        if (isVocal[True]):
            contVocales+=1
        min+=1
    return contVocales

#Procedimiento 2
def desarrollarPunto2 (texto):
    textoMayus =texto.upper()
    contarA = contarSimbolo (textoMayus, 'A')
    contarE=contarSimbolo (textoMayus, 'E')
    contarI=contarSimbolo (textoMayus, 'I')
    contarO=contarSimbolo (textoMayus, 'O')
    contarU=contarSimbolo (textoMayus, 'U')

    resp = "la cantidad de A son"+str(contarA)
    "la cantidad de E son"+str(contarE)
    "la cantidad de I son"+str(contarI)
    "la cantidad de O son"+str(contarO)
    "la cantidad de U son"+str(contarU)

    return resp

#Procedimiento 3
def desarrollarPunto3 (texto):
    textoRes=""
    letra = 0
    tam = len[texto]
    while (letra < tam):
        if (not(isVocal[letra])):
            textoRes+=letra
        letra+=1
#Procedimiento 4

#Procedimiento 5
def desarrollarPunto5 (texto,caracter):
    min=0
    max=len[texto]
    Igualdad=False
    while(min<max):
        if (min==caracter):
            Igualdad=True
        min+=1
    return Igualdad
#Procedimiento 6
def desarrollarPunto6 (texto):
    min=0
    tam= len[texto]
    textoEncriptado= ""
    
        
    return min

#Procedimiento 7
def desarrollarPunto7 (numero):
    min = 1
    texto=""
    while (min <= numero):
        texto=texto+'*'
        min+=1
    imprimir (texto)

#Procedimiento 8
def desarrollarPunto8 (num):
    for i in range (1, num+1,1): 
        desarrollarPunto7(num)

#Procedimiento 9
def desarrollarPunto9 (num):
    min = 1
    texto =  ""
    while (min <= num):
        while(min<=num):
            imprimir (num*'*')
            texto+=str(min)        
            min+=1

#Procedimiento 10
def desarrollarPunto10 (numero):
    for i in range (1, numero+1, 1):
        figura = ""
        for j in range (1,numero+1,1):
            figura +=str(i)
        imprimir (figura)

#Procedimiento 11
def desarrollarPunto11 (numero):
    texto=""
    min=1
    while (min <= numero):
        texto=texto+str[min]
        imprimir (texto)
        min+=1



def generarMsjMenu():
    msj= "\nBIENVENIDOS AL TALLER DE CICLOS Y FUNCIONES"
    msj+="\n\nSeleccione la opcion que desar probar:\n "
    msj+="\n1.Contar vocales de un texto."
    msj+="\n2.Contar vocales de un texto de manera detallada."
    msj+="\n3.Suprimir vocales de un texto."
    msj+="\n4.Mostrar nombres que iniciaron en vocal, cuantos finalizaron en consonantes y de los nombres ingresados cuantos inician en minuscula"
    msj+="\n5.Poicion del caracter dentro de la cadena."
    msj+="\n6.Descubir mensaje encriptado."
    msj+="\n7. Linea de asteríscos. "
    msj+="\n8.Cuadrado de asteríscos utilizando la función anterior. "
    msj+="\n9.Cuadrado de asteríscos usando otra función. "
    msj+="\n10.Cuadrado de números. "
    msj+="\n11.Escalera de números consecutivos. "    
    msj+="\n0.Para terminar. "
    msj+="\nPor favor escriba el número que desea seleeccionar: "
    return msj

#procedimiento que genera el menu de opciones en codigo, una vez el usuario ya seleccionó la opción
def generarMenu():
    opcion=-1
    ejecutar=True
    while(ejecutar):
        msjMenu = generarMsjMenu()
        opcion = leerInt(msjMenu)
        if(opcion==1):
            desarrollarPunto1()
        elif(opcion==2):
            desarrollarPunto2()
        elif(opcion==3):
            desarrollarPunto3()
        elif(opcion==4):
            desarrollarPunto4()
        elif(opcion==5):
            desarrollarPunto5()
        elif(opcion==6):
            desarrollarPunto6()
        elif(opcion==7):
            desarrollarPunto7()
        elif(opcion==8):
            desarrollarPunto8()
        elif(opcion==9):
            desarrollarPunto9()
        elif(opcion==10):
            desarrollarPunto10()
        elif(opcion==11):
            desarrollarPunto11()
        elif(opcion==0):
            ejecutar=False
        else:
            imprimir("opcion incorrecta")
           
        imprimir("Muchas gracias por su visita, lo esperamos pronto\n\n")

#principal
def main():
        generarMenu()
main()

