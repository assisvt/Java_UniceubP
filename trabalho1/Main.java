package projeto10;

import javax.swing.JOptionPane;

public class Main {
	
	public static int lista[] = {432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129};
	//public static int lista[] = {432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129, 432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129, 432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129,432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129 ,432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129 ,432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129 ,432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129 ,432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129 ,432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129 ,432, 809, 213, 725, 37, 960, 578, 63, 921, 145, 689, 281, 506, 955, 194, 374, 820, 62, 890, 485, 786, 911, 394, 178, 627, 902, 420, 579, 733, 96, 311, 654, 250, 771, 9, 624, 712, 135, 505, 884, 445, 688, 77, 912, 721, 390, 538, 893, 470, 679, 1, 869, 302, 946, 561, 144, 790, 422, 769, 57, 899, 308, 687, 469, 237, 630, 961, 36, 578, 799, 180, 628, 886, 298, 835, 62, 974, 214, 518, 746, 132, 899, 243, 511, 798, 235, 681, 61, 918, 375, 692, 993, 183, 553, 846, 24, 954, 286, 647, 129};
	//public static int lista[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,5};
	//public static int lista[] = {5, 7, 2, 3, 1};
	public static void main(String[] args) {
		apresentaOpcoes();
	}
	
	
	public static void apresentarListaOriginal() {
		String original = "";
		for (int i = 0; i < lista.length; i++) {
			original += lista[i] + ", ";
			if(i%10 == 9) {
				original += "\n";
			}
		}
		JOptionPane.showMessageDialog(null, original);
		apresentaOpcoes();
	}
	
	public static void ordenarLista() {
		int[] copiedList = lista.clone();
		mergeSort(copiedList, 0, copiedList.length-1);
		
		String result = "";
		for (int i = 0; i < copiedList.length; i++) {
			result += copiedList[i] + ", ";
			if(i%10 == 9) {
				result += "\n";
			}
		}
		JOptionPane.showMessageDialog(null, result);
		apresentaOpcoes();
	}
	public static void ordenarLista2() {
		int[] copiedList = lista.clone();
		bubbleSort(copiedList);
		
		String result = "";
		for (int i = 0; i < copiedList.length; i++) {
			result += copiedList[i] + ", ";
			if(i%10 == 9) {
				result += "\n";
			}
		}
		JOptionPane.showMessageDialog(null, result);
		apresentaOpcoes();
	}
	
	public static void merge(int lista[], int esquerda, int meio, int direita) {
	    int tamanhoEsquerda = meio - esquerda + 1;
	    int tamanhoDireita = direita - meio;

	    int listaEsquerda[] = new int[tamanhoEsquerda];
	    int listaDireita[] = new int[tamanhoDireita];

	    // Criar lista temporarias
	    for (int i = 0; i < tamanhoEsquerda; ++i) {
	        listaEsquerda[i] = lista[esquerda + i];
	    }
	    for (int j = 0; j < tamanhoDireita; ++j) {
	        listaDireita[j] = lista[meio + 1 + j];
	    }

	    // Combinação das sublistas
	    int i = 0, j = 0;
	    int indexAdicionado = esquerda;
	    while (i < tamanhoEsquerda && j < tamanhoDireita) {
	        if (listaEsquerda[i] <= listaDireita[j]) {
	            lista[indexAdicionado] = listaEsquerda[i];
	            i++;
	        } else {
	            lista[indexAdicionado] = listaDireita[j];
	            j++;
	        }
	        indexAdicionado++;
	    }

	    // Copia os elementos faltantes das sublistas
	    while (i < tamanhoEsquerda) {
	        lista[indexAdicionado] = listaEsquerda[i];
	        i++;
	        indexAdicionado++;
	    }

	    while (j < tamanhoDireita) {
	        lista[indexAdicionado] = listaDireita[j];
	        j++;
	        indexAdicionado++;
	    }
	}

	public static void mergeSort(int lista[], int esquerda, int direita)
	{
	    if (esquerda < direita) {
	        int meio = esquerda + (direita - esquerda)/2;

	        mergeSort(lista, esquerda, meio);
	        mergeSort(lista, meio + 1, direita);

	        merge(lista, esquerda, meio, direita);
	    }
	}
	
	public static void bubbleSort(int[] arr) {
	    int n = arr.length;
	    int temp = 0;
	    for(int i=0; i < n; i++){
	        for(int j=1; j < (n-i); j++){
	            if(arr[j-1] > arr[j]){
	                temp = arr[j-1];
	                arr[j-1] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	}
	
	public static void compararMetodos() {
		int[] copiedList = lista.clone();
		long inicioTempo = System.nanoTime();
		mergeSort(copiedList, 0, copiedList.length-1);
		long fimTempo = System.nanoTime();
        long tempoMerge = (fimTempo - inicioTempo)/1000;
        
        copiedList = lista.clone();
		inicioTempo = System.nanoTime();
		bubbleSort(copiedList);
		fimTempo = System.nanoTime();
        long tempoBubble = (fimTempo - inicioTempo)/1000;
        String result = "Merge Sort (ms):" + tempoMerge + "\nBubble Sort (ms):" + tempoBubble;
        JOptionPane.showMessageDialog(null, result);
		apresentaOpcoes();
        
	}
	
	public static void apresentaOpcoes() {
		String opcao = JOptionPane.showInputDialog(
			" 1 - Apresentar lista original \n" +
			" 2 - Ordenar lista (Merge)\n" +
			" 3 - Ordenar lista (Bubble)\n" +
			" 4 - Apresentar comparação \n" +
			" 5 - Sair "
		);
		if (opcao.equals("1")) {
			apresentarListaOriginal();
		}else if (opcao.equals("2")) {
			ordenarLista();
		}else if (opcao.equals("3")) {
			ordenarLista2();
		}
		else if(opcao.equals("4")) {
			compararMetodos();
		}
		else if (opcao.equals("5")) {
			return;
		}
		else {
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
	}

}
