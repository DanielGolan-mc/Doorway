package net.danielgolan.doorway.messages.components;

import net.danielgolan.doorway.utils.Emoji;

public final class InteractionButton extends Button {
    private final String identifier;
    private final Button.Color color;
    private InteractionButton(String text, Emoji icon, String identifier, Color color) {
        super(text, icon);
        this.identifier = identifier;
        this.color = color;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Color getColor() {
        return color;
    }
}
