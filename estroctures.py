"""
Escriu un programa en Python3 que llegeixi de l’usuari una llista de tuples, on cada tupla representa un estudiant amb la següent informació: (Nom, Cognom, Edat, Nota1, Nota2, Nota3).

Calcula la mitjana ponderada de les notes de cada estudiant, on la Nota1 té un pes del 30%, la Nota2 un pes del 40% i la Nota3 un pes del 30%.

Mostra només els estudiants que compleixen alguna de les següents condicions:
• La mitjana és superior a 7.
• Tenen una nota superior a 8 en qualsevol de les tres proves.

Classifica els estudiants en dues llistes diferents: una per als estudiants que compleixen la primera condició i una altra per als que compleixen la segona.

Pinta per pantalla les dues llistes de la següent forma: titol o nom representatiu de la llista, salt de linia i tabulació i la informació de l’estudiant i les seves notes.
 Cada estudiant en una nova linia tabulada. Recordeu que els títols no han d’anar tabulats.
"""

#PRE: Queremos saber cuales la informacion de cada estudiante y que notas tiene

a=int(input("Escibeme cuantos alumnos hay: "))
alumn=int(input("Escribe las  tres notas que has sacado: "))
contador=1
almuno1=[]
alumno2=[]
alumno3=[]
lista=[]
while contador < alumn:
    nom=input("Escriu el teu nom:")
    cognom=input("Escriu el teu cognom:")
    edat=int(input("Escriu la teva edad:"))
    nota1=int(input("Escriu la teva primera nota del teu examen:"))
    nota2=int(input("Escriu la teva segona nota de l'examen:"))
    nota3=int(input("Escriu la teva tercera nota:"))

    alumno=(nom,cognom,edat,nota1,nota2,nota3)

    resultado_final= (nota1*0.30) + (nota2 * 0.40) + (nota3 * 0.30)
    if resultado_final <= 7:
        lista.append(resultado_final)
        
    if alumno1>=8 or alumno2>=8 or alumno3>=8:
        lista.append(resultado_final)





