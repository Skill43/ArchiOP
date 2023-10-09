package Core;

import Abstractions.ItemGenerator;
import Rewards.Crystal.CrystalGenerator;
import Rewards.Fuck.FuckGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Core {
    // Логика игры
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new CrystalGenerator());
        generatorList.add(new FuckGenerator());

        // Индексы генераторов.
        int lastIndex = generatorList.indexOf(generatorList.get(generatorList.size()-1));
        int min = 0;
        int max = lastIndex+1;

        for (int i = 0; i < 1; i++) {
            // Выбор одного из генераторов
            int idx = ThreadLocalRandom.current().nextInt(min, max);
            ItemGenerator myGenerator = generatorList.get(idx);
            System.out.println(myGenerator.openReward());
        }
    }
}