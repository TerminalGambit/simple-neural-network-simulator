/* interface Neuron {
    +fire(): void
    +calculateOutput(): double
} */

import java.util.List;

public interface Neuron {
    public void fire();
    public double calculateOutput();
    double getOutput();
    List<Double> getWeights();
    double getBias();
}
