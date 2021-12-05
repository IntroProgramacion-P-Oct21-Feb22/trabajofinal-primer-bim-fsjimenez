

cantidadTrajes = int(input("Ingrese la cantidad de trajes a comprar: "))
precioUnidad = float(input("Ingrese el precio por cada unidad:  "))
porcentaje1 = 20
porcentaje2 = 25
porcentaje3 = 40
porcentaje4 = 50

subtotal = cantidadTrajes * precioUnidad

if cantidadTrajes == 1:
    descuento = (porcentaje1 * subtotal)/100;
    valorTotal = subtotal - descuento;
else:
    if (cantidadTrajes == 2):
        descuento = (porcentaje2 * subtotal)/100;
        valorTotal = subtotal - descuento;
    else:
        if (cantidadTrajes == 3):
            descuento = (porcentaje3 * subtotal) / 100;
            valorTotal = subtotal - descuento;
        else:
            if (cantidadTrajes > 3):
                descuento = (porcentaje4 * subtotal) / 100;
                valorTotal = subtotal - descuento;

print("Subtotal: %s\nDescuento: %s\nCosto Total: %s\n" % (subtotal, descuento, valorTotal))




