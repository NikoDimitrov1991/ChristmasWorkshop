package command;

import fundamental.WishBoard;

public class GiveMeAMountainBike implements ICommand {

    public WishBoard wishBoard;

    public GiveMeAMountainBike(WishBoard magicBoard) {
        this.wishBoard = magicBoard;
    }

    @Override
    public void execute() {
        wishBoard.requestToyFromDwarfs("mountain bike");
    }
}
