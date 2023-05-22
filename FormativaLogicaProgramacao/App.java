package FormativaLogicaProgramacao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exe = 1;

        while (exe > 0) {
            System.out.println("Qual Objeto executar? Para cancelar digite 0");
            exe = sc.nextInt();

            switch (exe) {

                case 1:
                    FormativaLogicaProgramacao obj1 = new FormativaLogicaProgramacao();
                    obj1.exercicio1();
                    break;

                case 2:
                    FormativaLogicaProgramacao obj2 = new FormativaLogicaProgramacao();
                    obj2.exercicio2();
                    break;

                case 3:
                    FormativaLogicaProgramacao obj3 = new FormativaLogicaProgramacao();
                    obj3.exercicio3();
                    break;

            }
        }

        sc.close();
    }
}
