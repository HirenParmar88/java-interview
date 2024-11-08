
// Encapsulation programs
// Access Specifiers : public, private, protected, default -> e.g method, object

package bank;   //package creation

class Account{
    public String name; //public
    protected String email;
    private String password;
    //String name;    //default

    //getters & setters -> use to private 
    public String getPassword(){
        setPassword(password);
        return this.password;
    }
    public void setPassword(String pass){   //void kuch return nahi karega
        this.password=pass;
    }
}

//bank class
public class bank {
    public static void main(String[] args) {
        Account acc1=new Account();
        acc1.name="Hiren Parmar";
        acc1.email="hiren11@gmail.com";
        acc1.setPassword("abcd");
        System.out.println(acc1);
    }

    /*public class Account {

        public String name;
    }*/
}
