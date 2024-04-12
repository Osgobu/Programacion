Anyadir = 1
Eliminar = 2 
Listar = 3
Salir= 4

servidor = []

borrar = True
i=0
fin_programa = False

while fin_programa == False:
    opcion = int(input("Que quieres hacer ? 1 Añadir, 2 Eliminar, 3 Lisatar, 4 Salir"))
    if opcion == Anyadir:
        nom = input("Escribe el nombre del nuevo servidor:")
        ip = input("Escribe el ip del nuevo servidor:")
        estado = input ("Escribe el estado del nuevo servidor si activo/inactivo:")
        tupla = (nom, ip, estado)
        servidor.append(tupla)
    else:
        if opcion == Eliminar:
            eliminar = input("Escribe el servidor que quieres eliminar:")
            while i < len(servidor) and borrar == False:
                if servidor [i][0] == eliminar:
                    borrar = True 
                else:
                    i = +1
            servidor.remove(servidor[i])
        else:
            if opcion == Listar:
                for listar in range(0, len(servidor)):
                    print("Nombre del servidor", servidor[i][0])
                    print("IP del servidor", servidor[i][1])
                    print("Listar del servidor", servidor[i][2])
            else:
                if opcion == Salir:
                    fin_programa = True




