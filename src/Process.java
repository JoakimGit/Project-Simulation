public class Process {
    private String name;
    private double input;
    private int iteration_number;
    private Process dest;

    public Process(String name, double input, int iteration_number, Process dest) {
        this.name = name;
        this.input = input;
        this.iteration_number = iteration_number;
        this.dest = dest;
    }

    public Process() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public int getIteration_number() {
        return iteration_number;
    }

    public void setIteration_number(int iteration_number) {
        this.iteration_number = iteration_number;
    }

    public Process getDest() {
        return dest;
    }

    public void setDest(Process dest) {
        this.dest = dest;
    }

    public void forwardInput(Process returnDest) {
        dest.setInput(dest.getInput() + (getInput()*0.8));
        if (this.name.equals(returnDest.getName())) {
            returnDest.setInput(getInput()*0.2);
        }
        else {
            returnDest.setInput(returnDest.getInput() + (getInput()*0.2));
            setInput(0.00);
        }
    }

    public void forwardInput() {
        dest.setInput(getInput());
        setInput(0.00);
    }

    public void printIterations(Process a, Process b, Process c, Process d) {
        for (int i = 1; i <= getIteration_number(); i++) {
            System.out.printf("%-10s %-10.2f %-15.4f %-15.4f %-15.4f %-15.4f %-12.4f \n",
                    Main.itNum, 0.00, a.getInput(), b.getInput(), c.getInput(), d.getInput(), Main.deployment.getInput());
            Main.itNum++;
        }
    }
}
