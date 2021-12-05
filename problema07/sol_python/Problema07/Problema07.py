limite = int(input("Ingrese un número par: "))
numero = 2
suma = 0
cadena = ""

while numero <= limite:
    if limite < 2:
        print("Error. El número es menor a 2")
    else:
        suma = suma + numero
        cadena = cadena + str(numero) + " + "
        numero = numero + 2


print(str(cadena) + " = " + str(suma))
