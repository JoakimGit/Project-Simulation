public class Main {

    public static void main(String[] args) {

        Process process1 = new Process();
        Process process2 = new Process();
        process1.setName("Communication");
        process1.setDest(process2);
        process1.setIteration_number(1);
        int itNum = 0;

        process1.setInput(1.00);
        while (process1.getIteration_number() > 0) {
            itNum++;
            System.out.println("Iteration number: " + itNum + " " + process1.getName() + " has input at: " + process1.getInput());
            process1.setIteration_number(process1.getIteration_number() - 1);
        }
    }
}
