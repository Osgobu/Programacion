#Primeras puntuaciones y las guardamos.
puntuaciones = [jugador1 == [3, 19, 17, 11, 5, 14, 14, 1, 1, 16, 5, 16, 14, 7, 17], jugador2 == [10, 16, 1, 18, 17, 17, 14, 20, 10, 7, 7, 8, 2, 10, 9], jugador3 == [10, 18, 11, 4, 2, 7, 6, 2, 4, 15, 11, 9, 6, 12, 17], jugador4 == [11, 10, 11, 13, 10, 16, 5, 7, 9, 11, 18, 5, 1, 4, 1], jugador5 == [2, 12, 16, 5, 12, 18, 7, 11, 7, 18, 7, 6, 6, 18, 5]]
categoria1 = []
categoria2 = []
categoria3 = []
categorias = [categoria1, categoria2, categoria3]
#Aqui hago las desiancion de tipos con la mediana

mediana = sum(jugador1+jugador2+jugador3+jugador4+jugador5) / int(len(puntuaciones))
print("La mediana es: ", mediana)

#Aqui lo que hago es que me muestre la categoría empezando des de el numeor 0 y que me muestre en que categoria esta.
for numero in puntuaciones:
    if numero[0] > mitjana:
        categoria1.append(numero)
    elif numero[0] == mitjana:
        categoria2.append(numero)
    elif numero[0] < mitjana:
        categori3.append(numero) 
categorias = [categoria1, categoria2, categoria3]
print("La categoria es:", categorias)


#Realizo la desviacion y sus operaciones correspondientes
diferencia = sum((numero - mediana) ** 2) 
for numero in puntuaciones:
    varianza = diferencia/len(puntuaciones) 
    desviacion = varianza ** 0.5
print("La desviación es: ", desviacion)
# e hecho un intetno del patron temporal avanzado, nome sale correcto por un error y la verdad me esta apuntode explotar la cabeza creo qeu la idea esta mas o menosbien
for j in range(1, len(puntuaciones)-1):
    if puntuaciones[j-1] < puntuaciones[j] and puntuaciones[j] > puntuaciones[j+1]:
        patron = [puntuaciones[j-1], puntuaciones[j+1]]
        patrons_avanzado[0].append(patron)
    elif puntuaciones[j-1] > puntuaciones[j] and puntuaciones[j] < puntuaciones[j+1]:
            patron=[puntuaciones[j-1], puntuaciones[j+1]]
            patrones_avancados[1].append(patron)
print("Los avanzados son",patrones_avanzados)
