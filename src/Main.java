public class Main {
    public static void main(String[] args) throws Exception {
        StaticStack pilha = new StaticStack<>(5);

        System.out.println(pilha.isEmpty());

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        System.out.println(pilha.isFull());

        pilha.clear();

        System.out.println(pilha.isEmpty());
    }
}
