llistapreg((Como te llamas? )(Cuantos años tienes?)(Que signo eres? )(Que fecha es tu cumpleaños? )(Te gusta la pizza de piña? ))

seed = (seed * 997) % 1000
random = (seed * 503) % 1000 / 100
numero_pregunta = int(random * (len(llista_preguntes)))

