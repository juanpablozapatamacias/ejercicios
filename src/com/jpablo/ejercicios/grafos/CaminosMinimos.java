package com.jpablo.ejercicios.grafos;

public class CaminosMinimos {

	// metodo para determinar todos los caminos del algoritmo floyd
	public String algoritmoFloyd(long[][] mAdy) {
		int vertices = mAdy.length;
		long matrizAdyacencia[][] = mAdy;
		String caminos[][]=new String[vertices][vertices];
		String caminosAuxiliares[][]=new String [vertices][vertices];
		String caminoRecorrido="", cadena="",caminitos="";
		int i,j,k;
		float temp1, temp2, temp3, temp4, min;
		
		// inicializar las matrices caminos y caminos auxiliares
		
		for (i=0;i<vertices;i++) {
			for(j=0;j<vertices;j++) {
				caminos[i][j]="";
				caminosAuxiliares[i][j]="";
			}
		}
		//Buscar los caminos minimos
		for(k=0;k<vertices;k++) {
			for (i=0;i<vertices;i++) {
				for(j=0;j<vertices;j++) {
					// inicializar variables temporales
					temp1=matrizAdyacencia[i][j];
					temp2=matrizAdyacencia[i][k];
					temp3=matrizAdyacencia[k][j];
					temp4=temp2+temp3;
					
					// encontrar el minimo
					min = Math.min(temp1, temp4);
					
					// condicion para comparar los temportales
					if(temp1 != temp4) {
						if(min == temp4) {
							caminoRecorrido="";
							caminosAuxiliares[i][j]=k + "";
							caminos[i][j]=caminosR(i,j,caminosAuxiliares,caminoRecorrido) + (k+1);
						}
					}
					matrizAdyacencia[i][j] = (long) min;
				}
			}
		}
		
		// Agregando el camino a cadena
		for(i=0;i< vertices;i++) {
			for (j=0;j<vertices;j++) {
				cadena = cadena + "[" + matrizAdyacencia[i][j] + "]";
				cadena = cadena + "\n";
			}
		}
		////////////////////////
		for(i=0;i< vertices;i++) {
			for (j=0;j<vertices;j++) {
				if(matrizAdyacencia[i][j] != 1000000000) {
					if(i != j) {
						if(caminos[i][j].equals("")) {
							caminitos += "De (" + (i+1) +"--->" + (j+1) +") Irse por ... ("+(i+1)+", "+(j+1)+")\n";
						}
						else {
							caminitos += "De (" + (i+1) +"--->" + (j+1) +") Irse por ... ("+(i+1)+", "+ caminos[i][j]+", "+(j+1)+")\n";
						}
					}
				}
			}
		}
		
		return "La matriz de caminos mas cortos entre los diferentes vertices es: \n" + cadena +
				"\n Los diferentes caminos mas cortos entre vertices son:\n" + caminitos;
	}
	
	public String caminosR(int i, int k, String[][] caminosAuxiliares, String caminoRecorrido) {
		if(caminosAuxiliares[i][k].equals("")) {
			return "";
		}
		else {
			// Recursividad al millon :)
			caminoRecorrido += caminosR(i,Integer.parseInt(caminosAuxiliares[i][k].toString()),
					caminosAuxiliares,caminoRecorrido)+
					(Integer.parseInt(caminosAuxiliares[i][k].toString())+1) + ", ";
		}
		return caminoRecorrido;
	}
	
	public void algoritmoDijsktra(long[][] mAdy, int source) {
		int nodos = mAdy.length;
		long [] distance = new long[nodos];
		long [][] costo = new long[nodos][nodos];
		int flag [] = new int[nodos + 1];
		int minpos = 1;
		int c,i;
		long minimo;
		
		costo = mAdy; 
		
		for(i=0;i<nodos;i++) {
			flag[i]=0;
			distance[i]=costo[source][i];
		}
		c=1;
		while(c <= nodos) {
			minimo = 99;
			for(int k = 0;k < nodos;k++) {
				if(distance[k] < minimo && flag[k] != 1) {
					minimo = distance[i-1];
					minpos = k;
				} 
			}
			flag[minpos]=1;
			c++;
			for(int k=0;k<nodos;k++) {
				if(distance[minpos]+costo[minpos][k] < distance[k] && flag[k] != 1){
					distance[k] = distance[minpos] + costo[minpos][k];
				}
			}
		}
		
		System.out.println("The Shortest Path from Source \t"+source+"\t to all other vertices are : \n");
		for(int m=0;m<nodos;m++) {
			if(m!=source) {
				System.out.println("source :"+source+"\t destination :"+m+"\t MinCost is :"+distance[m]+"\t");
			}
		}
	}
}
