/* abstract class Layer {
    #neurons: List<Neuron>
    +addNeuron(neuron: Neuron): void
    +forwardPass(): void
} */

import java.util.ArrayList;
import java.util.List;

public abstract class Layer {
    protected List<Neuron> neurons = new ArrayList<>();
    public abstract void forwardPass();
    public abstract void backwardPass();
    public List<Neuron> getNeurons() {
        return neurons;
    }
}
