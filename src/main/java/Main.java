import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Insira a senha: ");
    int senha = 2022;
    int colocada = sc.nextInt();

    while (colocada != senha) {
      System.out.println("Senha incorreta");
      System.out.println("Digite novamente");

      senha = sc.nextInt();

    }
    if (senha == 2022) {
      System.out.println("Acesso permitido");
    }
    sc.close();
  }

}