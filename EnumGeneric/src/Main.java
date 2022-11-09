public class Main {
    public static void main(String[] args) {
        PCpart pc = PCpart.CPU;
        if (pc == PCpart.CPU){
            System.out.println("AMD Ryzen 7 7500x");
            Printer<Double> printer = new Printer<>(7.50000);
            printer.print();

        }
        PCpart pc1 = PCpart.RAM;
        if (pc1 == PCpart.RAM){
            System.out.println("\n16gb");
            Printer<Integer> printer = new Printer<>(1000000);
            printer.print();

        }






    }
}