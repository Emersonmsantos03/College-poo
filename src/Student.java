public class Student extends User {
    private int registerNumber;
    private String course;
    private double monthlyPayment;
    private String shift; //turno
    private int id;

    private double balance;

    public Student(int registerNumber, String course, int id) {
        this.registerNumber = registerNumber;
        this.course = course;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        if(monthlyPayment > balance){
            System.out.println("Você não tem saldo para realizar o pagamento");
        }
        else{
            System.out.println("Pagamento efetuado com sucesso!");
        }
        this.monthlyPayment = monthlyPayment;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void pagarMensal(){
        balance -= monthlyPayment;

    }


}
