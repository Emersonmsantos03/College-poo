public class Professor extends User implements Login{

    private String schoolSubject;
    private int teacherLicence;
    private double balance;
    private double salary;

    private Authentic autenticador;

    public Professor(String schoolSubject, int teacherLicence, double salary) {
        this.schoolSubject = schoolSubject;
        this.teacherLicence = teacherLicence;
        this.balance = salary;
        this.autenticador = new Authentic();
    }


    public String getSchoolSubject() {
        return schoolSubject;
    }

    public void setSchoolSubject(String schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    public int getTeacherLicence() {
        return teacherLicence;
    }

    public void setTeacherLicence(int teacherLicence) {
        this.teacherLicence = teacherLicence;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean darAula(boolean darAula){
        if(darAula == true){
            System.out.println("Aula dada com sucesso");
            return true;
        }
        else{
            System.out.println("O professor faltou a aula");
        }
        return false;
    }

    public void receberSalario(boolean darAula){
        if(darAula == true){
            balance += salary;
            System.out.println("O Professor deu aula, pode receber o seu salário");

        }
        else{
            System.out.println("As aulas não foram dadas, o professor não pode receber um salário");
            salary = 0;
            balance =+salary;
        }

    }
    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);

    }
    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }

    }

