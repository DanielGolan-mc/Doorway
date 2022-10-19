package net.danielgolan.doorway.messages.components;

import net.danielgolan.doorway.utils.Emoji;

public final class IdentitySelect extends Select {
    private final Option[] options;
    private IdentitySelect(String text, Option[] options) {
        super(text);
        this.options = options;
    }

    public Option[] getOptions() {
        return options;
    }

    public record Option(String text, String id, Emoji icon, String subtext) { }
}
