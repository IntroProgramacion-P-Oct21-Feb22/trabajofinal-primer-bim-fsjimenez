
angulo1 = float(input("Ingrese el primer ángulo: "))
angulo2 = float(input("Ingrese el segundo ángulo:  "))
angulo3 = float(input("Ingrese el tercer ángulo:  "))

if angulo1 == 90 or angulo2 == 90 or angulo3 == 90:
    print("El ángulo es rectángulo")
else:
    if (angulo1 > 90 and angulo1 < 180) or (angulo2 > 90 and angulo2 < 180) or (angulo3 > 90 and angulo3 < 180):
        print("El ángulo es obtusángulo")
    else:
        if (angulo1 < 90 and angulo2 < 90 and angulo3 < 90):
            print("El ángulo es acutángulo")
