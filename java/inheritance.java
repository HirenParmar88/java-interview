class Employee{
    float sal=40000;
}

class inheritance extends Employee{
    int bonus=2000;

    public static void main(String args[]){
        inheritance i=new inheritance();
        System.out.println("salary is :"+i.sal);
        System.out.println("bonus is :"+i.bonus);
    }
}