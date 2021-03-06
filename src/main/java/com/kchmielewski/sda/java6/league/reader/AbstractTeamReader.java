package com.kchmielewski.sda.java6.league.reader;

import com.kchmielewski.sda.java6.league.model.Team;

import java.io.File;

abstract class AbstractTeamReader implements TeamReader {
    protected File getFile(String path) {
        if (path == null) {
            throw new IllegalArgumentException("Path cannot be null.");
        }
        return new File(path);
    }

    protected Team createTeam(File file) {
        return new Team(file.getName().replace(".txt", ""));
    }
}
