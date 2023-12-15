#PRE: Queremos saber cuales la informacion de cada estudiante y que notas tiene

nom=input("Escriu el teu nom:")
cognom=input("Escriu el teu cognom:")
edat=int(input("Escriu la teva edad:"))
nota1=int(input("Escriu la teva primera nota del teu examen:"))
nota2=int(input("Escriu la teva segona nota de l'examen:"))
nota3=int(input("Escriu la teva tercera nota:"))

alumno=(nom,cognom,edat,nota1,nota2,nota3)

resultado_final= (nota1*0,30) + (nota2 * 0,40) + (nota3 * 0,30)
if (resultado_final <= 7) or nota1>=8 nota2>=8 nota3>=8:
    print(resultado_final)




