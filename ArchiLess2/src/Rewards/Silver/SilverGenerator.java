package Rewards.Silver;

import Abstractions.iGameItem;
import Abstractions.ItemGenerator;



public class SilverGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new SilverRewards();
    }
}