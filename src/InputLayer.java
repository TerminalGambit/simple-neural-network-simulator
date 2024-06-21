/* class InputLayer extends Layer {
    +forwardPass(): void
} */

// import java.util.ArrayList;
// import java.util.List;

public class InputLayer extends Layer {
    public void forwardPass() {
        for (Neuron neuron : neurons) {
            neuron.fire();
        }
    }
}
