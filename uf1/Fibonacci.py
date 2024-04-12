#Pre:Genrerar un fibonucci con el numero que te introduce el usuario

N=int(input("Introduce un numero entero"))

numemro1=0
numero2=1
numero3=0

if N<=0:
    print("Introduce un numero de nuevo")
else:
    for i in range(1 , N+1):
        numemro1=numero2
        numero2=numero3
        numero3=numero2+numemro1
        print(numero3)
#Post:ver cuantos numeros ha escrito mi codigo