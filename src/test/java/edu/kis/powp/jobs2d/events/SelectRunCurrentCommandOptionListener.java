package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.RecordingDriver;
import edu.kis.powp.jobs2d.features.CommandsFeature;

public class SelectRunCurrentCommandOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectRunCurrentCommandOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand command = CommandsFeature.getDriverCommandManager().getCurrentCommand();
        if (command == null) {
            return;
        }

        RecordingDriver rec = driverManager.getRecordingDriver();
        boolean previousState = rec.isRecordingEnabled();
        rec.setRecordingEnabled(false);
        try {
            command.execute(driverManager.getCurrentDriver());
        } finally {
            rec.setRecordingEnabled(previousState);
        }
    }
}
