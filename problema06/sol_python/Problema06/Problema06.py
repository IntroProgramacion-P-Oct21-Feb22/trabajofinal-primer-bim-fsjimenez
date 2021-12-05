limite = 100
numerador = 1
denominador = 2
cadena = "+1"

while(denominador <= limite):
    cadena = str(cadena) + " +" + str(numerador) + "/" + str(denominador)
    denominador = denominador + 1

print(cadena)