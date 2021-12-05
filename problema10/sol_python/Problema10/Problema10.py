condicion = "si"
contador = 0
sumaNumeros = 0
media = float
XiX = float
sumaXiX = 0


while condicion == "si":
    numero = int(input("Ingrese un numero: "))
    sumaNumeros = sumaNumeros + numero
    condicion = str(input("Ingrese 'si' para seguir introduciendo números: "))
    contador = contador + 1
    media = sumaNumeros / contador
    XiX = (numero - media)**2
    sumaXiX = (sumaXiX) + (XiX)

varianza = sumaXiX/(contador - 1)

print("La media aritmética es: %.2f\nLa varianza es: %.2f" % (media, varianza))
