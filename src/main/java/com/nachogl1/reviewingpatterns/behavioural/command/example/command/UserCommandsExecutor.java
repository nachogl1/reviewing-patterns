package com.nachogl1.reviewingpatterns.behavioural.command.example.command;

import java.util.ArrayList;
import java.util.List;

public class UserCommandsExecutor {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void executeAll() {
        commands.forEach(command -> command.execute());
        commands.clear();
    }



}
