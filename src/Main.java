import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        int[] numeros = new int[10];
        numeros[0] = 12;
        numeros[1] = -1;
        numeros[2] = 3;
        numeros[3] = 7;
        numeros[4] = 12;
        numeros[5] = 10;
        numeros[6] = 13;
        numeros[7] = 9;
        numeros[8] = 43;
        numeros[9] = 8;
        exibirVetor(numeros);
        exibirVetor(selectionSort(numeros));
        System.out.println(buscaLinear(numeros, 9));
        System.out.println(buscaLinear(numeros, 30));
        System.out.println(buscaBinaria(numeros, 10, 0, numeros.length - 1));

    }

    public static int buscaLinear(int[] vetor, int valor){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == valor){
                return i;
            }
        }
        return -1;
    }

    public static void exibirVetor(int[] vetor){
        System.out.print("[");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
        System.out.println("]");
    }

    public static int[] bubbleSort(int[] vetor){
        for(int i=0; i<vetor.length; i++){
            for(int j=0;j<vetor.length-i-1; j++){
                if(vetor[j]>vetor[j+1]){
                    int aux=vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        return vetor;
    }
    public static int[] selectionSort(int[] vetor){
        for(int i=0;i<vetor.length;i++){
            int menor = vetor[i];
            int indexMenor = i;
            for(int j=i+1;j<vetor.length;j++){
                if(vetor[j]<menor){
                    menor = vetor[j];
                    indexMenor = j;
                }
            }
            vetor[indexMenor] = vetor[i];
            vetor[i] = menor;
        }
        return vetor;
    }

    public static int buscaBinaria(int[] vetor, int valor, int inicio, int fim){
        int meio = (fim + inicio)/2;
        if(inicio == fim && valor != vetor[meio]){
            return -1;
        }
        if(valor<vetor[meio]){
            return buscaBinaria(vetor, valor, inicio, meio);
        }else if(valor>vetor[meio]){
            return buscaBinaria(vetor, valor, meio + 1, fim);
        }
        return meio;
    }
}
