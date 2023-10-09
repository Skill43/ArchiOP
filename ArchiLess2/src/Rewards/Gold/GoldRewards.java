package Rewards.Gold;

import Abstractions.iGameItem;

public class GoldRewards implements iGameItem {
    @Override
    public String open() {
        return "Gold";
    }
}
