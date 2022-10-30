import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Criando ArrayList Conta
        ArrayList<Conta> contas = new ArrayList<>();

        //Criando e adicionando Contas
        Conta c1 = new Conta(1,"Matheus");
        contas.add(c1);
        Conta c2 = new Conta(3,"Joao");
        contas.add(c2);
        Conta c3 = new Conta(2,"Aabraao");
        contas.add(c3);

        //Sout da Arraylist pura
        System.out.println("----------------------------");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Dono: "+ contas.get(i).getDono());
            System.out.println("Saldo: "+ contas.get(i).getSaldo());
        }
        System.out.println("----------------------------");

        //Ordenando
        Collections.sort(contas);

        //sout apos o Sort
        System.out.println("----------------------------");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Dono: "+ contas.get(i).getDono());
            System.out.println("Saldo: "+ contas.get(i).getSaldo());
        }
        System.out.println("----------------------------");
    }

}