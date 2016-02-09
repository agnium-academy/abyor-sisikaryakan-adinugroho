import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Adi Nugroho on 2/9/2016.
 */
public class Supervisor extends Employee {

    private Employee manager;
    private String categorySupervisor;
    private Integer holidayAllowance;
    private Integer healthBenefits;
    private String studyComparatif;


    //    Integer tunjanganPenginapan;
//    Integer tunjanganInternet;

    public Supervisor(Employee manager,
                      String firstName,
                      String lastName,
                      String categorySupervisor,
                      Gender gender, Byte age,
                      Integer transportAllowance,
                      Integer holidayAllowance,
                      Integer healthBenefits,
                      String studyComparatif,
                      Integer basicSalary,
                      String assignment, String address){
        super(firstName, lastName, gender, age,
                "SUPERVISOR " + categorySupervisor.toUpperCase(),
                transportAllowance,
                basicSalary, assignment, address);

        this.manager = manager;
        this.categorySupervisor = categorySupervisor;
        this.holidayAllowance = holidayAllowance;
        this.healthBenefits = healthBenefits;
        this.studyComparatif = studyComparatif;
    }


//
//    public Supervisor(String posisiEmployees){
//        this.posisiEmployee = posisiEmployees;
//    }
//
//    public Supervisor(Integer tunjanganInternet,
//                      Integer tunjanganPenginapan){
//        this.tunjanganInternet = tunjanganInternet;
//        this.tunjanganPenginapan = tunjanganPenginapan;
//
//    }
//
//    //    @Override
//    public boolean Assign(String Lokasi, String JobDesc){
//        throw new NotImplementedException();
//    }
//
//    public boolean Masuk(){
//        throw new NotImplementedException();
//    }
//
//



    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getCategorySupervisor() {
        return categorySupervisor;
    }

    public void setCategorySupervisor(String categorySupervisor) {
        this.categorySupervisor = categorySupervisor;
    }

    public Integer getHolidayAllowance() {
        return holidayAllowance;
    }

    public void setHolidayAllowance(Integer holidayAllowance) {
        this.holidayAllowance = holidayAllowance;
    }

    public Integer getHealthBenefits() {
        return healthBenefits;
    }

    public void setHealthBenefits(Integer healthBenefits) {
        this.healthBenefits = healthBenefits;
    }

    public String getStudyComparatif() {
        return studyComparatif;
    }

    public void setStudyComparatif(String studyComparatif) {
        this.studyComparatif = studyComparatif;
    }

}
