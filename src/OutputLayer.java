/* class OutputLayer extends Layer {
    +forwardPass(): void
} */

// import java.util.ArrayList;
// import java.util.List;

public class OutputLayer extends Layer {
    public void forwardPass() {
        for (Neuron neuron : neurons) {
            neuron.fire();
        }
    }

    public void backwardPass() {
        for (Neuron neuron : neurons) {
            neuron.calculateOutput();
        }
    }
}
