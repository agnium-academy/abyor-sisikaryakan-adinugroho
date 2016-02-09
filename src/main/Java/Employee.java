/**
 * Created by Adi Nugroho on 2/9/2016.
 */
public class Employee {


    private String firstName;
    private String lastName;
    private String fullName;
    private Gender gender;
    private Byte age;
    private String employment;
    private Integer transportAllowance;
    private Integer basicSalary;
    private String assigment;
    private String address;


    public Employee(String firstName,
                    String lastName,
                    String fullName,
                    Gender gender,
                    Byte age,
                    String employment,
                    Integer transportAllowance,
                    Integer basicSalary,
                    String assigment, String address){

        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = " " + firstName + " " + lastName;
        this.gender = gender;
        this.age = age;
        this.employment = employment.toUpperCase();
        this.transportAllowance = transportAllowance;
        this.basicSalary = basicSalary;
        this.assigment = assigment;
        this.address = address;

    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String firstName, String lastName) {
        this.fullName = " " + firstName + " " + lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public Integer getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(Integer transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public Integer getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Integer basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getAssigment() {
        return assigment;
    }

    public void setAssigment(String assigment) {
        this.assigment = assigment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }





}
