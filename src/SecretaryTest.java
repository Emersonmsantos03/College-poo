public class SecretaryTest {
    public static void main(String[] args) {


        Secretary sec1 = new Secretary();
        Secretary sec2 = new Secretary();
        Secretary sec3 = new Secretary();

        sec1.setName("Emerson Lindo");
        sec1.setSenha(42123);
        sec1.setAdress("Rua Joanin Stroparo 110");
        sec1.setPhoneNumber("41 984537827");
        boolean autenticou = sec1.autentica(42123);
        sec2.setName("Natália Araújo");
        sec2.setAdress("Algum lugar em fortaleza");
        sec2.setPhoneNumber("4002-8922");
        sec2.setSenha(3032);
       boolean authentic = sec2.autentica(3032);

        sec3.setName("Beatriz Fifi");
        sec3.setAdress("Rua Joanin Stroparo 110");
        sec3.setPhoneNumber("9340112313");
        sec3.setSenha(21233);
        boolean login = sec2.autentica(21233);


        System.out.println("-------------------------------");

        System.out.println("O segundo(a) secretário(a) se chama: " + sec2.getName());
        System.out.println("Morando em: " + sec2.getAdress());
        System.out.println("Contato por meio de telefone pelo número: " + sec2.getPhoneNumber());

        System.out.println("-------------------------------");


        System.out.println("-------------------------------");

        System.out.println("O segundo(a) secretário(a) se chama: " + sec1.getName());
        System.out.println("Morando em: " + sec1.getAdress());
        System.out.println("Contato por meio de telefone pelo número: " + sec1.getPhoneNumber());

        System.out.println("-------------------------------");

        System.out.println("-------------------------------");

        System.out.println("O segundo(a) secretário(a) se chama: " + sec3.getName());
        System.out.println("Morando em: " + sec3.getAdress());
        System.out.println("Contato por meio de telefone pelo número: " + sec3.getPhoneNumber());

        System.out.println("-------------------------------");





    }
}
