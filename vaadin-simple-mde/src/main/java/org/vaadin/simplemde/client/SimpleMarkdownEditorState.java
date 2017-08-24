package org.vaadin.simplemde.client;

import com.vaadin.shared.ui.JavaScriptComponentState;
import org.vaadin.simplemde.SimpleMarkdownToolbarIcon;

import java.util.ArrayList;
import java.util.List;

/**
 * Transfer states to JavaScript connector
 *
 * @author Marten Prieß (http://www.rocketbase.io)
 * @version 1.0
 */
public class SimpleMarkdownEditorState extends JavaScriptComponentState {

    public int changeTimeOut = 250;

    public boolean showStatus = true;

    public String markdownText = "";

    public List<SimpleMarkdownToolbarIcon> hideIcons = new ArrayList<>();

}