package Hw13_SalaryAccount;

public class Employee {
    // qualification determined
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear){   // Constructor function
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    // calculates tax
    double tax(){
        double taxPrice;
        if (this.salary <= 8500) { // If the salary is less than 8500, the tax fee will be 0.
            taxPrice = 0;
        } else{
            taxPrice = this.salary * 0.03; // If it is more, it calculates 3 percent tax fee.
        }
        return taxPrice;
    }
    // calculates bonus
    double bonus(){
        double overTime = 0, bonusPrice;
        if(this.workHours > 15) // If the working hours are more than 15
            overTime = this.workHours - 15; // Calculating overtime by taking 15 minus
        bonusPrice = overTime * 39.35; // multiplies the bonus fee by overtime and returns the bonus amount
        return bonusPrice; // returns the bonus price
    }
    // year-based salary increase
    double raiseSalary(){
        int year = 2023; // tbase year 2023 taken
        int raisePrice = 0;
        if ((year - this.hireYear) < 10){ // If it is less than 10 years, it will increase by 5 percent.
            raisePrice += (this.salary * 0.05);
        }
        else if ((year - this.hireYear) > 9 && (year - this.hireYear) < 20){ // 10 percent increase between 10 and 20 years
            raisePrice += (this.salary * 0.1);
        } else {
            raisePrice+= (this.salary * 0.15); // If it is more than 20 years, it will increase by 15 percent.
        }
        return raisePrice; // returns the increment price
    }
    double salarySum(){
        this.salary += bonus() + raiseSalary() - tax(); // Adds bonus and experience increase to total salary and subtracts taxation
        return this.salary;
    }
    // prints information of employee
    public String toString(){
        System.out.println("Employee Information\n"+"Name: "+this.name+"\nSalary: "+this.salary+"\nWork Hour: "+ this.workHours+"\nEmployment Year: "+this.hireYear);
        System.out.println("Bonus: "+ bonus() + "\nSalary Increase: "+ raiseSalary()+ "\nTax: "+tax()+"\nTotal Salary: "+ salarySum());
        return null;
    }
}
