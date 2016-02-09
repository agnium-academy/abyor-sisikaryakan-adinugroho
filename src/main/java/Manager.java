/**
 * Created by Adi Nugroho on 2/5/2016.
 */
public class Manager extends Employee{
    private String categoryManager;



    public Manager(String firstName,
                   String lastName,
                   Gender gender,
                   Byte age,
                   String categoryManager, Integer transportAllow,
                   Integer basicSalary,
                   String assignment,
                   String address){
        super(firstName, lastName, gender, age,
                "Manager " + categoryManager.toUpperCase(),
            transportAllow, basicSalary, assignment, address);
    }

    public String getCategoryManager(){
        return categoryManager;
    }

    public  void setCategoryManager(String categoryManager){
        this.categoryManager = categoryManager;
    }


}
