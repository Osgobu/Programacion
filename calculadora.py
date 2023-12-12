#PRE: Recibiremos 2 numeros enteros y un numero que indique la operacion
def calculadora():
    TXT_INTRODUCIR_NUMEROS = "Introudcir numeros"
    TXT_INTRODUCE_OPERACION = "introudicr que operacion hacer q para suma 1 para resta 2 para multiplicacion 3 para division 4:"
    SUMA = 1
    RESTA = 2
    MULTIPLICACION = 3
    DIVISION = 4

    a = None
    b = None
    operacion = None
    result = None

    a=int(input(TXT_INTRODUCIR_NUMEROS))
    operacion = int(input(TXT_INTRODUCE_OPERACION))
    b = int(input(TXT_INTRODUCIR_NUMEROS))

    if operacion == SUMA:
        result = a + b
    else:
        if operacion == RESTA:
            result = a - b
        else: 
            if operacion == DIVISION:
                result = a // b
            else:
                if operacion == MULTIPLICACION:
                    result = a * b

    print(result)
calculadora()
#POST: Devolvemos el resultado de la operacion seleccionado si esat existe