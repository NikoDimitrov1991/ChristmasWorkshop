package command;

import fundamental.WishBoard;

public class GiveMeAWoodenDoll implements ICommand {

    public WishBoard wishBoard;

    public GiveMeAWoodenDoll(WishBoard magicBoard) {
        this.wishBoard = magicBoard;
    }

    @Override
    public void execute() {
        wishBoard.requestToyFromDwarfs("wooden doll");
    }
}
