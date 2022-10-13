public class MainJava {
    public static void main(String[] args) {
        int a = 22;
        StudentJava st = null;
        if (st !=null){
            st.getAge();
        }
        StudentJava student = new StudentJava(
                23,
                "Bob",
                "Esponja");
        System.out.println("Hello World! " + st + " " + a + " clicks");

//        int sum = CalculatorJava.sum(1,2);
    }
}

