import java.sql.SQLOutput;

public class Authentic {

    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica (int senha){
        if(this.senha == senha){
            System.out.println("A senha está correta! Login efetuado com sucesso!");
            return true;

        }
        else{
            System.out.println("A senha está incorreta! Verifique a sua senha!");
            return false;
        }
    }

}
