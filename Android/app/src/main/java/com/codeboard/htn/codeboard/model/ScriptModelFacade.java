package com.codeboard.htn.codeboard.model;

import java.util.ArrayList;
import java.util.Observer;

public interface ScriptModelFacade {

    /**
     * Add a new script.
     */
    void addScript(Script script);

    /**
     * Load the user's scripts.
     */
    ArrayList<Script> getScripts();

    /**
     * Remove a script.
     */
    void deleteScript(Script script);

    void registerObserver(Observer obsv);

    void removeObserver(Observer obsv);

}
