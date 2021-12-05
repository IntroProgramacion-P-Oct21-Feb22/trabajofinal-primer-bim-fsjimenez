numero1 = float(input("Ingrese el primer número: "))
numero2 = float(input("Ingrese el segundo número: "))


if numero1 == numero2 or numero2 == numero3 or numero1 == numero3:
    print("Error, los números deben ser diferentes")
else:
    if numero1 > numero2 and numero1 > numero3:
        print("El número mayor es: %s" % (numero1))
    else:
        if numero2 > numero1 and numero2 > numero3:
            print("El número mayor es: %s" % (numero2))
        else:
            if numero3 > numero1 and numero3 > numero2:
                print("El número mayor es: %s" % (numero3))