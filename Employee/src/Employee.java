
public class Employee {
    private String name;
    public double salary;
    private int workHours,hireYear;

    Employee(int hireYear, int workHours, double salary, String name){
        this.name = name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        if(this.salary>=1000){
            return this.salary*0.03;
        }return 0.0;
    }public double bonus() {
        int exstraHours =this.workHours -40;
        if(exstraHours>0){
            return 30*exstraHours;
        }return 0.0;

    }public double increase () {
        int year = 2021-hireYear;
        if(year<10){
            return salary*0.05;
        }else if(year>=10 && year<20 ){
            return salary*0.10;
        }else{
            return salary*0.15;
        }
    }public void toString(Employee emp) {
        System.out.println("Adı :" + emp.name);
        System.out.println("Maaşı :" + emp.salary);
        System.out.println("Çalışma saati :" + emp.workHours);
        System.out.println("Başlangıç yılı :" + emp.hireYear);
        System.out.println("Vergi :"+ emp.tax());
        System.out.println("Bonus :"+ emp.bonus());
        System.out.println("Maaş Artışı :"+ emp.increase());
        double vergiVeBonuslarlaBirlikteMaas =emp.salary-emp.tax()+emp.bonus();
        System.out.println("Vergi ve bonuslarla birlikte maaş : " +vergiVeBonuslarlaBirlikteMaas);
        System.out.println("Toplam maaş : " +(emp.salary-emp.tax()+emp.bonus()+emp.increase()));

    }


}
