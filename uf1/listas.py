AFEGIR = 1
ELIMINAR = 2
LLISTAR = 3

llista = []

opcion = int(input("Que quieres hacer 1 Afegir 2 Eliminar 3 Llistar:"))
    if opcion == AFEGIR:
        nombre = input("Introdueix el nombre del usuari")
        llista.append(nombre)
    else:
        if opcion == ELIMINAR:
            nombre = input("Introdueix el nombre del usuari a eliminar")
            llista.remove(nombre)
        else:
            if opcion == LLISTAR:
                print("Opcion A")
                for i in range(0, len(llista)):
                    print(llista(i))
                print("Opcion B")

