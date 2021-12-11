class L3_Exercise_1 {
    public static void main(String[] args) {
        // No.1
        int salary = 300000;
        long worldPopulation = 7500000000L;
        short diceNum = 4;
        char bloodType = 'A';
        float time = 9.87F;

        System.out.println(salary);
        System.out.println(worldPopulation);
        System.out.println(diceNum);
        System.out.println(bloodType);
        System.out.println(time);

        // No.2
        byte b = 0;
        int i = 10;
        b = (byte)i;

        System.out.println("b = " + b);
        System.out.println("i = " + i);

        float f = 1.0F;
        double d = 3.14159;
        f = (float)d;

        System.out.println("f = " + f);
        System.out.println("d = " + d);
    }
}