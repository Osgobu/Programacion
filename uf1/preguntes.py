

acaba= 0
punros=0

llista_preguntas["Capital españa? ","Que numero lleva Messi? ", "Que año se descubrio America? ", "De que juega Oblak? ", "Cuantos Mundiales tiene España? "]
respuestas["Madrid","10","14922", "Portero", "1"]

seed = int(input("Introduce u numero mayor que 0:"))

while acabar is 0:
    seed = (seed * 997) % 1000
    random = (seed * 503) % 1000 / 100
    numero_pregunta = int(random * (len(llista_preguntes)))
    print(numero_pregunta)
    respuesta = input(llista_preguntas[numero_pregunta])
    puntos += 1 if respuesta == llista_respuestas[numero_pregunta] else 0
    para = int(input("Si no quieres seguir jugando? [0 para seguir, 1 para parar]"))

print("Tus puntos han sido:", puntos)