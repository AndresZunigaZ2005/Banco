from Biblioteca import *
"""numero = "LUIS"
tam = len(numero)
min = 1
texto =  ""
while (min < tam):
    while (min<tam):
        texto+=str (min)
        print (texto)
        min+=1        
"""   

"""
#Punto 4
texto = input ("Añade un texto:")
textoresp=""
min=0
while (min<10):
    if (not (isVocal[min])):
        textoresp+=min
print (textoresp)
"""
"""
num=2945
numero=4
min=0
textoReversa=""
numeroCadena=str (num)
while (min<numero):
    textoReversa+=numeroCadena[numero-1]
    print (textoReversa)
    numero-=1
print (numeroCadena)"""

"""numero= 9
for i in range (1, numero+1, 1):
    figura = ""
    for j in range (1,numero+1,1):
        figura +=str(i)
    print (figura)
"""
"""num =5
for i in range (1, num+1,1): 
    min = 1
    texto=""
    while (min <= num):
        texto=texto+'*'
        min+=1
    print (texto)
"""

"""
num = int(input("Ingrese un número entero: "))
arreglo = [0]*num
for i in range (0, num, 1):
    nombres = input("ingrese un nombre: ")
    arreglo [i] = nombres
imprimirArreglo(arreglo)
"""
"""
def LeerArregloInt (tamArreglo):
    arreglo = [0]*tamArreglo
    numeros = 0
    for i in range (0, tamArreglo, 1):
        numeros = leerInt("Ingrese el número en la posición "+str(i+1)+str(": "))
        arreglo [i] = numeros
    return arreglo

def IngresarTamañoArregloInt ():
    tamArreglo = leerInt("El tamaño del arreglo es: ")
    arreglo = LeerArregloInt (tamArreglo)
    imprimir (arreglo)

def main():
    IngresarTamañoArregloInt ()
main()        
"""