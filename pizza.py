

ccomanda=[]

def Comanda(ccomanda):
    comanda=0
    while comanda < 5:
        comanda=int(input("Escribe que pizza quieres: 1 pizza 4 quesos, 2 pizza de jamon con queso, 3 pizza carbonara, 4 pizza Bbq "))
        if comanda == 1:
            print("Pizza 4 quesos")
            ccomanda.append(comanda)
        if comanda == 2:
            print("Pizza jamon con queso")
            ccomanda.append(comanda)
        if comanda == 3:
            print ("Pizza carbonara")
            ccomanda.append(comanda)
        if comanda == 4:
            print("Pizza Bbq")  
            ccomanda.append(comanda)
Comanda(ccomanda)

def stock(pizza4, pizzaj, pizzac, pizzab):
#iba a hacer otra funcion del stcok con las pizzas



