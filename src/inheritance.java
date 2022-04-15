import java.util.Scanner;
import java.io.IOException;
import java.lang.*;
import java.io.InputStreamReader;

public class inheritance {
    public void main(String[]args) throws IOException{
       Staff employee = new Staff();
       int salary = employee.salaryTopay(130,25);
       System.out.println("The employee salary is " + salary);

       int salaryOvertime = employee.salaryOvertime(80, 50);
        System.out.println("The employee  overtime salary is " + salaryOvertime);

        int bonus = Salary.bonus(10);
        System.out.println("The employee  bonus salary is " + bonus);
//



    }
}
class Person{
    protected String Shuma56633surname ,Shuma56633firstname,Shuma56633street,Shuma56633zipcode,city;
    public void initiated() throws IOException{
        Scanner sc= new Scanner(System.in);
        this.Shuma56633firstname = sc.next();
        System.out.println("The first name is ");
        this.Shuma56633surname = sc.next();
        System.out.println("The second name is");
        this.Shuma56633street= sc.next();
        System.out.println("Street");
        this.Shuma56633zipcode=sc.next();
        System.out.println("zipcode");
        this.city=sc.next();
        System.out.println("City");




    }
    public void printShuma56633(){
        System.out.println("Surname "+ Shuma56633surname);
        System.out.println("firstname" + Shuma56633firstname);
        System.out.println("street"+ Shuma56633street);
        System.out.println("zipcode"+Shuma56633zipcode);
        System.out.println("city"+city);
    }
}
interface Salary {
    int salaryTopay(int Shuma56633hourrate, int Shuma56633hour);

    default int salaryOvertime(int Shuma56633hourovertime, int Shuma56633rate) {
        int salary = Shuma56633hourovertime * Shuma56633rate;
        return salary;
    }

    static int bonus(int Shuma56633yearsofexperience){
        if (Shuma56633yearsofexperience > 20) {
            return 200;}
            else{
        return 0;
         }
   }
}




class Staff extends Person implements Salary {
    protected String Shuma56633eductaion, Shuma56633position,Shuma5663salary;
    public void Shuma56633Initialize() throws IOException{
        Shuma56633Initialize();
        Scanner sc= new Scanner(System.in);
        this.Shuma56633eductaion= sc.next();
        System.out.println("education is");
        this.Shuma56633position = sc.next();
        System.out.println("position is");
        this.Shuma5663salary = sc.next();
        System.out.println("salary is");





    }

    public void Shuma56633print(){
        System.out.println("Education" + Shuma56633eductaion);
        System.out.println("position" + Shuma56633position);

    }

    @Override
    public int salaryTopay(int Shuma56633hourrate, int Shuma56633hour) {
        return Shuma56633hourrate * Shuma56633hour;

    }
    @Override
    public int salaryOvertime(int Shuma56633hourovertime, int Shuma56633rate){
        return Shuma56633hourovertime *(2 * Shuma56633rate);
    }




}
