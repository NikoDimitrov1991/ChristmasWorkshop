package command;

import fundamental.WishBoard;

public class GiveMeATouringBike implements ICommand {

    public WishBoard wishBoard;

    public GiveMeATouringBike(WishBoard magicBoard) {
        this.wishBoard = magicBoard;
    }

    @Override
    public void execute() {
        wishBoard.requestToyFromDwarfs("touring bike");
    }
}
