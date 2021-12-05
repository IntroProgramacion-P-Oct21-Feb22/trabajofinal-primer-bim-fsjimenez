X = float(input("Ingrese el valor de X: "))
Y = float(input("Ingrese el valor de Y: "))


if X > 0 and Y > 0:
    print("Las coordenadas pertenecen al primer cuadrante.")
else:
    if X < 0 and Y > 0:
        print("Las coordenadas pertenecen al segundo cuadrante.")
    else:
        if X < 0 and Y < 0:
            print("Las coordenadas pertenecen al tercer cuadrante.")
        else:
            if X > 0 and Y < 0:
                print("Las coordenadas pertenecen al cuarto cuadrante.")