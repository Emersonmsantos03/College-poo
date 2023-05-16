public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student(3032, "Analise e desenvolvimeto de sistemas", 4539 );

        s1.setName("Emerson Moraes dos Santos Filho");
        s1.setAdress("Rua Joanin Stroparo 110, Vila Bancária - Campo Largo");
        s1.setPhoneNumber("41 98453-7827");
        s1.setMonthlyPayment(300.0);
        s1.setBalance(500.0);
        s1.pagarMensal();
        /*Construtor. O construtor vai passar os parâmetros para o objeto que está estanciando*/
        System.out.println("Criando um novo usuário de estudante");
        System.out.println("Curso: " + s1.getCourse());
        System.out.println("Número de matrícula: " + s1.getRegisterNumber());
        System.out.println("Identificador de usuário: " + s1.getId());

        System.out.println(s1.getBalance());



    }
}
