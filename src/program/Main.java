package program;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Menu ---");
        System.out.println("1. Inserir caminhoneiro");
        System.out.println("2. Atender Caminhoneiro");
        System.out.println("3. Mostrar Fila");
        System.out.println("0. Sair");
        System.out.printf("Digite a opcao desejada: %n", "UTF-8");
        return scanner.nextInt();
    }

    public static void leiaDados(Caminhoneiro caminhoneiro) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        caminhoneiro.setNome(scanner.nextLine());
        System.out.print("Placa: ");
        caminhoneiro.setPlaca(scanner.nextLine());
        caminhoneiro.setHorarioChegada(LocalDateTime.now());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, op = 0, elemento;
        FilaEstatica<Caminhoneiro> fila = new FilaEstatica<>(10);
        do {
            op = mostrarMenu();
            switch (op) {
                case 1:
                    if (!fila.isFull()) {
                        System.out.println("Dados do Caminhoneiro:");
                        Caminhoneiro novoCaminhoneiro = new Caminhoneiro();
                        leiaDados(novoCaminhoneiro);
                        fila.enqueue(novoCaminhoneiro);
                        System.out.println("Insercao realizada");
                    } else {
                        System.out.println("Fila Cheia!");
                    }

                    break;
                case 2:
                    if (!fila.isEmpty()) {
                        System.out.println("Elemento removido: " + fila.dequeue());
                    } else {
                        System.out.println("Fila vazia!");
                    }

                    break;
                case 3:
                    System.out.println("Elementos da fila: \n");
                    System.out.println(fila);
                    break;
            }
            System.out.println("Pressione uma tecla para continuar\n");
            scanner.nextLine();
        } while (op != 0);
        scanner.close();
    }

}
