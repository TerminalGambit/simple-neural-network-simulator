/* class BasicNeuron implements Neuron {
    -inputValue: double
    -outputValue: double
    +fire(): void
    +calculateOutput(): double
} */

class BasicNeuron implements Neuron {
    private double inputValue;
    private double outputValue;

    public BasicNeuron(double inputValue, double outputValue) {
        this.inputValue = inputValue;
        this.outputValue = outputValue;
    }

    public void fire() {
        outputValue = calculateOutput();
    }
    
    public double calculateOutput() {
        return inputValue;
    }

    public double getOutputValue() {
        return outputValue;
    }

    public void setInputValue(double inputValue) {
        this.inputValue = inputValue;
    }

    public void setOutputValue(double outputValue) {
        this.outputValue = outputValue;
    }

    public double getInputValue() {
        return inputValue;
    }
}