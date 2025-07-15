public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodu
    public double tax() {
        if (salary < 1000) {
            return 0;
        }
        return salary * 0.03;
    }

    // Bonus hesaplama metodu
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    // Maaş artışı hesaplama metodu
    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    // Bilgileri yazdıran metot
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxBonus = salary - tax + bonus;
        double totalSalary = salaryWithTaxBonus + raise;

        StringBuilder sb = new StringBuilder();
        sb.append("Adı : ").append(name).append("\n");
        sb.append("Maaşı : ").append(salary).append("\n");
        sb.append("Çalışma Saati : ").append(workHours).append("\n");
        sb.append("Başlangıç Yılı : ").append(hireYear).append("\n");
        sb.append("Vergi : ").append(tax).append("\n");
        sb.append("Bonus : ").append(bonus).append("\n");
        sb.append("Maaş Artışı : ").append(raise).append("\n");
        sb.append("Vergi ve Bonuslar ile birlikte maaş : ").append(salaryWithTaxBonus).append("\n");
        sb.append("Toplam Maaş : ").append(totalSalary);

        return sb.toString();
    }
}
