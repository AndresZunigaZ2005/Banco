"""autor:juan sebastian noreña espinosa
   fecha: 06 de abril del 2022
   codigo: 1091884599"""

#Calculo Cuadrado Perfecto
def cuadradoPerfecto(numero):
    i = 2

    for i in range(2, numero+1):
        n = 1

        while (n * n <= i):
            if (n * n == i):
                print(f'El numero {i} es un cuadrado perfecto')

            n += 1


#procedimiento principal
def run():
    numero = int(input("Digite un numero entero por favor: "))

    cuadradoPerfecto(numero)


if __name__ == '__main__':
    run()