package Rewards.Gold;

import Abstractions.iGameItem;
import Abstractions.ItemGenerator;


public class GoldGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new GoldRewards();
    }
}
