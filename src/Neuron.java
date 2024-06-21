/* interface Neuron {
    +fire(): void
    +calculateOutput(): double
} */

import java.util.List;

public interface Neuron {
    void fire();
    double calculateOutput();
    double getOutput();
    List<Double> getWeights();
    void setWeights(List<Double> weights);
    double getBias();
    void setBias(double bias);
}
