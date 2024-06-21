/* class BasicNeuron implements Neuron {
    -inputValue: double
    -outputValue: double
    +fire(): void
    +calculateOutput(): double
} */

import java.util.List;
import java.util.ArrayList;

class BasicNeuron implements Neuron {
    private double inputValue;
    private double outputValue;
    private List<Double> weights;
    private double bias;

    // Constructor for initializing neuron with input and output values
    public BasicNeuron(double inputValue, double outputValue) {
        this.inputValue = inputValue;
        this.outputValue = outputValue;
        this.weights = new ArrayList<>();
        this.bias = 0.0; // Initialize bias to zero or any default value
    }

    // Method to trigger calculation of output
    public void fire() {
        outputValue = calculateOutput();
    }
    
    // Basic output calculation
    public double calculateOutput() {
        // Example calculation: weighted sum + bias
        double sum = 0;
        for (int i = 0; i < weights.size(); i++) {
            sum += weights.get(i) * inputValue;
        }
        return sum + bias;
    }

    // Getters and setters
    public double getInputValue() {
        return inputValue;
    }

    public void setInputValue(double inputValue) {
        this.inputValue = inputValue;
    }

    public double getOutputValue() {
        return outputValue;
    }

    public void setOutputValue(double outputValue) {
        this.outputValue = outputValue;
    }

    @Override
    public double getOutput() {
        return outputValue;
    }

    @Override
    public List<Double> getWeights() {
        return weights;
    }

    @Override
    public void setWeights(List<Double> weights) {
        this.weights = new ArrayList<>(weights);
    }

    @Override
    public double getBias() {
        return bias;
    }

    @Override
    public void setBias(double bias) {
        this.bias = bias;
    }
}
