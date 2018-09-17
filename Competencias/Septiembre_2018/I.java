import java.util.ArrayList;
import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		Scanner l =  new Scanner(System.in);
		String[] interruptores_lamparas = l.nextLine().split(" ");
		int inters = Integer.parseInt(interruptores_lamparas[0]);
		int lamps = Integer.parseInt(interruptores_lamparas[1]);
		boolean[] estado_lamparas = new boolean[lamps + 1];
		
		String[] lamparas_encendidas = l.nextLine().split(" ");
		
		for(int i = 1; i < lamparas_encendidas.length; i++){
			estado_lamparas[Integer.parseInt(lamparas_encendidas[i])] = true;
		}
		
		boolean[] estadoInicial = new boolean[estado_lamparas.length];
		
		for(int i = 0; i < estadoInicial.length; i++){
			estadoInicial[i] = estado_lamparas[i];
		}
		
		ArrayList<Integer[]> intrr = new ArrayList<Integer[]>();
		
		for(int i = 0; i < inters; i++){
			String[] a = l.nextLine().split(" ");
			int t = Integer.parseInt(a[0]);
			Integer[] p = new Integer[t];
			for(int j = 0; j < t; j++){
				p[j] = Integer.parseInt(a[j+1]);
			}
			intrr.add(p);
		}
		int cambios = 0;
	
		for(int i = 0; i < intrr.size(); i++){
			if(estanApagados(estado_lamparas)) {
				System.out.println(cambios);
				break;
			}else if(esIgual(estadoInicial,estado_lamparas) && cambios!=0 && i == 0){
					System.out.println("-1");
					break;
			}else {
				for(int j = 0; j < intrr.get(i).length; j++){
					estado_lamparas[intrr.get(i)[j]] = !estado_lamparas[intrr.get(i)[j]];
				}
				cambios++;
			}
			if(i == intrr.size() - 1){
				i = -1;
			}
			
		}		
	}
	public static boolean esIgual(boolean[] a, boolean[] b){
		for(int i = 1; i < a.length; i++){
			if(a[i] != b[i]){
				return false;
			}
		}
		return true;		
	}
	public static boolean estanApagados(boolean[] a){
		for(int i = 1; i < a.length; i++){
			if(a[i]){
				return false;
			}
		}
		return true;	
	}
}