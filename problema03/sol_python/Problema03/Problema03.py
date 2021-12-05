nombre = (input('Ingrese el nombre del empleado: '))
tipoEmpleado = int(input("Inrese el tipo de empleado (1, 2, 3 o 4): "))
numeroHoras = float(input("Ingrese el número de horas trabajadas: "))
cuotaHora = float(input("Ingrese la cuota a pagar por hora: "))
sueldo = float

sueldo = numeroHoras * cuotaHora

if tipoEmpleado == 1 and numeroHoras >= 40:
    cuotaHora = 1.5 * cuotaHora
    sueldo = cuotaHora * numeroHoras
else:
    if tipoEmpleado == 2:
        cuotaHora = 2 * cuotaHora
        sueldo = cuotaHora * numeroHoras
    else:
        if tipoEmpleado == 3:
            cuotaHora = 2.5 * cuotaHora
            sueldo = cuotaHora * numeroHoras
        else:
            if tipoEmpleado == 4:
                cuotaHora = 3 * cuotaHora
                sueldo = cuotaHora * numeroHoras

print("El sueldo es de: %s" % (sueldo))