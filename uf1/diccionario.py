ANYADIR = 1
ELIMINAR = 2
MOSTRAR = 3

num = 0

dispositius = {}

fin = False

while num<4:
    opcion = input("Escribe que opcoin quieres hacer 1 Anyadir, 2 Eliminar,3 Mostrar o 4 Salir")

    if opcion == ANYADIR:
        anyadir = print("Escrcibe el nombre que quieres añadir")
        aanyadir = print("Escribe la direccion IP que quieres añadir")
        dispositius[anyadir]=aanyadir
    else:
        if opcion == ELIMINAR:
            eliminar = print ("Escribe el nombre y la direccion IP del despositivo que quieres eliminar")
            del dispositius(anyadir)
            else:
                if opcion == MOSTRAR:
                    print(dispositius)                
