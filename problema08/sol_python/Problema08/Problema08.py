limite = int(input("Ingrese el número de metros: "))
metro = 1
cadena = ""
centimetro = float
pulgada = float
pies = float
yarda = float

while metro <= limite:
    centimetro = metro * 100
    pulgada = centimetro / 2.54
    pies = pulgada / 12
    yarda = pies / 3
    cadena = "%s   %s	   %.2f	       %.2f	    %.2f\n" % (cadena, metro, yarda, pulgada, pies)
    metro = metro + 1

print("Metros	  Yardas	  Pulgadas	    Pies")
print(cadena)