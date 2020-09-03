public class Process {
    private String name;
    private double input;
    private double output;
    private int iteration_number;
    private int iteration_finish;
    private String dest;

    public Process(String name, int input, int iteration_number, int iteration_finish, double output, String dest) {
        this.name = name;
        this.input = input;
        this.iteration_number = iteration_number;
        this.iteration_finish = iteration_finish;
        this.output = output;
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

    public void setInput(int input) {
        this.input = input;
    }

    public int getIteration_number() {
        return iteration_number;
    }

    public void setIteration_number(int iteration_number) {
        this.iteration_number = iteration_number;
    }

    public int getIteration_finish() {
        return iteration_finish;
    }

    public void setIteration_finish(int iteration_finish) {
        this.iteration_finish = iteration_finish;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}