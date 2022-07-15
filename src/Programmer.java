public class Programmer extends PERSON {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        System.out.println("Programmer learn");
    }

    @Override
    public void walk() {
        System.out.println("Programmer walk");
    }

    @Override
    public void eat() {
        System.out.println("Programmer eat");
    }
    public void coding(){
        System.out.println("Programmer coding");
    }

    @Override
    public String toString() {
        return super.toString()+"Companu name-"+companyName;
    }
}
