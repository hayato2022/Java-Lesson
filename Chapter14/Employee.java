public class Employee extends Human {
    private String department;

    public Employee(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    public String getProfile(){
        String profile = "年齢は" + this.age + "歳です。";
        profile += "サラリーマンで、部署は" + this.department + "です。";
        return profile;
    }
}