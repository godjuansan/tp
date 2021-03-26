package seedu.dictionote.logic.commands;

import seedu.dictionote.logic.commands.enums.UiAction;
import seedu.dictionote.logic.commands.enums.UiActionOption;
import seedu.dictionote.logic.commands.exceptions.CommandException;
import seedu.dictionote.model.Model;

/**
 * Terminates the program.
 */
public class ToggleDictionaryOrientationCommand extends Command {

    public static final String COMMAND_WORD = "toggledividern";

    public static final String MESSAGE_TOGGLE_SUCCESS = "Dictionary Panel Orientation changed";

    @Override
    public CommandResult execute(Model model) throws CommandException {

        model.getGuiSettings().toggleDictionaryPanelOrientation();;

        return new CommandResult(MESSAGE_TOGGLE_SUCCESS, UiAction.OPEN, UiActionOption.DICTIONARY);
    }

}
