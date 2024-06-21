/* class Network {
    -layers: List<Layer>
    +addLayer(layer: Layer): void
    +train(inputs: double[], targets: double[]): void
    +calculateOutput(inputs: double[]): double[]
} */

import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<Layer> layers = new ArrayList<Layer>();

    public void addLayer(Layer layer) {
        layers.add(layer);
    }

    public void train(double[] inputs, double[] targets) {
        // Forward pass
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).forwardPass();
        }

        // Backward pass
        for (int i = layers.size() - 1; i >= 0; i--) {
            layers.get(i).backwardPass();
        }
    }

    public double[] calculateOutput(double[] inputs) {
        // Forward pass
        for (int i = 0; i < layers.size(); i++) {
            layers.get(i).forwardPass();
        }

        // Get output from output layer
        OutputLayer outputLayer = (OutputLayer) layers.get(layers.size() - 1);
        List<Neuron> outputNeurons = outputLayer.getNeurons();
        double[] output = new double[outputNeurons.size()];
        for (int i = 0; i < outputNeurons.size(); i++) {
            output[i] = outputNeurons.get(i).getOutput();
        }

        return output;
    }

    public void printNetwork() {
        for (int i = 0; i < layers.size(); i++) {
            System.out.println("Layer " + i);
            List<Neuron> neurons = layers.get(i).getNeurons();
            for (int j = 0; j < neurons.size(); j++) {
                System.out.println("Neuron " + j);
                Neuron neuron = neurons.get(j);
                System.out.println("Weights: " + neuron.getWeights());
                System.out.println("Bias: " + neuron.getBias());
            }
        }
    }
}
