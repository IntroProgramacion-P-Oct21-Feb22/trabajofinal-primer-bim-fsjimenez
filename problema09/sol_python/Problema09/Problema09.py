c1 = 12
c2 = 11
limite = int(input("Ingrese el número de términos a presentar: "))
c3 = 0
contador = 1


while contador <= limite:
    if contador % 2 == 0:
        c3 = c3 + c1
    else:
        if contador % 2 == 1:
            c3 = c1 - c2

    c1 = c1 + 12
    c2 = c2 + 11

    print("Los %s primeros términos equivale(n) a: %s\n" % (contador, c3))

    contador = contador + 1