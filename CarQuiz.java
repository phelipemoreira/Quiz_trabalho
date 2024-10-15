import java.util.Scanner;

public class CarQuiz {
    private String[][] questions = {
            {"Qual é a marca do carro mais vendido do mundo?", "Toyota"},
            {"Em que ano foi lançado o primeiro Ford Mustang?", "1964"},
            {"Qual é a montadora do modelo Civic?", "Honda"},
            {"Qual é o nome do carro elétrico da Tesla?", "Model S"},
            {"Em que país foi fundada a Ferrari?", "Itália"},
            {"Qual é o nome do carro esporte fabricado pela Porsche?", "911"},
            {"Qual é a marca do carro conhecido como Beetle?", "Volkswagen"},
            {"Qual carro é famoso pelo seu papel nos filmes de James Bond?", "Aston Martin"},
            {"Qual é a montadora do modelo F-150?", "Ford"},
            {"Em que ano foi fundado a Lamborghini?", "1963"},
            {"Qual é o nome do carro híbrido da Toyota?", "Prius"},
            {"Qual é a marca do carro modelo Impreza?", "Subaru"},
            {"Em que país foi fundada a Volvo?", "Suécia"},
            {"Qual é o nome do carro fabricado pela Bugatti?", "Veyron"},
            {"Qual é o modelo de carro esportivo da Nissan?", "GT-R"}
    };

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (String[] question : questions) {
            System.out.println(question[0]);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(question[1])) {
                score++;
            }
        }

        System.out.println("Você acertou " + score + " de " + questions.length + " perguntas.");
        scanner.close();
    }
}
