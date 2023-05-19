"""
    autor: Andrés Felipe Zúñiga Zuluaga
    Descripción: único archivo general
"""
#Proceso leer cadenas
def leerString (msj):
    cadena = input(msj)
    return cadena

#Proceso leer entero
def leerInt (msj):
    entero = int(input(msj))
    return entero

#Proceso leer reales
def leerfloat (msj):
    real = float(input(msj))
    return real

#Proceso leer string arreglo
def LeerArregloString (tamArreglo):
    arreglo = [0]*tamArreglo
    numeros = 0
    for i in range (0, tamArreglo, 1):
        numeros = leerString("Ingrese el texto o cadena en la posición "+str(i+1)+str(": "))
        arreglo [i] = numeros
    return arreglo

#Proceso leer entero en arreglos
def LeerArregloInt (tamArreglo):
    arreglo = [0]*tamArreglo
    numeros = 0
    for i in range (0, tamArreglo, 1):
        numeros = leerInt("Ingrese el número en la posición "+str(i+1)+str(": "))
        arreglo [i] = numeros
    return arreglo

#Proceso leer float en arreglos
def LeerArregloFloat (tamArreglo):
    arreglo = [0]*tamArreglo
    numeros = 0
    for i in range (0, tamArreglo, 1):
        numeros = leerfloat("Ingrese el número en la posición "+str(i+1)+str(": "))
        arreglo [i] = numeros
    return arreglo

#¿Es una vocal?
def isVocal (letra):
    esVocal=False
    if (letra=='a' or letra=='A' or letra=='e' or letra=='E' or letra=='i' or letra=='I' or letra=='o' or letra=='O' or letra=='u' or letra=='U'):
        esVocal=True
    return esVocal

#ContarSimbolos
def contarSimbolo (texto,simbolo):
    min=0
    max=len[texto]
    cont=0
    while (min<max):
        if(simbolo==texto[min]):
            cont+=1
        min+=1
    return cont

#ImprimirArreglo
def imprimirArreglo(arreglo):
    cad="[  " 
    tam= len(arreglo)
    for i in range(0,tam):
        cad+=str(arreglo[i])+"  "
    cad+="]"
    imprimir(cad)
    return arreglo

#Procedimiento
def imprimir (msj):
    print (msj)