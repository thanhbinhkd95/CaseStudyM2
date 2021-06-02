package model;

public class Employee implements Comparable<Employee> {
    private String idEmployee;
    private String nameEmployee;
    private String birthDay;
    private String identityCardNumber;
    private String phoneNumber;
    private String email;
    private String qualifications;
    private String position;
    private Double salary;
    private String workingDepartment;

    public Employee(String idEmployee , String nameEmployee , String birthDay ,
                    String identityCardNumber , String phoneNumber , String email ,
                    String qualifications , String position , Double salary , String workingDepartment) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.birthDay = birthDay;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.qualifications = qualifications;
        this.position = position;
        this.salary = salary;
        this.workingDepartment = workingDepartment;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthday() {
        return birthDay;
    }

    public void setBirthday(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getWorkingDepartment() {
        return workingDepartment;
    }

    public void setWorkingDepartment(String workingDepartment) {
        this.workingDepartment = workingDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", birthDay=" + birthDay +
                ", identityCardNumber='" + identityCardNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", workingDepartment='" + workingDepartment + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        {
            int result = this.nameEmployee.compareTo(o.nameEmployee);
            if (result == 0) {
                int yearCustomerFirst = Integer.parseInt(this.birthDay.split("/")[2]);
                int yearCustomerSecond = Integer.parseInt(o.birthDay.split("/")[2]);
                result = yearCustomerFirst - yearCustomerSecond;
            }
            return 0;
        }
    }
}