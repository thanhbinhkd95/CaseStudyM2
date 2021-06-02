package model;


public class Customer implements Comparable<Customer> {
    private String idCustomer;
    private String customerName;
    private String birthday;
    private String gender;
    private String identityCardNumber;
    private String phoneNumber;
    private String email;
    private String CustomerType;
    private String address;
    Service serviceOfCustomer;

    public Customer(String string , String s , String string1 , String s1 , String string2 , String s2 , String string3 , String s3) {
    }

    public Customer(String idCustomer , String customerName , String birthday ,
                    String gender , String identityCardNumber , String phoneNumber ,
                    String email , String customerType , String address , Service serviceOfCustomer) {
        this.idCustomer = idCustomer;
        this.customerName = customerName;
        this.birthday = birthday;
        this.gender = gender;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        CustomerType = customerType;
        this.address = address;
        this.serviceOfCustomer = serviceOfCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getServiceOfCustomer() {
        return serviceOfCustomer;
    }

    public void setServiceOfCustomer(Service serviceOfCustomer) {
        this.serviceOfCustomer = serviceOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", customerName='" + customerName + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", identityCardNumber='" + identityCardNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", CustomerType='" + CustomerType + '\'' +
                ", address='" + address + '\'' +
                ", serviceOfCustomer=" + serviceOfCustomer +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        {
            int result = this.customerName.compareTo(o.customerName);
            if (result == 0) {
                int yearCustomerFirst = Integer.parseInt(this.birthday.split("/")[2]);
                int yearCustomerSecond = Integer.parseInt(o.birthday.split("/")[2]);
                result = yearCustomerFirst - yearCustomerSecond;
            }
            return 0;
        }
    }
}