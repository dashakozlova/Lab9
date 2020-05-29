package com.lab9;
import com.lab9.Manager;
import com.lab9.FieldLengthLimitException;
import com.lab9.IncorrectSalaryException;


public class Employee {

    private int id;
    private String name;
    private String surname;
    private double salary;
    private Manager manager;
    public Employee() throws IncorrectSalaryException {
        this.id=1;
        this.name="UN";
        this.surname="D";
        this.salary=1000;
    }
    public Employee(int id, String name, String surname)  throws IncorrectSalaryException, FieldLengthLimitException{
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=1000;
    }
    public Employee(int id, String name, String surname,double salary)  throws IncorrectSalaryException, FieldLengthLimitException{
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }
    public Employee(int id, String name, String surname,double salary, Manager manager)
            throws IncorrectSalaryException, FieldLengthLimitException{
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        this.manager=manager;
    }

    /**
     *
     * @return id our object
     */
    public final int getId() {
        return id;
    }
    public final void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return name our object
     */
    public final String getName() {
        return name;
    }

    public final void setName(String name) throws FieldLengthLimitException {
        if (name == null) {
            throw new NullPointerException();
        } else if (name.length() < 2 || name.length() > 20) {
            throw new FieldLengthLimitException("Wrong name length!");
        }
        this.name = name;
    }
    /**
     *
     * @return surname our object
     */
    public final String getSurname() {
        return surname;
    }
    public final void setSurname(String surname) throws FieldLengthLimitException {
        if (surname == null) {
            throw new NullPointerException();
        } else if (surname.length() < 2 || surname.length() > 20) {
            throw new FieldLengthLimitException("Wrong name length!");
        }
        this.surname = surname;
    }

    /**
     *
     * @return salary our object
     */
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) throws IncorrectSalaryException {
        if (salary <= 0) {
            throw new IncorrectSalaryException("Salary can't be lower 0");
        } else {
            this.salary = salary;
        }
    }

    /**
     *
     * @return manager-object our object
     */
    public final Manager getManager() {
        return this.manager;
    }
    public final void setManager(Manager manager) {
        if (manager == null) {
            throw new NullPointerException("Manager is null!");
        }
        this.manager = manager;
    }

    /**
     *
     * @param n Method changing salary our object
     */
    public final void raiseSalary(double p) throws IncorrectSalaryException {
        if (p < 0) {
            throw new IncorrectSalaryException("You can't raise salary!");
        } else {
            setSalary((getSalary() * p / 100) + getSalary());
        }
    }
    @Override
    public String toString() {
        return " id= " + getId() + ", name= " + getName() + ", surname= " + getSurname()  + ", salary= " + getSalary() +", manager= {"+getManager()+" } "+" ";
    }
    public String getNameManager(){
        if(getManager()!=null)
        {return getManager().getName()+" "+ getManager().getSurname();}
        else
        {return "No manager";}
    }
    public  Employee getTopManager() {
        if (getManager() != null) {
            return getManager().getTopManager();
        } else {
            return this;
        }
    }
}


