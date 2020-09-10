public class Main {

    public static int itNum = 1;
    public static Process deployment;

    public static void main(String[] args) {
        Process process2 = new Process("Planning", 0.00, 2, null);
        Process process1 = new Process("Communication", 1.00, 1, process2);
        int itNum = 1;
        double deployment = 0;

        System.out.printf("%-10s %-10s %-15s %-15s %-12s \n", "Iteration", "Project", process1.getName(), process2.getName(), "Deployment");
        System.out.printf("%-10s %-10.2f %-15.4f %-15.4f %-12.4f \n", 0, 1.00, 0.00, process2.getInput(), 0.00);
        while (deployment < 0.999) {
            for (int i = 1; i <= process1.getIteration_number(); i++) {
                System.out.printf("%-10s %-10.2f %-15.4f %-15.4f %-12.4f \n", itNum, 0.00, process1.getInput(), process2.getInput(), deployment);
                itNum++;
            }
            process2.setInput(process1.getInput());
            process1.setInput(0);
            for (int i = 1; i <= process2.getIteration_number(); i++) {
                System.out.printf("%-10s %-10.2f %-15.4f %-15.4f %-12.4f \n", itNum, 0.00, process1.getInput(), process2.getInput(), deployment);
                itNum++;
            }
            deployment += process2.getInput()*0.8;
            process1.setInput(process2.getInput()*0.2);
            process2.setInput(0);
        }
        System.out.printf("%-10s %-10.2f %-15.4f %-15.4f %-12.4f \n", itNum, 0.00, process1.getInput(), process2.getInput(), deployment);
        System.out.printf("Deployment is at: %.6f completion", deployment);

        /*deployment = new Process("Deployment", 0.00, 0, null);
        Process process4 = new Process("Construction", 0.00, 4, deployment);
        Process process3 = new Process("Modelling", 0.00, 2, process4);
        Process process2 = new Process("Planning", 0.00, 2, process3);
        Process process1 = new Process("Communication", 1.00, 1, process2);

        System.out.printf("%-10s %-10s %-15s %-15s %-15s %-15s %-12s \n", "Iteration", "Project",
                process1.getName(), process2.getName(), process3.getName(), process4.getName(), deployment.getName());
        System.out.printf("%-10s %-10.2f %-15.4f %-15.4f %-15.4f %-15.4f %-12.4f \n", 0, 1.00, 0.00, 0.00, 0.00, 0.00, 0.00);

        // Here, completion is set to be after reaching 95%, but can be changed at will.
        while (deployment.getInput() < 0.95) {
            // Print iterations for proc1, then forward its input to the next process and reset it's own.
            process1.printIterations(process1, process2, process3, process4);
            process1.forwardInput();

            // Print iterations for proc2, then forward 80% of its input to the next process and 20% to a previous one.
            process2.printIterations(process1, process2, process3, process4);
            process2.forwardInput(process1);

            // Print iterations for proc3, then forward 80% of its input to the next process and 20% to a previous one.
            process3.printIterations(process1, process2, process3, process4);
            process3.forwardInput(process3);

            // Print iterations for proc4, then forward 80% of its input to the next process and 20% to a previous one.
            process4.printIterations(process1, process2, process3, process4);
            process4.forwardInput(process1);
        }
        System.out.printf("%-10s %-10.2f %-15.4f %-15.4f %-15.4f %-15.4f %-12.4f \n",
                itNum, 0.00, process1.getInput(), process2.getInput(), process3.getInput(), process4.getInput(), deployment.getInput());
        System.out.printf("Deployment is at: %.4f completion", deployment.getInput());*/
    }
}
