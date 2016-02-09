/**
 * Created by Adi Nugroho on 2/9/2016.
 */
public class MainCompany {

    public static void main(String [] args){

        Employee tegar = registerManager("Mochamad" , "Tegar" , "Utomo", Gender.MALE,
                (byte) 24, "Drilling", 30000000, 30000000, "xxxx", "Cilacap");
        Employee iqbal = registerSupervisor("Mochamad" , "Iqbal", Gender.MALE,
                (byte) 22, 2000000, 30000000, 30000000, "xxxx", "2000000");

        Employee dwi = registerStaff(iqbal, "dwi", "Indi", Gender.FEMALE, (byte) 25,
                "Drilling Riau", 5000000, 5000000, 2000000, "oke", "atasan");

        return ok();

    }

    private static Employee registerStaff(Employee supervisor,
                                          String firstName, String lastName, Gender gender,
                                          Byte age, String categoryStaff,
                                          Integer lodgmentAllowance,
                                          Integer internetAllowance,
                                          Integer transportAllowance,
                                          Integer basicSalary,
                                          String assignment,
                                          String address) {

        Employee staff = new Staff(
                supervisor,
                firstName,
                lastName, gender,
                (byte) age, categoryStaff,lodgmentAllowance,internetAllowance,
                transportAllowance, basicSalary, assignment, address
        );

        return staff;
    }

    /**
     *
     * @param manager
     * @param firstName
     * @param lastName
     * @param categorySupervisor
     * @param gender
     * @param age
     * @param transportAllowance
     * @param holidayAllowance
     * @param healthBenefits
     * @param studyComparatif
     * @param basicSalary
     * @param assignment
     * @param address
     * @return
     */
    private static Employee registerSupervisor(Employee manager, String firstName,
                                               String lastName,
                                               String categorySupervisor,
                                               Gender gender, Byte age,
                                               Integer transportAllowance,
                                               Integer holidayAllowance,
                                               Integer healthBenefits,
                                               String studyComparatif,
                                               Integer basicSalary,
                                               String assignment, String address) {
        Employee supervisor = new Supervisor(
                manager,
                firstName, lastName,
                categorySupervisor, gender, age,
                transportAllowance, holidayAllowance,
                healthBenefits, studyComparatif,
                basicSalary, assignment, address);

        return supervisor;
    }

    /**
     * Pada method ini terdapat proses objek employe
     * yang bentuknya managerdrilling.
     *
     * @param firstName
     * @param lastName
     * @param gender
     * @param age
     * @param categoryManager
     * @param transportAllowance
     * @param basicSalary
     * @param assignment
     * @param address
     * @return Employee yang merupakan manager
     */
    private static Employee registerManager(String firstName, String lastName,
                                            Gender gender, Byte age,
                                            String categoryManager, Integer transportAllowance,
                                            Integer basicSalary, String assignment,
                                            String address) {
        Employee manager = new Manager(
                firstName, lastName,
                gender, age,
                categoryManager,
                transportAllowance,
                basicSalary, assignment, address);

        return manager;
    }
}
