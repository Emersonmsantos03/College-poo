public class ProfessorTest {
    public static void main(String[] args) {

        Professor p1 = new Professor("Development", 123, 3600.0);

        System.out.println("---------------------------------------------------------------------");


        p1.receberSalario(true);
        System.out.println(p1.getBalance());
        System.out.println(p1.getTeacherLicence());
        System.out.println(p1.getSchoolSubject());

        System.out.println("---------------------------------------------------------------------");


        Professor p2 = new Professor("Biology", 456, 3400.0);
        p2.receberSalario(false);
        System.out.println(p2.getBalance());
        System.out.println(p2.getTeacherLicence());
        System.out.println(p2.getSchoolSubject());

        System.out.println("---------------------------------------------------------------------");




    }
}
