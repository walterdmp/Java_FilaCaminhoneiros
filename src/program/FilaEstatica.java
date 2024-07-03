package program;

public class FilaEstatica<T> {

    private int inicio;
    private int fim;
    private int qtd;
    private T[] elementos;

    FilaEstatica(int tamanho) {
        this.inicio = 0;
        this.fim = -1;
        this.qtd = 0;
        elementos = (T[]) new Object[tamanho];
    }

    public boolean isFull() {
        return this.qtd == this.elementos.length;
    }

    public void enqueue(T elemento) {
        if (this.fim == this.elementos.length - 1) {
            this.fim = 0;
        } else {
            this.fim++;
        }
        this.elementos[this.fim] = elemento;
        this.qtd++;

    }

    public T dequeue() {
        T elemento = this.elementos[this.inicio];
        if (this.inicio == this.elementos.length - 1) {
            this.inicio = 0;
        } else {
            this.inicio++;
        }
        this.qtd--;
        return elemento;
    }

    //--------------------
    public boolean isEmpty() {
        return this.qtd == 0;
    }

    //-------------------
    public T first() {
        return this.elementos[this.inicio];
    }

    //-------------------
    public T last() {
        return this.elementos[this.fim];
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        int i = this.inicio;

        for (int cont = 0; cont < this.qtd; cont++) {
            retorno.append(elementos[i] + "\n");

            if (i == this.elementos.length - 1) {
                i = 0;
            } else {
                i++;
            }
        }
        retorno.append("-----------");
        return retorno.toString();
    }
}
