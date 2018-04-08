package seedu.address.logic.commands;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import seedu.address.model.CalendarEvent.CalendarEvent;
/**Test for AddEvent command*/
public class AddEventCommandTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructor_nullEvent_throwsNullPointerException() {
        thrown.expect(NullPointerException.class);
        new AddEventCommand(null);
    }
    /* Works only on manual testing as it requires authentication by the user.
    @Test
    public void execute_event_addSuccessful() throws Exception {
        CalendarEvent validEvent = new EventBuilder().build();

        CommandResult commandResult = getAddEventCommandForEvent(validEvent).execute();

        assertEquals(String.format(AddEventCommand.MESSAGE_SUCCESS, validEvent), commandResult.feedbackToUser);
    } */

    /**
     * Generates a new AddEventCommand with the details of the given CalendarEvent.
     */
    private AddEventCommand getAddEventCommandForEvent(CalendarEvent event) {
        AddEventCommand command = new AddEventCommand(event);
        return command;
    }
}