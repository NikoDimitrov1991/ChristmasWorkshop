package command;

import fundamental.WishBoard;

public class GiveMeARoadBike implements ICommand {

    public WishBoard wishBoard;

    public GiveMeARoadBike(WishBoard magicBoard) {
        this.wishBoard = magicBoard;
    }

    @Override
    public void execute() {
        wishBoard.requestToyFromDwarfs("road bike");
    }
}
