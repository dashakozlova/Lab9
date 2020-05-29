package com.lab9;
import com.lab9.Employee;
import com.lab9.FieldLengthLimitException;
import com.lab9.IncorrectSalaryException;

public class Manager extends Employee
{
    private double bonus;
    public Manager(int id, String name, String surname)   throws IncorrectSalaryException, FieldLengthLimitException{
        super(id, name, surname);
    }

    public Manager(int id, String name, String surname, double salary)   throws IncorrectSalaryException, FieldLengthLimitException {
        super(id, name, surname, salary);
    }


    public Manager(int id, String name, String surname, double salary, Manager manager)   throws IncorrectSalaryException, FieldLengthLimitException {
        super(id, name, surname, salary, manager);
    }

    public Manager(int id, String name, String surname, double salary, Manager manager, double bonus)    throws IncorrectSalaryException, FieldLengthLimitException{
        super(id, name, surname, salary, manager);
        this.bonus=bonus;
    }

    public final void setBonus(double bonus) throws IncorrectSalaryException {
        if (bonus < 0) {
            throw new IncorrectSalaryException("bonus < 0");
        } else {
            this.bonus = bonus;
        }
    }
    public double getBonus(){
        return this.bonus;
    }
    @Override
    public double getSalary(){
        return this.bonus+super.getSalary();
    }

    @Override
    public String toString() {
            return " id= " + getId() + ", name= " + getName() + ", surname= " + getSurname()  + ", salary= " + getSalary() +", manager= {"+getManager()+" }, bonus= "+getBonus();
    }
}