package OOPS;

class Account {
    public String name ;
    protected String email ;
    private String password ;

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass ;
    }
    // Data and its function when combined is called enacplsulation
}

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Dev";
        acc1.email = "tdevender422@gmail.com";
        acc1.setPassword("abcd");  
        System.out.println(acc1.getPassword());
    }
}
