class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0, "医者");
        Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0, "教師");

        person1.setMiddleName("Claire");
        person1.printData();
        System.out.println("----------------------");
        person2.printData();
        System.out.println("----------------------");
        person1.setJob("獣医");
        System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");
    }
}