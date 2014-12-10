package pattern.p004.builder;

public class Person {
    private String name;
    private int age;
    private int sex;
    private String address;
    private String company;
    
    public Person(PersonBuilder personBuilder) {
        // TODO Auto-generated constructor stub
        this.name = personBuilder.name;
        this.age = personBuilder.age;
        this.sex = personBuilder.sex;
        this.address = personBuilder.address;
        this.company = personBuilder.company;
    }
    
    public static PersonBuilder createBuilder() {
        return new PersonBuilder();
    }
    
    public void getInfo() {
        System.out.println("name    : " + this.name);
        System.out.println("age     : " + this.age);
        System.out.println("sex     : " + this.sex);
        System.out.println("address : " + this.address);
        System.out.println("company : " + this.company);
    }
    
    public static class PersonBuilder {
        private String name;
        private int age;
        private int sex;
        private String address;
        private String company;
        
        public PersonBuilder() {
            // TODO Auto-generated constructor stub
        }
        
        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }
        
        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        
        public PersonBuilder setSex(int sex) {
            this.sex = sex;
            return this;
        }
        
        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        
        public PersonBuilder setCompany(String company) {
            this.company = company;
            return this;
        }
        
        public Person build() {
            return new Person(this); 
        }

    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PersonBuilder personBuilder = Person.createBuilder();
        Person person = personBuilder.setName("junneyang").setAge(25).setSex(1).setAddress("ShenZhen, GuangDong").setCompany("BaiDu Ltd.").build();
        person.getInfo();
    }

}
