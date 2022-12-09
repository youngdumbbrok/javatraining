package dev;

class Wipro1 {

    String empName;

    int empId;

    String empDept;

    double empSalary;

    

    Wipro1() {}

    

    Wipro1(String empName, int empId, String empDept) {

        this.empName = empName;

        this.empId = empId;

        this.empDept = empDept;

    }
   

    

    public void employeeInfo() {

        System.out.println("Employee Name: " + empName);

        System.out.println("Employee ID: " + empId);

        System.out.println("Employee Department: " + empDept);


    }

    

    public double getSalary() {

        return empSalary = 10;

    }

}



class WiproTech extends Wipro1 {

    

    WiproTech(String empName, int empId, String empDept) {

        this.empName = empName;

        this.empId = empId;

        this.empDept = empDept;

    }

    

    public double getSalary() {

        return empSalary = 8;

    }

}



class WiproInfo extends Wipro1 {

    

    WiproInfo(String empName, int empId, String empDept) {

        this.empName = empName;

        this.empId = empId;

        this.empDept = empDept;

    }

    

    public double getSalary() {

        return empSalary = 6;

    }

}



class WiproBPO extends Wipro1 {

    

    WiproBPO(String empName, int empId, String empDept) {

        this.empName = empName;

        this.empId = empId;

        this.empDept = empDept;

    }

    

    public double getSalary() {

        return empSalary = 3;

    }

}



class Wipro {



    public static void main(String[] args) {

        Wipro1 w = new Wipro1("Tony Stark", 1, "Manager");

        WiproTech wt = new WiproTech("Steve Rogers", 2, "Software Developer");

        WiproInfo wi = new WiproInfo("Thor Odinson", 3, "Software Tester");

        WiproBPO wb = new WiproBPO("Bruce Banner", 4, "Software Maintenance");
//        w.employeeInfo();
//      wt.employeeInfo();
//        wi.employeeInfo();
//        wb.employeeInfo();
        

        

        System.out.println("Employee Salary in Wipro: " + w.getSalary() + " LPA");

        System.out.println("Employee Salary in WiproTech: " + wt.getSalary() + " LPA");

        System.out.println("Employee Salary in WiproInfo: " + wi.getSalary() + " LPA");

        System.out.println("Employee Salary in WiproBPO: " + wb.getSalary() + " LPA");

    }

}