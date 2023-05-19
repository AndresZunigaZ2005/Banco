"""autor:juan sebastian noreña espinosa
   fecha: 06 de abril del 2022
   codigo: 1091884599"""

#Calculo Sumatoria Numeros
def sumatoriaNumeros(numero):
    n = 1
    sumatoria = 0

    while (n <= numero):
        sumatoria = sumatoria + n
        n += 1

    return sumatoria

#procedimiento principal
def run():
    numero = int(input("Digite un numero entero por favor: "))

    valor = sumatoriaNumeros(numero)
    print(f'El valor de la sumatoria de los primeros ({numero}) numeros es: {valor}')


if __name__ == '__main__':
    run()