package GADJET_TEAM.proyectoCicloIII;

import clasesModeladas.Empleado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import clasesModeladas.Empresa;
import clasesModeladas.MovimientoDinero;

//@SpringBootApplication
public class ProyectoCicloIiiApplication {

	public static void main(String[] args) {

		// SpringApplication.run(ProyectoCicloIiiApplication.class, args);
		// Simulacion de CRUD en un arrayList para la clase Empresa

		// ArrayList
		ArrayList<Empresa> lista = new ArrayList<>();

		// Creacion de las instancias de Empresa en el ArrayList (Create)

		System.out.println("CREACION DE INSTANCIAS DE LA CLASE Empresa");
		System.out.println();

		lista.add(new Empresa(1, "digital source", "1110478-9", 310550541, "Carrera 14 No 2B-48 Sur"));
		lista.add(new Empresa(2, "open mind", "34569203", 7700960, "Carrera 18 No 56-43"));
		lista.add(new Empresa(3, "GADJET TEAM", "123456789", 310552541, "Calle 15 No 38-59"));

		System.out.println("Numero de empresas de la lista: " + lista.size());
		System.out.println("Informacion de las empresas");

		for (int i = 0; i < lista.size(); i++) {

			System.out.println((i + 1) + ") " + "Nombre: " + lista.get(i).getName() + ", nit: " + lista.get(i).getNit() + ", telefono: " + lista.get(i).getPhone() + ", direccion: " + lista.get(i).getAddress());
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		// Obtencion de una empresa especifica en el ArrayList (Read)

		System.out.println("OBTENCION DE UNA EMPRESA ESPECIFICA");
		System.out.println();

		System.out.println("Numero Id de la empresa en la lista: " + lista.get(2).getId());
		System.out.println("Informacion de la empresa");
		System.out.println(lista.get(2).getId() + ") " + "Nombre: " + lista.get(2).getName() + ", nit: " + lista.get(2).getNit() + ", telefono: " + lista.get(2).getPhone() + ", direccion: " + lista.get(2).getAddress());
		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// Modificacion de los datos una empresa especifica en el ArrayList (Update)

		System.out.println("MODIFICACION-ACTUALIZACION DE UNA EMPRESA ESPECIFICA");
		System.out.println();

		System.out.println("Numero Id de la empresa a modificar en la lista: " + "3");
		System.out.println("Datos a modificar: Nombre, nit, telefono y direccion");
		lista.get(2).setName("SUPER GADJET");
		lista.get(2).setNit("3467023");
		lista.get(2).setPhone(311289437);
		lista.get(2).setAddress("calle 7 No 3C-55 Sur");
		System.out.println("Informacion actualizada de la empresa");
		System.out.println((3) + ") " + "Nombre: " + lista.get(2).getName() + ", nit: " + lista.get(2).getNit() + ", telefono: " + lista.get(2).getPhone() + ", direccion: " + lista.get(2).getAddress());
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		;


		// Eliminacion de empresas en el arrayList (Delete)

		// Eliminacion de un empresa especifica

		System.out.println("ELIMINACION DE UNA EMPRESA ESPECIFICA");
		System.out.println();

		lista.remove(0);

		System.out.println("Numero de empresas de la lista: " + lista.size());
		System.out.println("Informacion de las empresas");

		for (int i = 0; i < lista.size(); i++) {

			System.out.println((i + 1) + ") " + "Nombre: " + lista.get(i).getName() + ", nit: " + lista.get(i).getNit() + ", telefono: " + lista.get(i).getPhone() + ", direccion: " + lista.get(i).getAddress());
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// Eliminacion de todas las empresas

		System.out.println("ELIMINACION DE TODAS LAS EMPRESAS DE LA LISTA");
		System.out.println();

		lista.clear();
		System.out.println("Numero de empresas de la lista: " + lista.size());
		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// Simulacion de CRUD en un arrayList para la clase Empleado

		// ArrayList
		ArrayList<Empleado> listaEmpleado = new ArrayList<>();

		// Creacion de las instancias de Empleado en el ArrayList (Create)

		System.out.println("CREACION DE INSTANCIAS DE LA CLASE Empleado");
		System.out.println();

		listaEmpleado.add(new Empleado(1, "Daniel Gonzalez", "dagh81.dg@gmail.com", "TGT GAMAS", "Operativo"));
		listaEmpleado.add(new Empleado(2, "Gerard Gonzalez", "geremmanuel9@gmail.com", "GADJET", "Administrativo"));
		listaEmpleado.add(new Empleado(3, "Adriana Castillo", "adriana19@gmail.com", "Movistar", "Administrativo"));
		listaEmpleado.add(new Empleado(4, "Edna Romero", "edna19@gmail.com", "Pfizer", "Administrativo"));
		listaEmpleado.add(new Empleado(5, "Jhonatan Jimenez", "jhonatan19@gmail.com", "Casaval", "Operativo"));

		System.out.println("Numero de Empleados de la lista: " + listaEmpleado.size());
		System.out.println("Informacion de los empleados");

		for (int i = 0; i < listaEmpleado.size(); i++) {

			System.out.println((i + 1) + ") " + "Nombre: " + listaEmpleado.get(i).getName() + ", email: " + listaEmpleado.get(i).getEmail() + ", Empresa: " + listaEmpleado.get(i).getEnterprise() + ", Rol: " + listaEmpleado.get(i).getRole());
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		// Obtencion de un empleado especifico en el ArrayList (Read)

		System.out.println("OBTENCION DE UN EMPLEADO ESPECIFICO");
		System.out.println();

		System.out.println("Numero Id del empleado en la lista: " + listaEmpleado.get(2).getId());
		System.out.println("Informacion del empleado");
		System.out.println(listaEmpleado.get(2).getId() + ") " + "Nombre: " + listaEmpleado.get(2).getName() + ", Email: " + listaEmpleado.get(2).getEmail() + ", Empresa: " + listaEmpleado.get(2).getEnterprise() + ", Rol: " + listaEmpleado.get(2).getRole());
		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// Modificacion de los datos un empleado especifico en el ArrayList (Update)

		System.out.println("MODIFICACION-ACTUALIZACION DE UN EMPLEADO ESPECIFICO");
		System.out.println();

		System.out.println("Numero Id del empleado a modificar en la lista: " + "3");
		System.out.println("Datos a modificar: Nombre, Email, Empresa y Rol");
		listaEmpleado.get(2).setName("Juan Perez");
		listaEmpleado.get(2).setEmail("3467023@gmail.com");
		listaEmpleado.get(2).setEnterprise("Exito");
		listaEmpleado.get(2).setRole("Operativo");
		System.out.println("Informacion actualizado del empleado");
		System.out.println((3) + ") " + "Nombre: " + listaEmpleado.get(2).getName() + ", Email: " + listaEmpleado.get(2).getEmail() + ", Empresa: " + listaEmpleado.get(2).getEnterprise() + ", Rol: " + listaEmpleado.get(2).getRole());
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		;
// Simulacion de CRUD en un arrayList para la clase MovimientoDinero

		// ArrayList
		ArrayList<MovimientoDinero> listaMovDinero = new ArrayList<>();

		// Creacion de las instancias de listaMovDinero en el ArrayList (Create)

		System.out.println("CREACION DE INSTANCIAS DE LA CLASE MovimientoDinero");
		System.out.println();

		listaMovDinero.add(new MovimientoDinero(1, "compra al proveedor de empanadas, ", 500000.0, listaEmpleado.get(2).getName(), MovimientoDinero.typeTran.Ingreso));
		listaMovDinero.add(new MovimientoDinero(2, "pago recibo agua, ", -30000.0, listaEmpleado.get(3).getName(), MovimientoDinero.typeTran.Egreso));
		listaMovDinero.add(new MovimientoDinero(3, "pago recibo luz, ", -90000.0, listaEmpleado.get(3).getName(), MovimientoDinero.typeTran.Egreso));
		listaMovDinero.add(new MovimientoDinero(4, "ganancias venta empanadas, ", 400000.0, listaEmpleado.get(1).getName(), MovimientoDinero.typeTran.Ingreso));
		listaMovDinero.add(new MovimientoDinero(5, "pago recibo internet, ", -90000.0, listaEmpleado.get(3).getName(), MovimientoDinero.typeTran.Egreso));

		System.out.println("Numero de Movimientos de la lista: " + listaMovDinero.size());
		System.out.println("Informacion de los movimientos");

		for (int i = 0; i < listaMovDinero.size(); i++) {

			System.out.println(listaMovDinero.get(i).getId() + ") " + "Concepto: " + listaMovDinero.get(i).getConcept() + "Monto: " + listaMovDinero.get(i).getAmount() + ", Usuario encargado: " + listaMovDinero.get(i).getUser() + ", Tipo de Movimiento: " + listaMovDinero.get(i).getTipo());
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		// Obtencion de un Movimiento de Dinero especifico en el ArrayList (Read)

		System.out.println("OBTENCION DE UN MOVIMIENTO DE DINERO ESPECIFICO");
		System.out.println();

		System.out.println("Numero Id del movimiento en la lista: " + listaMovDinero.get(2).getId());
		System.out.println("Informacion del movimiento");
		System.out.println(listaMovDinero.get(2).getId() + ") " + "Concepto: " + listaMovDinero.get(2).getConcept() + "Monto: " + listaMovDinero.get(2).getAmount() + ", Usuario encargado: " + listaMovDinero.get(2).getUser() + ", Tipo de Movimiento: " + listaMovDinero.get(2).getTipo());
		System.out.println("----------------------------------------------------------------------------------------------------------------------");


		// Modificacion de los datos un empleado especifico en el ArrayList (Update)

		System.out.println("MODIFICACION-ACTUALIZACION DE UN MOVIMIENTO ESPECIFICO");
		System.out.println();

		System.out.println("Numero Id del movimiento a modificar en la lista: " + listaMovDinero.get(2).getId());
		System.out.println("Datos a modificar: Concepto, Monto, Usuario a cargo y tipo de movimiento");
		listaMovDinero.get(2).setConcept("ganancias venta gaseosa");
		listaMovDinero.get(2).setAmount(20000.0);
		listaMovDinero.get(2).setUser("Natalia Torres");
		listaMovDinero.get(2).setTipo(MovimientoDinero.typeTran.Ingreso);
		System.out.println("Informacion actualizada del movimiento");
		System.out.println(listaMovDinero.get(2).getId() + ") " + "Concepto: " + listaMovDinero.get(2).getConcept() + "Monto: " + listaMovDinero.get(2).getAmount() + ", Usuario encargado: " + listaEmpleado.get(2).getName() + ", Tipo de Movimiento: " + listaMovDinero.get(2).getTipo());
		System.out.println("----------------------------------------------------------------------------------------------------------------------");


	}

}



