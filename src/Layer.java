/* abstract class Layer {
    #neurons: List<Neuron>
    +addNeuron(neuron: Neuron): void
    +forwardPass(): void
} */

import java.util.ArrayList;
import java.util.List;

public abstract class Layer {
    protected List<Neuron> neurons = new ArrayList<Neuron>();

    public void addNeuron(Neuron neuron) {
        neurons.add(neuron);
    }

    public abstract void forwardPass();
}
