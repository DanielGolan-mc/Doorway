package net.danielgolan.doorway.messages.components;

public sealed class MentionableSelect extends Select permits RoleSelect, UserSelect {
    protected MentionableSelect(String text) {
        super(text);
    }
}
