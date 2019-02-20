package algorithm.HackerRank.sort_algorithm.ga.jenetics;

import org.jenetics.BitChromosome;
import org.jenetics.BitGene;
import org.jenetics.Genotype;

import java.util.function.Function;

public class KnapsackFF implements Function<Genotype<BitGene>, Double> {
    private KnapsackItem[] items;
    private double size;

    public KnapsackFF(KnapsackItem[] items, double size) {
        this.items = items;
        this.size = size;
    }

    @Override
    public Double apply(Genotype<BitGene> gt) {
        KnapsackItem sum = ((BitChromosome) gt.getChromosome()).ones()
            .mapToObj(i -> items[i])
            .collect(KnapsackItem.toSum());
        return sum.size <= this.size ? sum.value : 0;
    }
}
