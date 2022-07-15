public class Dancer extends PERSON{
    private String groupName;
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        System.out.println("Dancer learn");
    }

    @Override
    public void walk() {
        System.out.println("Dancer walk");
    }

    @Override
    public void eat() {
        System.out.println("Dancer eat");
    }
    public void dancing(){
        System.out.println("Dancer dancing");
    }

    @Override
    public String toString() {
        return super.toString()+"groupName-"+groupName;
    }
}
