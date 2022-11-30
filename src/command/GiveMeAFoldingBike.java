package command;

import fundamental.WishBoard;

public class GiveMeAFoldingBike implements ICommand {
    public WishBoard wishBoard;

    public GiveMeAFoldingBike(WishBoard magicBoard) {
        this.wishBoard = magicBoard;
    }

    @Override
    public void execute() {
        wishBoard.requestToyFromDwarfs("folding bike");
    }
}
