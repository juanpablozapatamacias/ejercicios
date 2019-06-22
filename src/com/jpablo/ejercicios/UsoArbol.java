package com.jpablo.ejercicios;

import javax.swing.JOptionPane;

public class UsoArbol {
	
	public static void main(String[] argc) {
		int opcion=0,elemento;
		String nombre;
		ArbolBinarioA miarbolito = new ArbolBinarioA();
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Agregar Nodo\n" 
						+ "2. Recorrer Arbol In Orden\n"
						+ "3. Recorrer Arbol pre Orden\n"
						+ "4. Recorrer Arbol post Orden\n"
						+ "5. Invertir arbol\n"
						+ "6. Buscar nodo en Arbol\n"
						+ "7. Eliminar nodo en Arbol\n"
						+ "8. Salir\n"		
						+ "Elige una opcion",JOptionPane.QUESTION_MESSAGE));
				switch(opcion) {
					case 1:
						elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Ingresa el numero del nodo", "Agregar Nodo",JOptionPane.QUESTION_MESSAGE));
						nombre = JOptionPane.showInputDialog(null,
								"Ingresa el nombre del nodo",
								"Agregar Nodo",JOptionPane.QUESTION_MESSAGE);
						miarbolito.agregarNodo(nombre, elemento);
						break;
					case 2:
						if(!miarbolito.estaVacio()) {
							System.out.println();
							miarbolito.inOrden(miarbolito.raiz);
						}else {
							JOptionPane.showMessageDialog(null, "Arbol vacio",
									"Cuidado!",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 3:
						if(!miarbolito.estaVacio()) {
							System.out.println();
							miarbolito.preOrden(miarbolito.raiz);
						}else {
							JOptionPane.showMessageDialog(null, "Arbol vacio",
									"Cuidado!",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 4:
						if(!miarbolito.estaVacio()) {
							System.out.println();
							miarbolito.postOrden(miarbolito.raiz);
						}else {
							JOptionPane.showMessageDialog(null, "Arbol vacio",
									"Cuidado!",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 5:
						if(!miarbolito.estaVacio()) {
							System.out.println();
							miarbolito.inverso(miarbolito.raiz);
						}else {
							JOptionPane.showMessageDialog(null, "Arbol vacio",
									"Cuidado!",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 6:
						if(!miarbolito.estaVacio()) {
							elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
									"Ingresa el numero del nodo a buscar", "Agregar Nodo",JOptionPane.QUESTION_MESSAGE));
								
							miarbolito.buscaNodo(elemento);
							if(miarbolito.buscaNodo(elemento)== null) {
								JOptionPane.showMessageDialog(null, "El nodo no se encuentra en el Arbol",
										"Nodo no encontrado!",JOptionPane.INFORMATION_MESSAGE);
							}
							else {
								System.out.println("Nodo encontrado, su dato es " + miarbolito.buscaNodo(elemento));
							}
							break;
						}else {
							JOptionPane.showMessageDialog(null, "Arbol vacio",
									"Cuidado!",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 7:
						if(!miarbolito.estaVacio()) {
							elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
									"Ingresa el numero del nodo a eliminar", "Eliminar Nodo",JOptionPane.QUESTION_MESSAGE));
							if(miarbolito.eliminaNodo(elemento) == false) {
								JOptionPane.showMessageDialog(null, "El nodo no se encuentra en el Arbol",
										"Nodo no encontrado!",JOptionPane.INFORMATION_MESSAGE);
							}
							else {
								JOptionPane.showMessageDialog(null, "El nodo ha sido eliminado el Arbol",
										"Nodo eliminado!",JOptionPane.INFORMATION_MESSAGE);
							}
							break;
						}else {
							JOptionPane.showMessageDialog(null, "Arbol vacio",
									"Cuidado!",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 8:
						JOptionPane.showMessageDialog(null, "Aplicacion Finalizada",
								"Fin",JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opcion incorrecta",
								"Cuidado",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
			catch(NumberFormatException n) {
				JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
			}
		}while (opcion!=8);
	}

}
