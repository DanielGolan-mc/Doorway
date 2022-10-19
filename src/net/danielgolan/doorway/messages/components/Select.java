package net.danielgolan.doorway.messages.components;

public sealed class Select extends Component permits IdentitySelect, MentionableSelect {
    protected Select(String text) {
        super(text);
    }
}
