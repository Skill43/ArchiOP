package Rewards.Crystal;

import Abstractions.iGameItem;
import Abstractions.ItemGenerator;

public class CrystalGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new CrystalRewards();
    }
}
