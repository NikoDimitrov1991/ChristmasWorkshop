package command;

import fundamental.WishBoard;

public class GiveMeABarbieDoll implements ICommand {

    public WishBoard wishBoard;

    public GiveMeABarbieDoll(WishBoard wishBoard) {
        this.wishBoard = wishBoard;
    }

    @Override
    public void execute() {
        wishBoard.requestToyFromDwarfs("barbie doll");
    }
}
