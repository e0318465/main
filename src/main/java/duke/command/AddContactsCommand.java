package duke.command;

import duke.storage.Storage;
import duke.task.ContactList;
import duke.task.Contacts;
import duke.task.TaskList;
import duke.ui.Ui;

import java.io.IOException;

/**
 * Represents a command that adds contacts.
 */
//@@author e0318465
public class AddContactsCommand extends Command {
    protected Contacts contactObj;
    protected ContactList contactList;
    protected Ui ui = new Ui();

    /**
     * Creates a command with the specified contact.
     *
     * @param contactObj The contacts to be added.
     * @param contactList The list of contacts.
     */
    public AddContactsCommand(Contacts contactObj, ContactList contactList) {
        this.contactObj = contactObj;
        this.contactList = contactList;
    }

    /**
     * Adds the user input to a list of contacts.
     *
     * @param items The task list that contains a list of tasks.
     * @param ui To tell the user that it is executed successfully.
     */
    @Override
    public void execute(TaskList items, Ui ui) {
        contactList.add(contactObj);
        ui.showAddedContact(contactList);
    }

    /**
     * Executes a command that adds the contact into contact list and outputs the result (GUI).
     *
     * @param items The task list that contains a list of tasks.
     * @param ui To tell the user that it is added successfully.
     * @return A string value to be output to GUI.
     */
    @Override
    public String executeGui(TaskList items, Ui ui) {
        contactList.add(contactObj);
        String str = ui.showAddedContactGui(contactList);
        return str;
    }

    /**
     * Executes a command that overwrites existing storage with the updated task list.
     * (Not in use)
     *
     * @param items The task list that contains a list of tasks.
     * @param ui To tell the user that it is executed successfully.
     * @param storage The storage to be overwritten.
     */
    @Override
    public void executeStorage(TaskList items, Ui ui, Storage storage) throws IOException {
    }
}