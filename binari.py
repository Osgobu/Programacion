binari=int(input("Escribe un numero binario: "))

decimal = 0
i = 0
while (binari>0):
    resultado1 = binari%10
    binari = int(binari // 10)
    decimal = decimal + resultado1 * (2 **i)
    i= i + 1
print(decimal)