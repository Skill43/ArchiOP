package Rewards.Fuck;

import Abstractions.iGameItem;
import Abstractions.ItemGenerator;

public class FuckGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new FuckRewards();
    }
}
